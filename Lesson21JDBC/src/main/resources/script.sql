-- drop schema if exists students_db;
-- create schema if not exists students_db;
-- drop table if exists students_db.students;

CREATE TABLE students
(
    id      integer primary key generated always as identity unique,
    name    VARCHAR(45)  not null,
    surname varchar(100) not null,
    course  integer      not null
);

CREATE TABLE city
(
    id         integer primary key generated always as identity unique,
    student_id integer,
    city       VARCHAR(45) not null,
    FOREIGN KEY (student_id) REFERENCES students (Id) on delete cascade
);

/*alter table city
    add constraint city_students_null_fk
        foreign key (student_id) references students (id);
*/
INSERT INTO students (name, surname, course)
VALUES ('Виктор', 'Русакович', 2),
       ('Александр', 'Максимчик', 1),
       ('Александр', 'Иванов', 3),
       ('Роман', 'Александров', 4),
       ('Джеймс', 'Хэтфилд', 2),
       ('Павел', 'Корзун', 5),
       ('Обновление', 'базы', 33);


insert into city (student_id, city)
values ('1', 'Калининград'),
       ('2', 'Пинск'),
       ('3', 'Минск'),
       ('4', 'Старые дороги'),
       ('5', 'Сан Франциско'),
       ('6', 'Жодино'),
       ('7', 'Задворки сервера');

select *
from students;

select *
from city
