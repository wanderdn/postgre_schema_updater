

### Schema public


### Table products_tmp

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
plu_id | null | YES | character varying | null | null
plu_name | null | YES | character varying | null | null
ph3_id | null | YES | character varying | null | null
ph4_id | null | YES | character varying | null | null
brand_id | null | YES | text | null | null
brand_name | null | YES | text | null | null
stm | null | YES | boolean | null | null
ps_id | null | YES | integer | null | null
is_dendrogam | null | YES | boolean | null | null

### Table manual_corrections

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | YES | integer | null | null
macro | null | YES | text | null | null
change_ratio | null | YES | double precision | null | null

### Table price_segments_aggregations

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | null
assortment_cluster_code | null | NO | character varying | null | null
cluster_id | null | YES | integer | null | null
assortment_level | null | NO | integer | null | null
price_segment_id | null | YES | integer | null | null
exist | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null

### Table exclusion_assortment_cluster_code

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_cluster_code | null | NO | character varying | null | null
assortment_id | null | NO | integer | null | null

### Table through_indication_cpi

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('"through_indication_сpi_id_seq"'::regclass) | NO | integer | null | null
assortment_id | null | NO | integer | null | null
plu_code | null | NO | character varying | 100 | null
through | null | NO | boolean | null | null

### Table assortment_ui4

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
ui4_code | null | NO | character varying | null | null
assortment_id | null | NO | integer | null | null

### Table status_summary

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('status_summary_id_seq'::regclass) | NO | integer | null | null
version | null | YES | integer | null | null
fact | null | YES | integer | null | null
assortment_cluster_code | null | YES | character varying | 255 | null
assortment_id | null | YES | integer | null | null
cluster_id | null | YES | integer | null | null
assortment_level | null | YES | integer | null | null
macro_code | null | YES | character varying | 255 | null

### Table cdt

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
mat_a | null | YES | character varying | null | null
mat_b | null | YES | character varying | null | null
clientsnuma | null | YES | integer | null | null
clientsnumb | null | YES | integer | null | null
clientnum1checka | null | YES | integer | null | null
clientnum1checkb | null | YES | integer | null | null
clients_ab | null | YES | integer | null | null
clientsnumt | null | YES | integer | null | null
categorclientsnum | null | YES | bigint | null | null
checksnum | null | YES | integer | null | null
a_checknum | null | YES | integer | null | null
b_checknum | null | YES | integer | null | null
clientnum1check | null | YES | integer | null | null
a_numofclientsofxy | null | YES | double precision | null | null
b_numofclientsofnonxy | null | YES | bigint | null | null
c_numofclientsofxnony | null | YES | double precision | null | null
d_numofclientsofynonx | null | YES | double precision | null | null
e_shareofjointchecks | null | YES | double precision | null | null
a_norm | null | YES | double precision | null | null
b_norm | null | YES | double precision | null | null
c_norm | null | YES | double precision | null | null
d_norm | null | YES | double precision | null | null
dist_nm | null | YES | double precision | null | null
assortment_id | null | YES | integer | null | null

### Table plu_shop_contains

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
plu_code | null | NO | character varying | null | null
contains | null | YES | boolean | null | null
assortment_level | null | NO | integer | null | null
cluster_id | null | NO | integer | null | null
macro_code | null | NO | character varying | null | null
assortment_cluster_code | null | NO | character varying | null | null
assortment_id | null | NO | integer | null | null

### Table product_cluster_aggregations

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
plu_code | null | YES | text | null | null
assortment_cluster_code | null | YES | text | null | null
cluster_id | null | YES | integer | null | null
macro_code | null | YES | text | null | null
losses | null | YES | double precision | null | null
checks | null | YES | double precision | null | null
assortment_id | null | NO | integer | null | null
supplies | null | YES | double precision | null | null

### Table strategy_priorities

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('strategy_priorities_id_seq'::regclass) | NO | integer | null | null
priority | null | NO | text | null | null
assortment_id | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null

