show tables;
desc message;
create table fileLocation(id int primary key auto_increment,
filename varchar(100) not null,
filelocation varchar(100) not null
)
desc fileLocation
alter table fileLocation drop filelocation;
insert into fileLocation(filename,filelocation) values('xx','c:/hksd/') ;
select * from fileLocation;
select * from message;

create table image(id int primary key auto_increment,
imgName varchar(50) not null,
intro varchar(100)
)

insert into image(imgName,intro) values(
"pic2",
"这是图片2的介绍"
),(
"pic3",
"这是图片3的介绍"
),(
"pic4",
"这是图片4的介绍"
)
select * from image