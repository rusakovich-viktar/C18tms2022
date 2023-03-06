-- Удаляем старые таблицы
drop table if exists students cascade;
drop table if exists city cascade;

-- Создаем две новых таблицы
CREATE TABLE city
(
    id        integer primary key generated always as identity unique,
    city_name VARCHAR(45) not null unique
);


CREATE TABLE students
(
    id      integer primary key generated always as identity unique,
    name    VARCHAR(45)  not null,
    surname varchar(100) not null,
    course  integer      not null,
    id_city integer      not null,
    FOREIGN KEY (id_city) REFERENCES city (Id) on delete cascade
);

select *
from city;


-- Наполняем таблицы значенями
insert into city (city_name)
values ('Астана'),
       ('Борисов'),
       ('Гродно'),
       ('Витебск'),
       ('Гомель'),
       ('Сан Франциско'),
       ('Минск');


INSERT INTO students (name, surname, course, id_city)
VALUES ('Виктор', 'Русакович', 2, 1),
       ('Александр', 'Максимчик', 1, 2),
       ('Александр', 'Иванов', 3, 3),
       ('Роман', 'Александров', 4, 7),
       ('Джеймс', 'Хэтфилд', 2, 7),
       ('Павел', 'Корзун', 5, 5),
       ('Иван', 'Иванов', 3, 3);

select *
from city;

select *
from students;

-- Джоиним таблицы
select *
from students
         left join city on city.id = students.id_city;


--Таблица пользователей
CREATE TABLE users
(
    id              integer primary key generated always as identity unique,
    login_key       text not null unique,
    pass_value      text not null,
    first_name      text not null,
    second_name     text not null,
    day_of_birthday date not null,
    gender          text not null,
    email           text not null
);

INSERT INTO users (login_key, pass_value, first_name, second_name, day_of_birthday, gender, email)
VALUES ('admin', 'admin', 'username', 'adminovich', '20.03.1900', 'male', 'admin@tms.by'),
       ('test', 'test', 'testname', 'testovich', '20.03.1800', 'female', 'miner@grind.com');


select login_key, pass_value
from users;

-- insert into users (login_key, pass_value, first_name, second_name, day_of_birthday, gender, email)
-- values ('test1', 'test', 'testname', 'testovich', '20.03.1800', 'female', 'miner@grind.com')
-- -- values (?, ?, ?, ?, ?, ?, ?)