### Table strategy_conclusion

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('strategy_conclusion_id_seq'::regclass) | NO | integer | null | null
conclusion | null | NO | text | null | null
assortment_id | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null

### Table macro_aggregations

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | null
assortment_cluster_code | null | YES | character varying | null | null
margin_ambition | null | YES | bigint | null | null
rto_ambition | null | YES | bigint | null | null
estimate_strategy | null | YES | integer | null | null
estimate_filling | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null
manual_correction | null | YES | integer | null | null
rto_retro | null | YES | double precision | null | null
margin_retro | null | YES | double precision | null | null

### Table output_from_reallocator

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('output_from_reallocator_id_seq'::regclass) | NO | integer | null | null
assortment_id | null | YES | integer | null | null
macro_code | null | NO | character varying | null | null
indicator | null | NO | character varying | null | null
assortment_level | null | YES | integer | null | null
value | null | NO | integer | null | null

### Table users_user_permissions

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('users_user_permissions_id_seq'::regclass) | NO | integer | null | null
users_id | null | NO | integer | null | null
permission_id | null | NO | integer | null | null

### Table users_groups

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('users_groups_id_seq'::regclass) | NO | integer | null | null
users_id | null | NO | integer | null | null
group_id | null | NO | integer | null | null

### Table assortment_recommendation

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
plu | null | NO | character varying | null | null
assortment_level | null | NO | integer | null | null
cluster_id | null | NO | integer | null | null
version | null | NO | integer | null | null
assortment_id | null | NO | integer | null | null
macro_code | null | NO | character varying | null | null
through | null | YES | boolean | null | null
can_be_through_plu | null | YES | boolean | null | null
through_plu_part | null | YES | double precision | null | null
can_be_through_plu_part | null | YES | double precision | null | null
necessarily_code | 0 | NO | integer | null | null
assortment_cluster | null | NO | character varying | null | null
partly_through | null | YES | integer | null | null

### Table share_through_assortment

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('share_through_assortment_id_seq'::regclass) | NO | integer | null | null
assortment_id | null | NO | integer | null | null
assortment_level | null | NO | integer | null | null
value | null | NO | integer | null | null

### Table user_categories

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('user_categories_id_seq'::regclass) | NO | integer | null | null
user_id | null | NO | integer | null | null
ui4_code | null | NO | character varying | null | null

### Table tree_cdt

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('tree_cdt_id_seq'::regclass) | NO | integer | null | null
json | null | YES | jsonb | null | null
tree_last_update | null | NO | timestamp with time zone | null | null
assortment_id | null | NO | integer | null | null
params | null | YES | jsonb | null | null
params_last_update | null | NO | timestamp with time zone | null | null
user_id | null | YES | integer | null | null
is_active | false | YES | boolean | null | Признок активной версии

### Table product_aggregations

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | null
plu_code | null | NO | character varying | 100 | null
macro_code | null | YES | character varying | null | null
shops_percentage | null | YES | integer | null | null
shops_count | null | YES | integer | null | null
version | null | YES | integer | null | null

### Table cpi

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | null
plu_code | null | NO | character varying | null | null
through | null | YES | double precision | null | null
not_through | null | YES | double precision | null | null
assortment_cluster_code | null | NO | character varying | null | null
cluster_id | null | NO | integer | null | null
macro_code | null | YES | character varying | null | null

### Table walk_rates

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | null
plu_code | null | NO | character varying | null | null
value | null | NO | integer | null | null
macro_code | null | YES | character varying | null | null
cluster_id | null | YES | integer | null | null
assortment_cluster_code | null | YES | character varying | null | null

### Table products

