# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table comment (
  id                            bigint not null,
  content                       varchar(255),
  p_id                          bigint,
  constraint pk_comment primary key (id)
);
create sequence comment_seq;

create table food (
  main                          varchar(31) not null,
  food_id                       bigint not null,
  food_name                     varchar(255),
  kcal                          double,
  protein                       double,
  carbs                         double,
  fat                           double,
  constraint pk_food primary key (food_id)
);
create sequence food_seq;

create table meal (
  meal_id                       bigint not null,
  m_email                       varchar(255),
  total_kcal                    double,
  total_carbs                   double,
  total_protein                 double,
  total_fat                     double,
  constraint pk_meal primary key (meal_id)
);
create sequence meal_seq;

create table post (
  id                            bigint not null,
  content                       varchar(255),
  u_email                       varchar(255),
  likes                         integer,
  constraint pk_post primary key (id)
);
create sequence post_seq;

create table user (
  role                          varchar(31) not null,
  email                         varchar(255) not null,
  name                          varchar(255),
  surname                       varchar(255),
  password                      varchar(255),
  nick                          varchar(255),
  dob                           timestamp,
  gender                        varchar(255),
  height                        double,
  weight                        double,
  activity_level                double,
  primary_goal                  varchar(255),
  no_of_meal                    integer,
  daily_kcal                    double,
  constraint pk_user primary key (email)
);

alter table comment add constraint fk_comment_p_id foreign key (p_id) references post (id) on delete restrict on update restrict;
create index ix_comment_p_id on comment (p_id);

alter table meal add constraint fk_meal_m_email foreign key (m_email) references user (email) on delete restrict on update restrict;
create index ix_meal_m_email on meal (m_email);

alter table post add constraint fk_post_u_email foreign key (u_email) references user (email) on delete restrict on update restrict;
create index ix_post_u_email on post (u_email);


# --- !Downs

alter table comment drop constraint if exists fk_comment_p_id;
drop index if exists ix_comment_p_id;

alter table meal drop constraint if exists fk_meal_m_email;
drop index if exists ix_meal_m_email;

alter table post drop constraint if exists fk_post_u_email;
drop index if exists ix_post_u_email;

drop table if exists comment;
drop sequence if exists comment_seq;

drop table if exists food;
drop sequence if exists food_seq;

drop table if exists meal;
drop sequence if exists meal_seq;

drop table if exists post;
drop sequence if exists post_seq;

drop table if exists user;

