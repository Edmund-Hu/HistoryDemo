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
values("С��",250,"��");
insert into user(name,age,sex) values('�ʹ���','19','Ů');
select * from user;
delete user where id=3;