123

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | null
ui3_code | null | YES | character varying | null | null
code | null | NO | character varying | 100 | null
name | null | NO | character varying | 255 | null
exclude | null | NO | integer | null | null
ui4_code | null | YES | character varying | null | null
rto | null | YES | bigint | null | null
margin | null | YES | bigint | null | null
stm | null | YES | boolean | null | null
price_segment_id | null | YES | integer | null | null
is_federal | null | YES | boolean | null | null
brand_code | null | YES | character varying | null | null
is_dendrogram | null | YES | boolean | null | Признак участия товара в построении дендрограммы
is_cdt | null | YES | boolean | null | Признак участия товара в построении CDT

### Table macro_cluster_aggregations

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | null
cluster_id | null | YES | integer | null | null
assortment_level | null | NO | integer | null | null
exist | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null

### Table federal_aggregations

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | null
cluster_id | null | YES | integer | null | null
exist_percent | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null

### Table federal_assortment

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('federal_assortment_id_seq'::regclass) | NO | integer | null | null
percentage | null | NO | integer | null | null
assortment_id | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null

### Table dendrograms

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('dendrograms_id_seq'::regclass) | NO | integer | null | null
data | null | YES | jsonb | null | null
create_date | null | NO | timestamp with time zone | null | null
assortment_id | null | YES | integer | null | null
last_update | null | NO | timestamp with time zone | null | null
user_id | null | YES | integer | null | null

### Table dendrogram_versions

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('dendrogram_versions_id_seq'::regclass) | NO | integer | null | null
assortment_id | null | NO | integer | null | null
data | null | YES | jsonb | null | null
timestamp | null | NO | timestamp with time zone | null | null
user_id | null | YES | integer | null | null
is_active | false | YES | boolean | null | Признак активности версии дендограммы

### Table csb_limits

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('csb_limits_id_seq'::regclass) | NO | integer | null | null
stm_count | null | NO | integer | null | null
plu_limits | null | NO | integer | null | null
assortment_id | null | YES | integer | null | null
cluster_id | null | YES | integer | null | null
csb_id | null | YES | integer | null | null
assortment_level | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null
csb_name | null | YES | character varying | null | null

### Table price_segments_limits

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('price_segments_limits_id_seq'::regclass) | NO | integer | null | null
price_segment_limits | null | NO | integer | null | null
assortment_id | null | YES | integer | null | null
cluster_id | null | YES | integer | null | null
price_segment_id | null | YES | integer | null | null
assortment_level | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null

### Table cdt_groups_plu

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('cdt_groups_plu_id_seq'::regclass) | NO | integer | null | null
assortment_id | null | YES | integer | null | null
group_id | null | YES | integer | null | null
plu_code | null | NO | character varying | 100 | null

### Table cdt_groups

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('cdt_groups_id_seq'::regclass) | NO | integer | null | null
guid | null | NO | character varying | 255 | null
name | null | NO | text | null | null
type | null | NO | character varying | 255 | null
assortment_id | null | YES | integer | null | null
parent_group_id | null | YES | integer | null | null

### Table authtoken_token

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
key | null | NO | character varying | 40 | null
created | null | NO | timestamp with time zone | null | null
user_id | null | NO | integer | null | null
is_expired | null | YES | boolean | null | null

### Table auth_group_permissions

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('auth_group_permissions_id_seq'::regclass) | NO | integer | null | null
group_id | null | NO | integer | null | null
permission_id | null | NO | integer | null | null

### Table auth_permission

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('auth_permission_id_seq'::regclass) | NO | integer | null | null
name | null | NO | character varying | 255 | null
content_type_id | null | NO | integer | null | null
codename | null | NO | character varying | 100 | null

### Table auth_group

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('auth_group_id_seq'::regclass) | NO | integer | null | null
name | null | NO | character varying | 80 | null

### Table assortment

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('assortment_id_seq'::regclass) | NO | integer | null | null
name | null | NO | character varying | 255 | null
created_at | null | NO | timestamp with time zone | null | null
updated_at | null | NO | timestamp with time zone | null | null
created_by_id | null | NO | integer | null | null
state_id | null | NO | integer | null | null
updated_by_id | null | NO | integer | null | null
period_start | null | YES | date | null | null
period_end | null | YES | date | null | null
category_code | null | YES | character varying | null | null
ui3_code | null | YES | character varying | null | null

