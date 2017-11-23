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
  status                        varchar(255),
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
  case_number                   varchar(255),
  modelo                        varchar(255)
);

create table narrativa_model (
  id_narrative                  integer auto_increment not null,
  notified_time_police          varchar(255),
  time_of_arrival_police        varchar(255),
  notified_time_emergencie      varchar(255),
  time_of_arrival_emergencie    varchar(255),
  narrativa_fk                  integer,
  accidente_fk                  integer,
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
  accidente_fk                  integer,
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
  accidente_fk                  integer,
  id_new_vehicle                integer,
  name                          varchar(255),
  licence_number                varchar(255)
);

create table person_extend_information_model (
  persona_fk                    integer,
  category_person               varchar(255),
  type_person                   varchar(255),
  row                           varchar(255),
  seat                          varchar(255),
  other_location                varchar(255),
  restraint_system              varchar(255),
  airbags_activation            varchar(255),
  expulsion                     varchar(255),
  speed_related                 varchar(255),
  extraction                    varchar(255),
  distracted_by                 varchar(255),
  driver_cirncunstance_bc       varchar(255),
  condition_collision_time      varchar(255),
  safety_equipment_used         varchar(255),
  suspect_alcohol_use           varchar(255),
  test_status_al                varchar(255),
  test_type_al                  varchar(255),
  test_result_al                varchar(255),
  test_result_tp                varchar(255),
  suscpect_controlled_substances varchar(255),
  distracted_driver_by          varchar(255),
  test_status_sub               varchar(255),
  test_type_sub                 varchar(255),
  test_result_sub               varchar(255),
  actions_before_collision      varchar(255),
  in_way_to_school              varchar(255),
  actions_at_collision_time     varchar(255),
  location_when_collision       varchar(255),
  transported_by_me             varchar(255),
  transported_to                varchar(255),
  transported_by                varchar(255),
  medical_emergencies_number    varchar(255),
  id_person_extend_information  integer,
  ambulance_cspnumber           integer
);

create table vehicle_extend_information_model (
  vehicle_type                  varchar(255),
  occupants                     varchar(255),
  vehicle_motor                 varchar(255),
  direction_trip_cb             varchar(255),
  function_special_mvt          varchar(255),
  motor_emergency_vu            varchar(255),
  m_ph                          varchar(255),
  m_phdescription               varchar(255),
  maneuver_vehicle_motor        varchar(255),
  description_road              varchar(255),
  alignment                     varchar(255),
  slope                         varchar(255),
  lane_cantidad                 varchar(255),
  lane_categoria                varchar(255),
  lane_tipo_carril              varchar(255),
  type_control_traffic          varchar(255),
  in_operation_lost             varchar(255),
  primera_categoria_event       varchar(255),
  segunda_categoria_event       varchar(255),
  tercera_categoria_event       varchar(255),
  cuarta_categoria              varchar(255),
  primer_event                  varchar(255),
  segundo_event                 varchar(255),
  tecer_event                   varchar(255),
  cuarto_event                  varchar(255),
  bus_use                       varchar(255),
  lefth_place                   varchar(255),
  towed_damage                  varchar(255),
  primer_defecto_mecánico       varchar(255),
  segundo_defecto_mecánico      varchar(255),
  initial_contact_point         varchar(255),
  affected_area                 varchar(255),
  extend_damage                 varchar(255),
  commercial_vehicle_use        varchar(255),
  vehicle_moving                varchar(255),
  authorized_driver             varchar(255),
  inspection_update             varchar(255),
  special_permit                varchar(255),
  gross_weight                  varchar(255),
  total_axis                    varchar(255),
  vehicle_configuration         varchar(255),
  heavy_vehicle_type            varchar(255),
  hazardous_material            varchar(255),
  diamond_id_number             varchar(255),
  there_hazardous_material      varchar(255),
  vehicle_fk                    integer,
  id_vehicle_extend_information integer
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

drop table if exists person_extend_information_model;

drop table if exists vehicle_extend_information_model;

drop table if exists list_vehicle_of_person_model;

