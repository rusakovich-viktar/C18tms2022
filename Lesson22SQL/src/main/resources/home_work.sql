/*Задачи по тренировке SQL запросов.
    Во всех задачах ниже считайте, что таблица workers имеет поля id, login, salary, age, date, description (и другие при необходимости).*/
CREATE TABLE workers
(
    id          integer primary key generated always as identity,
    login       VARCHAR(30),
    city        VARCHAR(25),
    salary      int,
    age         int,
    date        DATE,
    description varchar
);
select *
from workers;

-- drop table workers;

INSERT INTO workers(login, city, salary, age, date, description)
VALUES ('eee', 'Москва', 1000, 18, '2020-01-12', 'Мамочка в декрете'),
       ('zzz', 'Владивосток', 250, 19, '2020-01-14', 'Народный кондитер'),
       ('ggg', 'Москва', 700, 19, '2020-01-23', '5 лет играет в вов и никакой зависимости'),
       ('aaa', 'Владивосток', 450, 20, '2020-01-12', 'Java developer'),
       ('222', 'Москва', 700, 25, '2020-02-01', 'Директор шлагбаума'),
       ('eeeeeeeeee', 'Москва', 700, 21, '2020-02-14', 'супергерой'),
       ('qwerty', 'Москва', 700, 30, '2020-02-23', 'интервьюируемый интервьюер'),
       ('12345', 'Москва', 700, 27, '2020-03-03', 'нехта нешта'),
       ('tms18', 'Новосибирск', 450, 45, '2020-02-27', '2020-03-12'),
       ('valuew', 'Санкт-Петербург', 1400, 88, '2020-03-29', 'завод жби'),
       ('qwderwerg', 'Москва', 700, 101, '2020-04-06', 'завод жби'),
       ('polochanin', 'Новосибирск', 450, 23, '2020-04-18', 'завод жби'),
       ('sylvana', 'Томск', 300, 60, '2020-05-20', 'завод окна'),
       ('ragnaros', 'Санкт-Петербург', 200, 16, '2020-06-01', 'завод окна'),
       ('paladin', 'Санкт-Петербург', 700, 12, '2020-05-28', 'котельная'),
       ('ivan234', 'Новосибирск', 450, 11, '2020-05-25', 'бух_оплатить'),
       ('admin', 'Минск', 1500, 17, '2020-05-25', 'котельная'),
       ('test', 'Томск', 450, 17, '2020-05-25', 'тестовый аккаунт'),
       ('test', 'Томск', 450, 17, '2016-05-25', 'тестовый аккаунт');

-- На IN
--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: IN.
--     Выберите из таблицы workers записи с id равным 1, 2, 3, 5, 14.
select *
from workers
where id in (1, 2, 3, 5, 14);

--     Выберите из таблицы workers записи с login равным 'eee', 'bbb', 'zzz'.
select *
from workers
where login in ('eee', 'bbb', 'zzz');

--     Выберите из таблицы workers записи с id равным 1, 2, 3, 7, 9, и логином, равным 'user', 'admin', 'ivan' и зарплатой больше 300.
select *
from workers
where login in ('user', 'admin', 'ivan')
   or id in (1, 2, 3, 7, 9)
   or salary > 300;
/*and не применял, ибо ноль значений, будем считать что это или)*/

--     На BETWEEN
--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: BETWEEN.
--     Выберите из таблицы workers записи c зарплатой от 100 до 1000.
select *
from workers
where salary between 100 and 1000;

--     Выберите из таблицы workers записи c id от 3 до 10 и зарплатой от 300 до 500.
select *
from workers
where salary between 300 and 500
  and id between 3 and 10;

--     На AS
--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: AS.
--     Выберите из таблицы workers все записи так, чтобы вместо id было userId, вместо login – userLogin, вместо salary - userSalary.
select id userId, login userLogin, salary userSalary
from workers;

--     На DISTINCT
--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: DISTINCT.
--     Выберите из таблицы workers все записи так, чтобы туда попали только записи с разной зарплатой (без дублей).
select distinct salary
from workers;


select salary
from workers
group by salary;

--     Получите SQL запросом все возрасты без дублирования.
--
--     На MIN и MAX
--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: MIN, MAX.
--     Найдите в таблице workers минимальную зарплату.
select min(salary)
from workers;