### Table margin_rto_ambitions

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('margin_rto_ambitions_id_seq'::regclass) | NO | integer | null | null
rto | null | NO | integer | null | null
margin | null | NO | integer | null | null
assortment_id | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null

### Table macro_cluster_limits

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('macro_cluster_limits_id_seq'::regclass) | NO | integer | null | null
limits | null | NO | integer | null | null
assortment_id | null | YES | integer | null | null
cluster_id | null | YES | integer | null | null
assortment_level | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null

### Table csb_aggregations

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | null
cluster_id | null | NO | integer | null | null
assortment_level | null | NO | integer | null | null
exist | null | YES | integer | null | null
stm_exist | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null

### Table users

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('users_id_seq'::regclass) | NO | integer | null | null
password | null | NO | character varying | 128 | null
last_login | null | YES | timestamp with time zone | null | null
is_superuser | null | NO | boolean | null | null
username | null | NO | character varying | 150 | null
first_name | null | NO | character varying | 30 | null
last_name | null | NO | character varying | 150 | null
email | null | NO | character varying | 254 | null
is_staff | null | NO | boolean | null | null
is_active | null | NO | boolean | null | null
date_joined | null | NO | timestamp with time zone | null | null

### Table flyway_schema_history

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
installed_rank | null | NO | integer | null | null
version | null | YES | character varying | 50 | null
description | null | NO | character varying | 200 | null
type | null | NO | character varying | 20 | null
script | null | NO | character varying | 1000 | null
checksum | null | YES | integer | null | null
installed_by | null | NO | character varying | 100 | null
installed_on | now() | NO | timestamp without time zone | null | null
execution_time | null | NO | integer | null | null
success | null | NO | boolean | null | null


### Schema audit


### Table log

Таблица содержит историю изменения данных

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | null | NO | integer | null | Автоинкреметируемый идентификатор записи
date | null | NO | timestamp without time zone | null | Дата изменения
script_name | null | NO | character varying | null | Наименование скрипта | использовавшегося для внесения изменения данных в БД
user_login | null | NO | character varying | null | Логин пользователя на ПК запустившего скрипт
table_name | null | NO | character varying | null | Наименование таблицы | в которой происходили изменения в формате схема.таблица
comments | null | NO | character varying | null | Комментарии по изменения произошедшим в БД после применения скрипта


### Schema changes


### Table log

Таблица содержит историю изменения данных

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | null | NO | integer | null | null
date | null | NO | timestamp without time zone | null | null
script_name | null | NO | character varying | null | null
user_login | null | NO | character varying | null | null
comments | null | NO | character varying | null | null


### Schema precalculation


### Table rto_margin

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
plu_code | null | NO | character varying | null | null
assortment_cluster_code | null | NO | character varying | null | null
cluster_id | null | NO | integer | null | null
macro_code | null | NO | character varying | null | null
shop_count | null | YES | integer | null | null
rto | null | YES | double precision | null | null
margin | null | YES | double precision | null | null
assortment_level | null | NO | integer | null | null


### Schema sasha


### Table load_plu_cpi

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
plu_code | null | YES | character varying | null | null
plu_name | null | YES | character varying | null | null
csb | null | YES | character varying | null | null


### Schema aggregate


### Table macro_assortment_cluster_price_segment_view

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | YES | integer | null | null
cluster_id | null | YES | integer | null | null
assortment_level | null | YES | integer | null | null
price_segment_id | null | YES | integer | null | null
exist | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null
version | null | YES | integer | null | null

### Table quanity

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | YES | integer | null | null
exist | null | YES | integer | null | null
cluster_id | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null
assortment_level | null | YES | integer | null | null
version | null | YES | integer | null | null

