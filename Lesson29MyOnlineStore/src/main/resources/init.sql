-- Создаем базу категорий?
create schema "online-store";

create table "online-store".categories
(
    id          integer,
    name        text,
    "imageName" text
);

alter table "online-store".categories
    owner to postgres;


INSERT INTO "online-store".categories (id, name, "imageName")
VALUES (1, 'Mobile phones', 'mobile.jpg');
INSERT INTO "online-store".categories (id, name, "imageName")
VALUES (2, 'Laptops', 'laptop.jpg');
INSERT INTO "online-store".categories (id, name, "imageName")
VALUES (3, 'GPS Navigators', 'jps_nav.jpg');
INSERT INTO "online-store".categories (id, name, "imageName")
VALUES (4, 'Fridges', 'fridge.jpg');
INSERT INTO "online-store".categories (id, name, "imageName")
VALUES (5, 'Cars', 'car.jpg');
INSERT INTO "online-store".categories (id, name, "imageName")
VALUES (6, 'Cameras', 'camera.jpg')

--Таблица пользователей создаем
CREATE TABLE "online-store".users
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

-- Вставляем пользователей в таблицу
INSERT INTO "online-store".users (login_key, pass_value, first_name, second_name, day_of_birthday, gender, email)
VALUES ('admin', 'admin', 'username', 'adminovich', '20.03.1900', 'male', 'admin@tms.by'),
       ('test', 'test', 'testname', 'testovich', '20.03.1800', 'female', 'miner@grind.com');

-- _____________________



-- Джоиним таблицы
select *
from students
         left join city on city.id = students.id_city;

select login_key, pass_value
from users;

-- insert into users (login_key, pass_value, first_name, second_name, day_of_birthday, gender, email)
-- values ('test1', 'test', 'testname', 'testovich', '20.03.1800', 'female', 'miner@grind.com')
-- -- values (?, ?, ?, ?, ?, ?, ?)


