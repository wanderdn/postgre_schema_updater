package com.x5.bigdata.assortment.schema_actualizator.service;

import com.x5.bigdata.assortment.schema_actualizator.config.JdbcClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ActualizatorService implements ApplicationListener<ContextRefreshedEvent> {
    private final JdbcTemplate client;
    private final String filePath;
    private final FileWriter fileWriter;

    public ActualizatorService(JdbcClient client, @Value("${file.path}") String filePath) throws IOException {
        this.client = client.jt();
        this.filePath = filePath;
        this.fileWriter = new FileWriter(new File(filePath));
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        ArrayList<String> sqlColumnNames = new ArrayList<>(Arrays.asList("column_name", "column_default", "is_nullable", "data_type", "character_maximum_length", "description"));
        List<String> mdColumns = new ArrayList<>(Arrays.asList("Поле", "Значение по умолчанию", "Может быть null", "Тип данных", "Максимальная длина", "Описание"));
        client.query("select schema_name from information_schema.schemata", (rs, rowNum) ->
                rs.getString("schema_name")).stream().filter(schema -> !schema.contains("pg_"))
                .filter(schema -> !schema.contains("temp") && !schema.contains("information") && !schema.contains("tmp"))
                .forEach(schema -> {
                    try {
                        fileWriter.append("\n\n### Schema ".concat(schema).concat("\n\n"));

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    client.execute("alter role \"srv.assortment\" set search_path =".concat(schema));

                    client.query("\n" +
                            "select table_name  from information_schema.tables\n" +
                            "where table_schema=".concat("\'" + schema + "\'"), (rs1, rowNum) ->
                            rs1.getString("table_name"))
                            .forEach(table -> {
                                try {
                                    fileWriter.append("\n### Table ".concat(table).concat("\n\n"));
                                    List<String> descriptionList = client.query(
                                            "select description from pg_catalog.pg_statio_all_tables\n" +
                                                    "inner join  pg_catalog.pg_description on relid = objoid\n" +
                                                    "where relname = \'" + table + "\' and objsubid = 0;" + "\n", (rs, rn) ->
                                                    rs.getString("description"));
                                    if (descriptionList.size() > 0) {
                                        fileWriter.append(descriptionList.get(0).replaceAll("[\"\\]\\[\"]", "") + "\n\n");
                                    } else {
                                        fileWriter.append("Таблица еще в процессе описания \n\n");
                                    }
                                    fileWriter.append(String.join(" | ", mdColumns) + "\n");
                                    fileWriter.append("--- | --- | --- | --- | --- | --- \n");
                                    System.out.println(table);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                List<List<String>> columns = client.query("SELECT \n" +
                                                "                a.column_name,\n" +
                                                "                a.column_default,\n" +
                                                "                a.is_nullable,\n" +
                                                "                a.data_type,\n" +
                                                "                a.character_maximum_length,\n" +
                                                "                (\n" +
                                                "                        SELECT pg_catalog.col_description(c.oid, a.ordinal_position::int)\n" +
                                                "                        FROM pg_catalog.pg_class c\n" +
                                                "                        WHERE c.oid     = (SELECT a.table_name::regclass::oid) and c.relname = a.table_name\n" +
                                                "                ) as description\n" +
                                                "    FROM        information_schema.columns a\n" +
                                                "    WHERE       table_schema = " + "\'" + schema + "\'" + " and table_name =" + "\'" + table + "\'" + "\n" +
                                                "    ORDER BY    table_name,ordinal_position;", (rs2, rowNum) ->
                                        {
                                            List<String> list = new ArrayList<>();
                                            sqlColumnNames.forEach(columnName ->
                                            {
                                                try {
                                                    list.add(rs2.getString(columnName));
                                                } catch (SQLException e) {
                                                    e.printStackTrace();
                                                }
                                            });

                                            return list;
                                        }
                                );
                                columns.forEach(column -> {
                                    try {
                                        fileWriter.append(String.valueOf(column).replace("[", "").replace("]", "")
                                                .replace("[", "")
                                                .replaceAll(", ", " | ") + "\n");

                                    } catch (IOException e) {
                                        System.out.println(column);
                                        e.printStackTrace();
                                    }
                                });
                            });

                });
        try {
            client.execute("alter role \"srv.assortment\" set search_path =public");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