### Table plu_quanity

Таблица содержит в себе агрегат кол-во plu в ассортиментном модуле по всей РФ

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | Идентификатор ассортимента(категория)
exist | null | NO | integer | null | Количество артикулов в данном разрезе
cluster_id | null | NO | integer | null | Идентификатор ценовой направленности
assortment_level | null | NO | integer | null | Уровень ассортимента
version | null | NO | integer | null | null

### Table macro_cluster_plu_quanity

Таблица содержит в себе агрегат кол-во plu в ассортиментном модуле в разрезе макро регионов

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | Идентификатор ассортимента(категория)
exist | null | NO | integer | null | Количество артикулов в данном разрезе
cluster_id | null | NO | integer | null | Идентификатор ценовой направленности
macro_code | null | NO | character varying | null | Код макро региона
assortment_level | null | NO | integer | null | Уровень ассортимента
version | null | NO | integer | null | null

### Table macro_price_segment

Таблица содежит в себе данные по количеству артикулов в разрезе ценового сегмента и макро региона по ассортиментным модулям 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | Идентификатор ассортимента
cluster_id | null | NO | integer | null | Идентификатор ценовой направленности
assortment_level | null | NO | integer | null | Значение | определяющее степень вложенности ассортимента для группы товаров
price_segment_id | null | NO | integer | null | Идентификатор ценового сегмента
exist | null | NO | integer | null | Кол-во  артикулов по ЦС по  Ассорт модулям. БЫЛО 
macro_code | null | NO | character varying | null | Код макро региона
version | null | NO | integer | null | Версия расчета

### Table price_segment

Таблица содежит в себе данные по количеству артикулов в разрезе ценового сегмента по ассортиментным модулям для РФ

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | Идентификатор ассортимента
cluster_id | null | NO | integer | null | Идентификатор ценовой направленности
assortment_level | null | NO | integer | null | Значение | определяющее степень вложенности ассортимента для группы товаров
price_segment_id | null | NO | integer | null | Идентификатор ценового сегмента
exist | null | NO | integer | null | Кол-во  артикулов по ЦС по  Ассорт модулям. БЫЛО 
version | null | NO | integer | null | Версия расчета

### Table assortment_cluster_macro_product_view

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
plu_code | null | YES | character varying | null | null
assortment_cluster_code | null | YES | character varying | null | null
cluster_id | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null
losses | null | YES | double precision | null | null
checks | null | YES | double precision | null | null
assortment_id | null | YES | integer | null | null
supplies | null | YES | double precision | null | null

### Table macro_assorment_cluster_view_summary

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | YES | integer | null | null
assortment_cluster_code | null | YES | character varying | null | null
margin_ambition | null | YES | double precision | null | null
rto_ambition | null | YES | double precision | null | null
estimate_strategy | null | YES | integer | null | null
manual_correction | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null
rto_retro | null | YES | double precision | null | null
margin_retro | null | YES | double precision | null | null

### Table macro_summary

Таблица содержит в себе данные по историческим показателям РТО и маржи, а так же показатели амбиции по РТО и марже  для  РФ

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | Идентификатор ассортимента
margin_ambition | null | YES | double precision | null |  Показатель амбиции по марже
rto_ambition | null | YES | double precision | null | Показатель амбиции по РТО
estimate_strategy | null | YES | integer | null | Показатель совпадения со стратегией
manual_correction | null | YES | integer | null | Показатель необходимости ручных корректировок рекомедации
macro_code | null | NO | character varying | null | null
rto_retro | null | YES | double precision | null | Показатели РТО за предыдущий год
margin_retro | null | YES | double precision | null | Показатели маржи за предыдущий год

### Table summary

