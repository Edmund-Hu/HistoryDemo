
drop database if exists student;
create database student;
show databases;
use student;
create table stu(
				id int primary key auto_increment not null,
				name varchar(10) ,
				sex char,
				age int,
				score double
 );
 insert into stu(name, sex,age, score) values("ÕÅÈı",'f',23,98);
 select * from stu;
 desc stu;
 drop database if exists kijp;
 alter table stu change sex sex varchar(2);