--     Найдите в таблице workers максимальную зарплату.
select max(salary)
from workers;
--     На SUM
--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: SUM.
--     Найдите в таблице workers суммарную зарплату.
select sum(salary)
from workers;

--     Найдите в таблице workers суммарную зарплату для людей в возрасте от 21 до 25.
select sum(salary)
from workers
where age between 21 and 25;
--     Найдите в таблице workers суммарную зарплату для id, равного 1, 2, 3 и 5.
select sum(salary)
from workers
where id in (1, 2, 3, 5);
--     На AVG
--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: AVG.
--     Найдите в таблице workers среднюю зарплату.
select avg(salary)
from workers;
--     Найдите в таблице workers средний возраст.
select avg(age)
from workers;
--     На NOW, CURRENT_DATE, CURRENT_TIME

--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: NOW, CURRENT_DATE, CURRENT_TIME.
--     Выберите из таблицы workers все записи, у которых дата больше текущей.
UPDATE workers
SET date = current_date + 10
where id = 1;

select *
from workers
where date > current_timestamp;
select *
from workers
where date > current_date;


--     Вставьте в таблицу workers запись с полем date с текущим моментом времени в формате 'год-месяц-день часы:минуты:секунды'.
INSERT INTO workers (login, date)
values ('date_login', now());

INSERT INTO workers (login, date)
values ('date_login_timestamp', CURRENT_TIMESTAMP);

select *
from workers
order by id desc;

--     Вставьте в таблицу workers запись с полем date с текущей датой в формате 'год-месяц-день'.
INSERT INTO workers (login, date)
values ('date_login', current_date);


--     Вставьте в таблицу workers запись с полем time с текущим моментом времени в формате 'часы:минуты:секунды'.
SELECT *, localtime as time
from workers;
/*ну я не стал вставлять на постоянку столбец и сетать его, вывел в выборке просто*/


--     На работу с частью даты
--     Для решения задач данного блока вам понадобятся следующие SQL команды и функция: extract.
--     Выберите из таблицы workers все записи за 2016 год.
select *
from workers
where extract(Year from date) = 2016;
/*или аналогичная запись ниже,
  далее дублировать не буду*/
select *
from workers
where date_part('Year', date) = 2016;

--
--     Выберите из таблицы workers все записи за март любого года.
select *
from workers
where extract(month from date) = 03;
--     Выберите из таблицы workers все записи за третий день месяца.
select *
from workers
where extract(day from date) = 03;
--     Выберите из таблицы workers все записи за пятый день апреля любого года.
select *
from workers
where extract(day from date) = 05
  and extract(month from date) = 04;
--     Выберите из таблицы workers все записи за следующие дни любого месяца: 1, 7, 11, 12, 15, 19, 21, 29.
select *
from workers
where extract(day from date) in (1, 7, 11, 12, 15, 19, 21, 29);
--     Выберите из таблицы workers все записи за вторник.
select *
from workers
where extract(dow from date) = 02
  and extract(Year from date) = 2016;
--     Выберите из таблицы workers все записи за первую декаду любого месяца 2016 года.
select *
from workers
where extract(quarter from date) = 1
  and extract(Year from date) = 2016;
--     Выберите из таблицы workers все записи, в которых день меньше месяца.
select *
from workers
where extract(day from date) < extract(month from date);
--     При выборке из таблицы workers запишите день, месяц и год в отдельные поля.
select *, extract(day from date) as day, extract(month from date) as month, extract(year from date) as year
from workers;

--     При выборке из таблицы workers создайте новое поле today, в котором будет номер текущего дня недели.
select *, extract(dow from date) as номер_дня_недели
from workers;
--     На EXTRACT, DATE
--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: EXTRACT, DATE.
--     При выборке из таблицы workers запишите год, месяц и день в отдельные поля с помощью EXTRACT.
select extract(year from date) as year, extract(month from date) as month, extract(day from date) as day
from workers;
--     При выборке из таблицы workers запишите день, месяц и год в отдельное поле с помощью DATE в формате 'год-месяц-день'.
select date
from workers;

--     На DATE_FORMAT
--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: DATE_FORMAT.
--     При выборке из таблицы workers выведите дату в формате '31.12.2025'.
select to_char(date, 'dd.MM.YYYY')
from workers;

