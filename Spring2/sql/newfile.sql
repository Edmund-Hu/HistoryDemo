drop database if exists springtest;
create database springtest;
use springtest;
create table user(
id int primary key auto_increment,
name varchar(50),
age int,
sex varchar(2)
);
insert into user(name,age,sex)
values("小三",250,"男");
insert into user(name,age,sex) values('和大人','19','女');
select * from user;
delete user where id=3;
