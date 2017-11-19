show databases;
create database userdb;
use userdb;
create table userinfo(id int auto_increment not null primary key,
username varchar(20),
password varchar(40),
sex varchar(2),
email varchar(20)
)
desc userinfo;
insert into userinfo(username,password,sex,email) values("vhudp","123","ÄÐ","vhudp@163.com");
select * from userinfo where username="vhudp";