Таблица содержит в себе данные по историческим показателям РТО и маржи, а так же показатели амбиции по РТО и марже  для  РФ

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | Идентификатор ассортимента
margin_ambition | null | YES | double precision | null |  Показатель амбиции по марже
rto_ambition | null | YES | double precision | null | Показатель амбиции по РТО
estimate_strategy | null | YES | integer | null | Показатель совпадения со стратегией
manual_correction | null | YES | integer | null | Показатель необходимости ручных корректировок рекомедации
rto_retro | null | YES | double precision | null | Показатели РТО за предыдущий год
margin_retro | null | YES | double precision | null | Показатели маржи за предыдущий год

### Table macro_assortment_cluster_summary

Таблица содержит в себе данные по историческим показателям РТО и маржи, а так же показатели амбиции по РТО и марже в разрезе макро кода и ассортиментного кластера

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | Идентификатор ассортимента
assortment_cluster_code | null | NO | character varying | null | Код ассортиментного кластера
margin_ambition | null | YES | double precision | null |  Показатель амбиции по марже
rto_ambition | null | YES | double precision | null | Показатель амбиции по РТО
estimate_strategy | null | YES | integer | null | Показатель совпадения со стратегией
manual_correction | null | YES | integer | null | Показатель необходимости ручных корректировок рекомедации
macro_code | null | NO | character varying | null | Код макрорегиона
rto_retro | null | YES | double precision | null | Показатели РТО за предыдущий год
margin_retro | null | YES | double precision | null | Показатели маржи за предыдущий год

### Table federal_view

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | YES | integer | null | null
cluster_id | null | YES | integer | null | null
exist_percent | null | YES | double precision | null | null
macro_code | null | YES | character varying | null | null

### Table federal

Таблица содержит агрегат присутствия федерального ассортимента по ассортиментным кластерам и кластерам направленности для РФ

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | Идентификатора ассортимента
cluster_id | null | NO | integer | null | Идентификатор ценовой напревленности
exist_percent | null | YES | double precision | null | Процент присутствия федерального ассортимента

### Table csb_macro_view

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | YES | integer | null | null
cluster_id | null | YES | integer | null | null
assortment_level | null | YES | integer | null | null
exist | null | YES | integer | null | null
stm_exist | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null
version | null | YES | integer | null | null
csb_id | null | YES | integer | null | null

### Table csb

Таблица содержит кол-во артикулов по потребностям по ассорт модулям. по РФ

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | Идентификатор ассортимента
cluster_id | null | NO | integer | null | Идентиикатор кластера направленности
assortment_level | null | NO | integer | null | Уровень ассортимента
exist | null | YES | integer | null | Кол-во артикулов по потребностям по ассорт модулям. БЫЛО
stm_exist | null | YES | integer | null | Кол-во СТМ артикулов по потребностям по ассорт модулям. БЫЛО
version | null | NO | integer | null | Версия расчета
csb_id | null | NO | integer | null | Идентификатор группы csb

### Table product_cluster_macro_ac_recommendation_view

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
plu_code | null | YES | character varying | null | null
cluster_id | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null
assortment_cluster_code | null | YES | character varying | null | null
assortment_id | null | YES | integer | null | null
version | null | YES | integer | null | null
rto | null | YES | double precision | null | null
margin | null | YES | double precision | null | null

### Table macro_recommendation

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
macro_code | null | NO | character varying | null | null
assortment_id | null | NO | integer | null | null
version | null | NO | integer | null | null
rto | null | YES | double precision | null | null
margin | null | YES | double precision | null | null

### Table recommendation

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | null
version | null | NO | integer | null | null
rto | null | YES | double precision | null | null
margin | null | YES | double precision | null | null

### Table product_cluster_macro_ac_recommendation

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
plu_code | null | NO | character varying | null | null
cluster_id | null | NO | integer | null | null
macro_code | null | NO | character varying | null | null
assortment_cluster_code | null | NO | character varying | null | null
assortment_id | null | NO | integer | null | null
version | null | NO | integer | null | null
rto | null | YES | double precision | null | null
margin | null | YES | double precision | null | null

