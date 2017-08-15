# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table crash_basic_information_model (
  crash_type                    varchar(255),
  case_number                   varchar(255),
  crash_date                    varchar(255),
  hour                          varchar(255),
  unit_vehiculos                varchar(255),
  unit_automovilistas           varchar(255),
  unit_pedestrians              varchar(255),
  unit_injured                  varchar(255),
  unit_fatalaties               varchar(255),
  longitude                     double,
  latitude                      double,
  address                       varchar(255),
  city_description_es           varchar(255),
  country_description_es        varchar(255),
  near_to_description_es        varchar(255),
  name                          varchar(255),
  distance                      double,
  measurement_description_es    varchar(255),
  direction_description_es      varchar(255),
  property_description_es       varchar(255),
  location_description_es       varchar(255),
  zone_type_description_es      varchar(255),
  officerfk                     integer,
  id_crash_basic_information    integer
);

create table list_report_model (
  crash_type                    varchar(255),
  crash_date                    varchar(255),
  hour                          varchar(255),
  address                       varchar(255),
  country_description_es        varchar(255),
  first_name                    varchar(255),
  last_name                     varchar(255),
  name                          varchar(255),
  license_type                  varchar(255),
  licence_number                varchar(255),
  plate_number                  varchar(255),
  make                          varchar(255),
  modelo                        varchar(255)
);

create table narrativa_model (
  id_narrative                  integer auto_increment not null,
  notified_time_police          varchar(255),
  time_of_arrival_police        varchar(255),
  notified_time_emergencie      varchar(255),
  time_of_arrival_emergencie    varchar(255),
  details                       varchar(255),
  constraint pk_narrativa_model primary key (id_narrative)
);

create table new_person_model (
  name                          varchar(255),
  gender                        varchar(255),
  license_type                  varchar(255),
  licence_number                varchar(255),
  organ_donor                   varchar(255),
  expiration_date               varchar(255),
  neighborhood                  varchar(255),
  street_name                   varchar(255),
  city                          varchar(255),
  state_country                 varchar(255),
  zip_code                      integer,
  phone_number                  varchar(255),
  id_persona_fk                 varchar(255),
  id_new_person                 integer
);

create table new_vehicle_model (
  plate_number                  varchar(255),
  vehicle_jurisdiction          varchar(255),
  state                         varchar(255),
  vin                           varchar(255),
  year                          varchar(255),
  make                          varchar(255),
  modelos                       varchar(255),
  registration_number           varchar(255),
  insurance_company             varchar(255),
  purchase_date                 varchar(255),
  expiration_date               varchar(255),
  id_persona_fk                 varchar(255),
  id_new_vehicle                integer,
  name                          varchar(255),
  licence_number                varchar(255)
);

create table list_vehicle_of_person_model (
  plate_number                  varchar(255),
  make                          varchar(255),
  modelo                        varchar(255),
  year                          varchar(255)
);


# --- !Downs

drop table if exists crash_basic_information_model;

drop table if exists list_report_model;

drop table if exists narrativa_model;

drop table if exists new_person_model;

drop table if exists new_vehicle_model;

drop table if exists list_vehicle_of_person_model;