--     При выборке из таблицы workers выведите дату в формате '2025% 31.12'.
select to_char(date, 'YYYY%.dd.MM')
from workers;
--     На INTERVAL, DATE_ADD, DATE_SUB
--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: INTERVAL, DATE_ADD, DATE_SUB.
--     При выборке из таблицы workers прибавьте к дате 1 день.
select (date + interval '1 day')
from workers;



--     При выборке из таблицы workers отнимите от даты 1 день.
select (date - interval '1 day')
from workers;
--     При выборке из таблицы workers прибавьте к дате 1 день, 2 часа.
select (date + interval '1 day 2 hour')
from workers;
--     При выборке из таблицы workers прибавьте к дате 1 год, 2 месяца.
select (date + interval '1 year 2 month')
from workers;
--     При выборке из таблицы workers прибавьте к дате 1 день, 2 часа, 3 минуты.
select (date + interval '1 day 2 hour 3 minute')
from workers;
--     При выборке из таблицы workers прибавьте к дате 1 день, 2 часа, 3 минуты, 5 секунд.
select (date + interval '1 day 2 hour 3 minute 5 second')
from workers;
--     При выборке из таблицы workers прибавьте к дате 2 часа, 3 минуты, 5 секунд.
select (date + interval '2 hour 3 minute 5 second')
from workers;
--     При выборке из таблицы workers прибавьте к дате 1 день и отнимите 2 часа.
select (date + interval '1 day' - interval '2 hour')
from workers;
--     При выборке из таблицы workers прибавьте к дате 1 день и отнимите 2 часа, 3 минуты.
select (date + interval '1 day' - interval '2 hour 3 minute')
from workers;
--     На математические операции
--     При выборке из таблицы workers создайте новое поле res, в котором будет число 3.
select 3 as res
from workers;
--     При выборке из таблицы workers создайте новое поле res, в котором будет строка 'eee'.
select 'еее' as res
from workers;
--     При выборке из таблицы workers создайте новое поле 3, в котором будет число 3.
select 3 "3"
from workers;
--     При выборке из таблицы workers создайте новое поле res, в котором будет лежать сумма зарплаты и возраста.
select salary, age, (salary + age) as res
from workers;
--     При выборке из таблицы workers создайте новое поле res, в котором будет лежать разность зарплаты и возраста.
select salary, age, (salary - age) as res
from workers;
--     При выборке из таблицы workers создайте новое поле res, в котором будет лежать произведение зарплаты и возраста.
select salary, age, (salary * age) as res
from workers;
--     При выборке из таблицы workers создайте новое поле res, в котором будет лежать среднее арифметическое зарплаты и возраста.
select salary, age, ((salary + age) / 2) as res
from workers;

--     Выберите из таблицы workers все записи, в которых сумма дня и месяца меньше 10-ти.
select *
from workers where (extract(day from date) + extract(month from date))<10;
--     На LEFT, RIGHT, SUBSTRING
--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: LEFT, RIGHT, SUBSTRING.
--     При выборке из таблицы workers получите первые 5 символов поля description.
select "left"(description, 5)
from workers;
--     При выборке из таблицы workers получите последние 5 символов поля description.
select "right"(description, 5)
from workers;
--     При выборке из таблицы workers получите из поля description символы со второго по десятый.
select substring(description, 2, 10)
from workers;
--     На UNION (НЕ УСПЕЛ ЕЩЕ ИЗУЧИТЬ - в процессе)
--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: UNION.
--     Даны две таблицы: таблица category и таблица sub_category с полями id и name. Достаньте одним запросом названия категорий и подкатегорий.
--
--     На CONCAT, CONCAT_WS
--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: CONCAT, CONCAT_WS.
--     При выборке из таблицы workers создайте новое поле res, в котором будут лежать одновременно зарплата и возраст (слитно).
select concat(salary, age) as res
from workers;

--     При выборке из таблицы workers создайте новое поле res, в котором будут лежать одновременно зарплата и возраст (слитно), а после возраста будут идти три знака '!'.
select concat(salary, age, '!!!') as res
from workers;
--     При выборке из таблицы workers создайте новое поле res, в котором будут лежать одновременно зарплата и возраст через дефис.
select concat_ws('-', salary, age) as res
from workers;
--     При выборке из таблицы workers получите первые 5 символов логина и добавьте троеточие.
select concat("left"(login, 5), '...') as res
from workers;