### Table macro_cluster_product

Таблица содержит агрегированную информацию по потерям, чекам и запасам для каждого plu в разрезе макро региона

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
plu_code | null | NO | character varying | null | null
cluster_id | null | NO | integer | null | null
macro_code | null | NO | character varying | null | null
losses | null | YES | double precision | null | null
checks | null | YES | double precision | null | null
assortment_id | null | NO | integer | null | null
supplies | null | YES | double precision | null | null

### Table cluster_product

Таблица содержит агрегированную информацию по потерям, чекам и запасам для каждого plu в разрезе кластера ценовой направленности 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
plu_code | null | NO | character varying | null | null
cluster_id | null | NO | integer | null | null
losses | null | YES | double precision | null | null
checks | null | YES | double precision | null | null
assortment_id | null | NO | integer | null | null
supplies | null | YES | double precision | null | null

### Table cluster_macro_assortment_cluster_product

Таблица содержит агрегированную информацию по потерям, чекам и запасам для каждого plu в разрезе макро региона и ассортиментного кластера

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
plu_code | null | NO | character varying | null | Цифровой идентификатор конкретной товарной позиции(plu)
assortment_cluster_code | null | NO | character varying | null | Код ассортиментного кластера
cluster_id | null | NO | integer | null | Идентификатор ценовой направленности
macro_code | null | NO | character varying | null | Код макро региона
losses | null | YES | double precision | null | Потери в денежном эквиаваленте для товара
checks | null | YES | double precision | null | Количество чеков в которых был данный товар
assortment_id | null | NO | integer | null | Идентификатор ассортимента
supplies | null | YES | double precision | null | Запас данного товара в денежном эквиваленте

### Table macro_federal

Таблица содержит агрегат присутствия федерального ассортимента по ассортиментным кластерам и кластерам направленности в разрезе макро региона

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | Идентификатора ассортимента
cluster_id | null | NO | integer | null | Идентификатор ценовой напревленности
exist_percent | null | YES | double precision | null | Процент присутствия федерального ассортимента
macro_code | null | NO | character varying | null | Код макро региона

### Table macro_csb

Таблица содержит кол-во артикулов по потребностям по ассорт модулям в разрезе макро

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
assortment_id | null | NO | integer | null | Идентификатор ассортимента
cluster_id | null | NO | integer | null | Идентиикатор кластера направленности
assortment_level | null | NO | integer | null | Уровень ассортимента
exist | null | YES | integer | null | Кол-во артикулов по потребностям по ассорт модулям. БЫЛО
stm_exist | null | YES | integer | null | Кол-во СТМ артикулов по потребностям по ассорт модулям. БЫЛО
macro_code | null | NO | character varying | null | Код макрорегиона
version | null | NO | integer | null | Версия расчета
csb_id | null | NO | integer | null | Идентификатор группы csb

### Table product_cluster_macro_recommendation

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
plu_code | null | NO | character varying | null | null
cluster_id | null | NO | integer | null | null
macro_code | null | NO | character varying | null | null
assortment_id | null | NO | integer | null | null
version | null | NO | integer | null | null
rto | null | YES | double precision | null | null
margin | null | YES | double precision | null | null

### Table product_cluster_recommendation

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
plu_code | null | NO | character varying | null | null
cluster_id | null | NO | integer | null | null
assortment_id | null | NO | integer | null | null
version | null | NO | integer | null | null
rto | null | YES | double precision | null | null
margin | null | YES | double precision | null | null

### Table macro_recommendation_view

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
macro_code | null | YES | character varying | null | null
assortment_id | null | YES | integer | null | null
version | null | YES | integer | null | null
rto | null | YES | double precision | null | null
margin | null | YES | double precision | null | null


### Schema voc


### Table cdt_groups_plu

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | null | NO | integer | null | null
assortment_id | null | YES | integer | null | null
group_id | null | YES | integer | null | null
plu_code | null | YES | character varying | 255 | null

