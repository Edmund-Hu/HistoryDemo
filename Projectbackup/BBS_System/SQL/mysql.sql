drop database if exists BBS;
create database BBS;
use BBS;
show databases;
create table message(id int primary key auto_increment,
userid int,
message varchar(510),
inserttime timestamp not null DEFAULT  CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
status int(1) default 0
)
drop table message;
desc message
create table userinfo(id int primary key auto_increment,
username varchar(20),
password varchar(50)
)
desc userinfo;
alter table message drop username;
alter table message add foreign key (userid) references userinfo (id);

desc userinfo;
select * from userinfo limit 0,2;


select b.id,a.username, b.message,b.inserttime from userinfo  a, message b
where a.id=b.userid;

select b.id,a.username, b.message,b.inserttime from userinfo  a, message b 
where a.id=b.userid order by inserttime desc limit 0,9 ;

DELETE FROM message WHERE id = 20;
select * from message;

select b.id,a.username, b.message,b.inserttime from userinfo  a, 
message b where a.username like'%Edmund%' and a.id=b.userid and b.status = '0' order by id