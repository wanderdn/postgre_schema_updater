package com.x5.bigdata.assortment.schema_actualizator.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class JdbcClient {


    @Value("${postgres.url}")
    private String url;
    @Value("${postgres.user}")
    private String user;
    @Value("${password}")
    private String password;

    private DataSource getds() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setPassword(password);
        dataSource.setUsername(user);
        dataSource.setUrl(url);
        return dataSource;
    }


    public JdbcTemplate jt() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getds());
        return jdbcTemplate;
    }
}
