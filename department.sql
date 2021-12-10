create table department(
department_id int(4) not null primary key,
department_name varchar(30) not null,
manager_id int,
location_id int
);
insert into department values(1, 'chief',7, 75);
select * from department;
