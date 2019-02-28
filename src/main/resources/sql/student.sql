create database dbpipe;
create table student(
    student_id int(11) not null,
    name varchar(32) not null,
    age int(11),
    birthday date,
    primary key(student_id)
);
