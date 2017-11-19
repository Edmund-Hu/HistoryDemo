create database userdb; 
use userdb;
create  table userinfo(id int primary key auto_increment,
username varchar(50),
password varchar(50),
sex varchar(2),
email varchar(30)
);
desc userinfo;
 insert into userinfo(username,password,sex,email) values(
 "vhudp",
 "123",
 "ÄÐ",
 "vhudp@163.com"
 
 )
 select * from userinfo;