### Table cdt_groups

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | null | NO | integer | null | null
assortment_id | null | YES | integer | null | null
guid | null | YES | character varying | 255 | null
name | null | YES | character varying | 255 | null
type | null | YES | character varying | 255 | null
parent_group_id | null | YES | integer | null | null

### Table authtoken_token

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
key | null | YES | character varying | 255 | null
created | null | YES | timestamp with time zone | null | null
user_id | null | NO | integer | null | null
is_expired | null | YES | boolean | null | null

### Table assortment_states

Таблица хранит возможные состояния ассортимента

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | null | NO | integer | null | Уникальный идентификатор состояния
name | null | NO | character varying | null | Имя состояния
state_forward | null | YES | integer | null | Идентификатор состояния на которое может перейти текущий статус
state_back | null | YES | integer | null | Идентификатор состояния на которое данное состояние может вернуться

### Table partly_through

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | null | NO | integer | null | null
description | null | YES | character varying | null | null

### Table macro_cluster_ac_ua

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
trade_net_id | null | NO | character varying | null | null
macro_code | null | NO | character varying | null | null
cluster_id | null | NO | integer | null | null
assortment_cluster_code | null | NO | character varying | null | null
assortment_level | null | NO | integer | null | null
shops_count | null | YES | integer | null | null

### Table trade_nets

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | null | NO | character varying | null | null
name | null | YES | character varying | null | null

### Table necessarily

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
code | null | NO | integer | null | null
description | null | NO | character varying | null | null

### Table assortment_level

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | null | NO | integer | null | null

### Table versions

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | null | NO | integer | null | null
description | null | YES | character varying | null | null

### Table brends

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
name | null | YES | character varying | null | null
code | null | NO | character varying | null | null

### Table ui4

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
code | null | NO | character varying | null | null
name | null | NO | character varying | 255 | null
ui3_code | null | NO | character varying | null | null

### Table ui3

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
code | null | NO | character varying | null | null
name | null | NO | character varying | 255 | null

### Table price_segments

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | null | NO | integer | null | null
name | null | NO | character varying | 255 | null

### Table macros

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
name | null | NO | character varying | 255 | null
code | null | NO | character varying | null | null

### Table clusters

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | null | NO | integer | null | null
name | null | NO | character varying | 255 | null
weight | null | YES | integer | null | null

### Table assortment_clusters

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
name | null | YES | character varying | null | null
code | null | NO | character varying | null | null
shops_count | null | YES | integer | null | null
macro_code | null | YES | character varying | null | null

### Table categories

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
code | null | NO | character varying | null | null
name | null | NO | character varying | 255 | null


### Schema django


### Table django_session

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
session_key | null | NO | character varying | 40 | null
session_data | null | NO | text | null | null
expire_date | null | NO | timestamp with time zone | null | null

### Table django_migrations

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('django_migrations_id_seq'::regclass) | NO | integer | null | null
app | null | NO | character varying | 255 | null
name | null | NO | character varying | 255 | null
applied | null | NO | timestamp with time zone | null | null

### Table django_admin_log

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('django_admin_log_id_seq'::regclass) | NO | integer | null | null
action_time | null | NO | timestamp with time zone | null | null
object_id | null | YES | text | null | null
object_repr | null | NO | character varying | 200 | null
action_flag | null | NO | smallint | null | null
change_message | null | NO | text | null | null
content_type_id | null | YES | integer | null | null
user_id | null | NO | integer | null | null

### Table django_content_type

Таблица еще в процессе описания 

Поле | Значение по умолчанию | Может быть null | Тип данных | Максимальная длина | Описание
--- | --- | --- | --- | --- | --- 
id | nextval('django_content_type_id_seq'::regclass) | NO | integer | null | null
app_label | null | NO | character varying | 100 | null
model | null | NO | character varying | 100 | null
