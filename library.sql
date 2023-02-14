
drop database if exists library_db;

create database  library_db;

use library_db;

CREATE TABLE user_tbl(
	id int  auto_increment primary key,
	name varchar(25) not null,
	password varchar(10) not null,
	isActive tinyInt(5) 
);

CREATE TABLE address_tbl(		
	id int  auto_increment primary key,
	city varchar(25) not null,
	township varchar(25) not null,
	street varchar(45) not null
);

CREATE TABLE person_tbl(
	id int  auto_increment primary key,
	name varchar(25) not null,
	address_id int not null

);