--     На GROUP BY
--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: GROUP BY.
--     Найдите самые маленькие зарплаты по группам возрастов (для каждого возраста свою минимальную зарплату).
select age, min(salary)
from workers
group by age
order by age;

--     Найдите самый большой возраст по группам зарплат (для каждой зарплаты свой максимальный возраст).
select salary, max(age)
from workers
group by salary
order by salary;


--     На GROUP_CONCAT (НЕ УСПЕЛ ЕЩЕ ИЗУЧИТЬ)
--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: GROUP_CONCAT.
--     Выберите из таблицы workers уникальные возраста так, чтобы для каждого возраста было поле res, в котором будут лежать через дефис id записей с таким возрастом.
--
--     На подзапросы
--     Выберите из таблицы workers все записи, зарплата в которых больше средней зарплаты.
select *
from workers
where salary > (select avg(salary) from workers);

--     Выберите из таблицы workers все записи, возраст в которых меньше среднего возраста, деленного на 2 и умноженного на 3.
select *
from workers
where age < (select (avg(salary) / 2 * 3) from workers);
--     Выберите из таблицы workers записи с минимальной зарплатой.
select *
from workers
where salary = (select min(salary) from workers);
--     Выберите из таблицы workers записи с максимальной зарплатой.
select *
from workers
where salary = (select max(salary) from workers);
--     При выборке из таблицы workers создайте новое поле max,
--     в котором будет лежать максимальное значение зарплаты для возраста 25 лет.
select *, max(salary) as max
from workers
where age = 25
group by id, login, city, salary, age, date, description;


--     При выборке из таблицы workers создайте новое поле avg,
--     в котором будет лежать деленная на 2 разница между максимальным значением
--     возраста и минимальным значением возраста в во всей таблице.

select *, (select (max(age) - min(age)) / 2 from workers) as avg
from workers;

--     При выборке из таблицы workers создайте новое поле avg,
--     в котором будет лежать деленная на 2 разница между максимальным значением зарплаты
--     и минимальным значением зарплаты для возраста 25 лет.
select *, (select (max(salary) - min(salary)) / 2 from workers) as avg
from workers
where age = 25;

--     На JOIN (пока не дошел в Stepik, но как дойду все решу)
--     Для решения задач данного блока вам понадобятся следующие SQL команды и функции: JOIN.
--     Даны две таблицы: таблица category с полями id и name и таблица page с полями id, name и category_id. Достаньте одним запросом все страницы вместе с их категориями.
--
--     Даны 3 таблицы: таблица category с полями id и name, таблица sub_category с полями id и name и таблица page с полями id, name и sub_category_id. Достаньте одним запросом все страницы вместе с их подкатегориями и категориями.
--
--     На работу с полями
--     Задачи данного блока следует решать SQL запросами, а не через PhpMyAdmin.
--     Создайте базы данных test1 и test2.
create database test2;
create database test1;

--     Удалите базу данных test2.
drop database test1;

--     Создайте в базе данных test1 таблицы table1 и table2 с полями id, login, salary, age, date.
CREATE TABLE table1 /*делать это через консоль новой базы данных*/
(
    id     integer primary key generated always as identity,
    login  VARCHAR(30),
    salary int,
    age    int,
    date   DATE
);
CREATE TABLE table2 /*делать это через консоль новой базы данных*/
(
    id     integer primary key generated always as identity,
    login  VARCHAR(30),
    salary int,
    age    int,
    date   DATE
);

--     Переименуйте таблицу table2 в table3.
alter table table2
    rename to table3;
--     Удалите таблицу table3.
drop table table3;

--     Добавьте в таблицу table1 поле status.
alter table table1
    add status text;
--     Удалите из таблицы table1 поле age.
alter table table1
drop column age;
--     Переименуйте поле login на user_login.
alter table table3
    rename column login to user_login;
--     Смените типа поля salary с int на varchar(255).
alter table table3
alter column salary type varchar(255) using salary::varchar(255);
--     Очистите таблицу table1.
delete
from table1;

--     Очистите все таблицы базы данных test1.
truncate test1;
