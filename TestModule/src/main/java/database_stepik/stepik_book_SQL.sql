drop table book;
-- ВЫБОРКА ДАННЫХ STEPIK.org 1.2

--создание таблицы
CREATE TABLE book
(
    book_id SERIAL PRIMARY KEY,
    title   VARCHAR(50),
    author  VARCHAR(30),
    price   DECIMAL(8, 2),
    amount  INT
);

--Вставка записи в таблицу
INSERT INTO book(title, author, price, amount)
VALUES ('Мастер и Маргарита', 'Булгаков М.А.', 670.99, 3);
INSERT INTO book(title, author, price, amount)
VALUES ('Белая гвардия', 'Булгаков М.А.',
        540.50, 5);
INSERT INTO book(title, author, price, amount)
VALUES ('Идиот', 'Достоевский Ф.М.',
        460.00, 10);
INSERT INTO book(title, author, price, amount)
VALUES ('Братья Карамазовы',
        'Достоевский Ф.М.',
        799.01, 3);
-- INSERT INTO book(title, author, price, amount)
-- VALUES ('Игрок',
--         'Достоевский Ф.М.',
--         480.50, 10);
INSERT INTO book(title, author, price, amount)
VALUES ('Стихотворения и поэмы',
        'Есенин С.А.',
        650.00, 15);


--SQL запрос, который выберет все записи из таблицы:
SELECT *
FROM book;

--Выборка отдельных столбцов
select author, title, price
from book;

--Выбрать все названия книг и их количества из таблицы book , для столбца title задать новое имя Название.
select title as Название, author as Автор
from book;
--Выборка данных с созданием вычисляемого столбца,
select title, amount, amount * 1.65 as pack
from book;
/*В конце года цену всех книг на складе пересчитывают – снижают ее на 30%.
    Написать SQL запрос, который из таблицы book выбирает названия, авторов, количества и вычисляет новые цены книг.
    Столбец с новой ценой назвать new_price, цену округлить до 2-х знаков после запятой.
*/
SELECT title,
       author,
       amount,
       ROUND((price * 0.7), 2) AS new_price
FROM book;
/*Для каждой книги из таблицы book установим скидку следующим образом: если количество книг меньше 4,
    то скидка будет составлять 50% от цены, в противном случае 30%.*/

SELECT title,
       amount,
       price,
       case
           when (amount < 4) then (price * 0.5)
           else (price * 0.7) end AS sale
FROM book;
-- Если количество книг меньше 4 – то скидка 50%, меньше 11 – 30%, в остальных случаях – 10%.
-- И еще укажем какая именно скидка на каждую книгу.
select title,
       amount,
       price,
       round((case
                  when (amount < 4) then (price * 0.5)
                  when (amount < 11) then (price * 0.7)
                  else (price * 0.9) end), 2) as sale,
       case
           when (amount < 4) then ('скидка 50%')
           when (amount < 11) then ('скидка 30%')
           else ('скидка 10%') end            as Ваша_скидка
from book;
/*При анализе продаж книг выяснилось, что наибольшей популярностью пользуются книги Михаила Булгакова,
  на втором месте книги Сергея Есенина. Исходя из этого решили поднять цену книг Булгакова на 10%,
  а цену книг Есенина - на 5%. Написать запрос, куда включить автора, название книги и новую цену,
  последний столбец назвать new_price. Значение округлить до двух знаков после запятой.*/
select author,
       title,
       round(case
                 when author = 'Булгаков М.А.' then (price * 1.1)
                 when author = 'Есенин С.А.' then (price * 1.05)
                 else price end, 2) as new_price
from book;
-- Вывести название и цену тех книг, цены которых меньше 600 рублей.
SELECT title, price
FROM book
WHERE price < 600;
-- Вывести название, автора  и стоимость (цена умножить на количество) тех книг, стоимость которых больше 4000 рублей
SELECT title, author, price * amount AS total
FROM book
WHERE price * amount > 4000;
-- Вывести автора, название  и цены тех книг, количество которых меньше 10.
select author, title, price
from book
where amount < 10;
-- Вывести название, автора и цену тех книг, которые написал Булгаков, ценой больше 600 рублей
SELECT title, author, price
FROM book
WHERE price > 600
  AND author = 'Булгаков М.А.';
-- Вывести название, цену  тех книг, которые написал Булгаков или Есенин, ценой больше 600 рублей
SELECT title, author, price
FROM book
WHERE (author = 'Булгаков М.А.' OR author = 'Есенин С.А.')
  AND price > 600;
/*Вывести название, автора,  цену  и количество всех книг, цена которых меньше 500 или больше 600,
    а стоимость всех экземпляров этих книг больше или равна 5000.*/
select title, author, price, amount
from book
where (price < 500 or price > 600)
  and price * amount > 5000;
-- Выбрать названия и количества тех книг, количество которых от 5 до 14 включительно.
SELECT title, amount
FROM book
WHERE amount BETWEEN 5 AND 14;
-- Оператор  IN  позволяет выбрать данные, соответствующие значениям из списка.
-- Выбрать названия и цены книг, написанных Булгаковым или Достоевским.
SELECT title, price
FROM book
WHERE author IN ('Булгаков М.А.', 'Достоевский Ф.М.');
-- Вывести название и авторов тех книг, цены которых принадлежат интервалу от 540.50 до 800 (включая границы),
-- а количество или 2, или 3, или 5, или 7 .
select title, author
from book
where (price between 540.50 and 800)
  and (amount in (2, 3, 5, 7));
/*По умолчанию ORDER BY выполняет сортировку по возрастанию. Чтобы управлять направлением сортировки вручную,
  после имени столбца указывается ключевое слово ASC (по возрастанию) или DESC (по убыванию).
Столбцы после ключевого слова ORDER BY можно задавать:
названием столбца;
номером столбца;
именем столбца (указанным после AS).

Вывести название, автора и цены книг. Информацию  отсортировать по названиям книг в алфавитном порядке.*/
SELECT title, author, price
FROM book
ORDER BY title;

SELECT title, author, price
FROM book
ORDER BY 1;

-- Вывести автора, название и количество книг, в отсортированном в алфавитном
--     порядке по автору и по убыванию количества, для тех книг, цены которых меньше 750 рублей.
SELECT author, title, amount AS Количество
FROM book
WHERE price < 750
ORDER BY author, amount DESC;

SELECT author, title, amount AS Количество
FROM book
WHERE price < 750
ORDER BY author, Количество DESC;

SELECT author, title, amount AS Количество
FROM book
WHERE price < 750
ORDER BY 1, 3 DESC;

-- Вывести  автора и название  книг, количество которых принадлежит интервалу от 2 до 14 (включая границы).
--     Информацию  отсортировать сначала по авторам (в обратном алфавитном порядке), а затем по названиям книг (по алфавиту).
select author, title
from book
where amount between 2 and 14
order by author desc, title;
/*
%	Любая строка, содержащая ноль или более символов	SELECT * FROM book WHERE author LIKE '%М.%'
    выполняет поиск и выдает все книги, инициалы авторов которых содержат «М.»
_ (подчеркивание)	Любой одиночный символ	SELECT * FROM book WHERE title LIKE 'Поэм_'
    выполняет поиск и выдает все книги, названия которых либо «Поэма», либо «Поэмы» и пр.
Вывести названия книг, начинающихся с буквы «Б».*/
SELECT title
FROM book
WHERE title LIKE 'Б%';

-- Вывести название книг, состоящих ровно из 5 букв.
SELECT title
FROM book
WHERE title LIKE '_____';

-- Вывести книги, название которых длиннее 5 символов:
SELECT title
FROM book
WHERE title LIKE '______%';
-- Вывести названия книг, которые содержат букву "и" как отдельное слово, если считать,
-- что слова в названии отделяются друг от друга пробелами и не содержат знаков препинания.
SELECT title
FROM book
WHERE title LIKE '_% и _%' /*отбирает слово И внутри названия */
   OR title LIKE 'и _%' /*отбирает слово И в начале названия */
   OR title LIKE '_% и' /*отбирает слово И в конце названия */
   OR title LIKE 'и';
/* отбирает название, состоящее из одного слова И */
-- Вывести названия книг, которые состоят ровно из одного слова, если считать, что слова в названии отделяются друг от друга пробелами .
SELECT title
FROM book
WHERE title NOT LIKE '% %';
/*Вывести название и автора тех книг, название которых состоит из двух и более слов, а инициалы автора содержат букву «С».
    Считать, что в названии слова отделяются друг от друга пробелами и не содержат знаков препинания,
    между фамилией автора и инициалами обязателен пробел, инициалы записываются без пробела в формате:
    буква, точка, буква, точка. Информацию отсортировать по названию книги в алфавитном порядке.*/
select title, author
from book
where title like '%_% %_%'
  and author like '%С.%'
order by title;

select *
from book book;
-- ВЫБОРКА ДАННЫХ STEPIK.org 1.2

--создание таблицы
CREATE TABLE book
(
    book_id SERIAL PRIMARY KEY,
    title   VARCHAR(50),
    author  VARCHAR(30),
    price   DECIMAL(8, 2),
    amount  INT
);

--Вставка записи в таблицу
INSERT INTO book(title, author, price, amount)
VALUES ('Мастер и Маргарита', 'Булгаков М.А.', 670.99, 3);

--SQL запрос, который выберет все записи из таблицы:
SELECT *
FROM book;

--Вставка других записей
INSERT INTO book(title, author, price, amount)
VALUES ('Белая гвардия', 'Булгаков М.А.',
        540.50, 5);
INSERT INTO book(title, author, price, amount)
VALUES ('Идиот', 'Достоевский Ф.М.',
        460.00, 10);
INSERT INTO book(title, author, price, amount)
VALUES ('Братья Карамазовы',
        'Достоевский Ф.М.',
        799.01, 2);
INSERT INTO book(title, author, price, amount)
VALUES ('Стихотворения и поэмы',
        'Есенин С.А.',
        650.00, 15);

--Выборка отдельных столбцов
select author, title, price
from book;

--Выбрать все названия книг и их количества из таблицы book , для столбца title задать новое имя Название.
select title as Название, author as Автор
from book;
--Выборка данных с созданием вычисляемого столбца,
select title, amount, amount * 1.65 as pack
from book;
/*В конце года цену всех книг на складе пересчитывают – снижают ее на 30%.
    Написать SQL запрос, который из таблицы book выбирает названия, авторов, количества и вычисляет новые цены книг.
    Столбец с новой ценой назвать new_price, цену округлить до 2-х знаков после запятой.
*/
SELECT title,
       author,
       amount,
       ROUND((price * 0.7), 2) AS new_price
FROM book;
/*Для каждой книги из таблицы book установим скидку следующим образом: если количество книг меньше 4,
    то скидка будет составлять 50% от цены, в противном случае 30%.*/

SELECT title,
       amount,
       price,
       case
           when (amount < 4) then (price * 0.5)
           else (price * 0.7) end AS sale
FROM book;
-- Если количество книг меньше 4 – то скидка 50%, меньше 11 – 30%, в остальных случаях – 10%.
-- И еще укажем какая именно скидка на каждую книгу.
select title,
       amount,
       price,
       round((case
                  when (amount < 4) then (price * 0.5)
                  when (amount < 11) then (price * 0.7)
                  else (price * 0.9) end), 2) as sale,
       case
           when (amount < 4) then ('скидка 50%')
           when (amount < 11) then ('скидка 30%')
           else ('скидка 10%') end            as Ваша_скидка
from book;
/*При анализе продаж книг выяснилось, что наибольшей популярностью пользуются книги Михаила Булгакова,
  на втором месте книги Сергея Есенина. Исходя из этого решили поднять цену книг Булгакова на 10%,
  а цену книг Есенина - на 5%. Написать запрос, куда включить автора, название книги и новую цену,
  последний столбец назвать new_price. Значение округлить до двух знаков после запятой.*/
select author,
       title,
       round(case
                 when author = 'Булгаков М.А.' then (price * 1.1)
                 when author = 'Есенин С.А.' then (price * 1.05)
                 else price end, 2) as new_price
from book;
-- Вывести название и цену тех книг, цены которых меньше 600 рублей.
SELECT title, price
FROM book
WHERE price < 600;
-- Вывести название, автора  и стоимость (цена умножить на количество) тех книг, стоимость которых больше 4000 рублей
SELECT title, author, price * amount AS total
FROM book
WHERE price * amount > 4000;
-- Вывести автора, название  и цены тех книг, количество которых меньше 10.
select author, title, price
from book
where amount < 10;
-- Вывести название, автора и цену тех книг, которые написал Булгаков, ценой больше 600 рублей
SELECT title, author, price
FROM book
WHERE price > 600
  AND author = 'Булгаков М.А.';
-- Вывести название, цену  тех книг, которые написал Булгаков или Есенин, ценой больше 600 рублей
SELECT title, author, price
FROM book
WHERE (author = 'Булгаков М.А.' OR author = 'Есенин С.А.')
  AND price > 600;
/*Вывести название, автора,  цену  и количество всех книг, цена которых меньше 500 или больше 600,
    а стоимость всех экземпляров этих книг больше или равна 5000.*/
select title, author, price, amount
from book
where (price < 500 or price > 600)
  and price * amount > 5000;
-- Выбрать названия и количества тех книг, количество которых от 5 до 14 включительно.
SELECT title, amount
FROM book
WHERE amount BETWEEN 5 AND 14;
-- Оператор  IN  позволяет выбрать данные, соответствующие значениям из списка.
-- Выбрать названия и цены книг, написанных Булгаковым или Достоевским.
SELECT title, price
FROM book
WHERE author IN ('Булгаков М.А.', 'Достоевский Ф.М.');
-- Вывести название и авторов тех книг, цены которых принадлежат интервалу от 540.50 до 800 (включая границы),
-- а количество или 2, или 3, или 5, или 7 .
select title, author
from book
where (price between 540.50 and 800)
  and (amount in (2, 3, 5, 7));
/*По умолчанию ORDER BY выполняет сортировку по возрастанию. Чтобы управлять направлением сортировки вручную,
  после имени столбца указывается ключевое слово ASC (по возрастанию) или DESC (по убыванию).
Столбцы после ключевого слова ORDER BY можно задавать:
названием столбца;
номером столбца;
именем столбца (указанным после AS).

Вывести название, автора и цены книг. Информацию  отсортировать по названиям книг в алфавитном порядке.*/
SELECT title, author, price
FROM book
ORDER BY title;

SELECT title, author, price
FROM book
ORDER BY 1;

-- Вывести автора, название и количество книг, в отсортированном в алфавитном
--     порядке по автору и по убыванию количества, для тех книг, цены которых меньше 750 рублей.
SELECT author, title, amount AS Количество
FROM book
WHERE price < 750
ORDER BY author, amount DESC;

SELECT author, title, amount AS Количество
FROM book
WHERE price < 750
ORDER BY author, Количество DESC;

SELECT author, title, amount AS Количество
FROM book
WHERE price < 750
ORDER BY 1, 3 DESC;

-- Вывести  автора и название  книг, количество которых принадлежит интервалу от 2 до 14 (включая границы).
--     Информацию  отсортировать сначала по авторам (в обратном алфавитном порядке), а затем по названиям книг (по алфавиту).
select author, title
from book
where amount between 2 and 14
order by author desc, title;
/*
%	Любая строка, содержащая ноль или более символов	SELECT * FROM book WHERE author LIKE '%М.%'
    выполняет поиск и выдает все книги, инициалы авторов которых содержат «М.»
_ (подчеркивание)	Любой одиночный символ	SELECT * FROM book WHERE title LIKE 'Поэм_'
    выполняет поиск и выдает все книги, названия которых либо «Поэма», либо «Поэмы» и пр.
Вывести названия книг, начинающихся с буквы «Б».*/
SELECT title
FROM book
WHERE title LIKE 'Б%';

-- Вывести название книг, состоящих ровно из 5 букв.
SELECT title
FROM book
WHERE title LIKE '_____';

-- Вывести книги, название которых длиннее 5 символов:
SELECT title
FROM book
WHERE title LIKE '______%';
-- Вывести названия книг, которые содержат букву "и" как отдельное слово, если считать,
-- что слова в названии отделяются друг от друга пробелами и не содержат знаков препинания.
SELECT title
FROM book
WHERE title LIKE '_% и _%' /*отбирает слово И внутри названия */
   OR title LIKE 'и _%' /*отбирает слово И в начале названия */
   OR title LIKE '_% и' /*отбирает слово И в конце названия */
   OR title LIKE 'и';
/* отбирает название, состоящее из одного слова И */
-- Вывести названия книг, которые состоят ровно из одного слова, если считать, что слова в названии отделяются друг от друга пробелами .
SELECT title
FROM book
WHERE title NOT LIKE '% %';
/*Вывести название и автора тех книг, название которых состоит из двух и более слов, а инициалы автора содержат букву «С».
    Считать, что в названии слова отделяются друг от друга пробелами и не содержат знаков препинания,
    между фамилией автора и инициалами обязателен пробел, инициалы записываются без пробела в формате:
    буква, точка, буква, точка. Информацию отсортировать по названию книги в алфавитном порядке.*/
select title, author
from book
where title like '%_% %_%'
  and author like '%С.%'
order by title;

--1.3 Выбор уникальных элементов столбца
-- Выбрать различных авторов, книги которых хранятся в таблице book.
-- Другой способ – использование оператора GROUP BY, который группирует данные при выборке,
--     имеющие одинаковые значения в некотором столбце. Столбец, по которому осуществляется группировка, указывается после GROUP BY .
SELECT DISTINCT author
FROM book;

SELECT author
FROM book
GROUP BY author;
-- Отобрать различные (уникальные) элементы столбца amount таблицы book.
select distinct amount
from book
order by amount;
-- Выборка данных, групповые функции SUM и COUNT
-- Посчитать, количество различных книг и количество экземпляров книг каждого автора , хранящихся на складе.
-- Столбцы назвать Автор, Различных_книг и Количество_экземпляров соответственно.
select author as Автор, count(distinct title) as Различных_книг, sum(amount) as Количество_экземпляров
from book
group by author;

SELECT author                Автор,
       COUNT(distinct title) Различных_книг,
       SUM(amount)           Количество_экземпляров
FROM book
GROUP BY author;

-- Выборка данных, групповые функции MIN, MAX и AVG
-- Вывести минимальную цену книги каждого автора
SELECT author, MIN(price) AS min_price
FROM book
GROUP BY author;

-- Вывести фамилию и инициалы автора, минимальную, максимальную и среднюю цену книг каждого автора.
-- Вычисляемые столбцы назвать Минимальная_цена, Максимальная_цена и Средняя_цена соответственно.
Select author, MIN(price) Минимальная_цена, max(price) Максимальная_цена, avg(price) Средняя_цена
from book
group by author;

-- Вывести суммарную стоимость книг каждого автора.
SELECT author, SUM(price * amount) AS Стоимость
FROM book
GROUP BY author;
-- Найти среднюю цену книг каждого автора.
SELECT author, ROUND(AVG(price), 2) AS Средняя_цена
FROM book
GROUP BY author;
/*Для каждого автора вычислить суммарную стоимость книг S (имя столбца Стоимость),
    а также вычислить налог на добавленную стоимость  для полученных сумм (имя столбца НДС ) ,
    который включен в стоимость и составляет k = 18%,  а также стоимость книг  (Стоимость_без_НДС) без него.
    Значения округлить до двух знаков после запятой.
    В запросе для расчета НДС(tax)  и Стоимости без НДС(S_without_tax) использовать следующие формулы:*/
SELECT author,
       SUM(price * amount) AS                     Стоимость,
       round(SUM((price * amount) * 18 / 118), 2) НДС,
       round(SUM((price * amount) / 1.18), 2)     Стоимость_без_НДС
FROM book
GROUP BY author;
/*Вычисления по таблице целиком
Посчитать количество экземпляров книг на складе.*/
SELECT SUM(amount) AS Количество
FROM book;
/*Посчитать общее количество экземпляров книг на складе и их стоимость .*/
SELECT SUM(amount)         AS Количество,
       SUM(price * amount) AS Стоимость
FROM book;
/*Вывести  цену самой дешевой книги, цену самой дорогой и среднюю цену уникальных книг на складе.
    Названия столбцов Минимальная_цена, Максимальная_цена, Средняя_цена соответственно.
    Среднюю цену округлить до двух знаков после запятой.*/
select round(min(price), 2) Минимальная_цена,
       round(max(price), 2) Максимальная_цена,
       round(avg(price), 2) Средняя_цена
from book;

-- Выборка данных по условию, групповые функции
-- Найти минимальную и максимальную цену книг всех авторов, общая стоимость книг которых больше 5000.
-- Результат вывести по убыванию минимальной цены.
SELECT author, MIN(price) AS Минимальная_цена, MAX(price) AS Максимальная_цена
from book
group by author
HAVING sum(price * amount) > 5000
ORDER BY Минимальная_цена DESC;
-- Вычислить среднюю цену и суммарную стоимость тех книг, количество экземпляров которых принадлежит интервалу от 5 до 14,
--     включительно. Столбцы назвать Средняя_цена и Стоимость, значения округлить до 2-х знаков после запятой.
-- Если в запросе с групповыми функциями отсутствует GROUP BY, то для отбора записей используется ключевое слово WHERE.
SELECT round(avg(price), 2) AS Средняя_цена, round(sum(price * amount), 2) AS Стоимость
from book
where amount between 5 and 14;
/*WHERE и HAVING могут использоваться в одном запросе.
  При этом необходимо учитывать порядок выполнения  SQL запроса на выборку на СЕРВЕРЕ:
FROM
WHERE
GROUP BY
HAVING
SELECT
ORDER BY

Последовательность выполнения операций на сервере:
MySQL: FROM => WHERE => SELECT из будущего => GROUP BY => HAVING => SELECT из настоящего => ORDER BY => LIMIT.
PostgreSQL: FROM => WHERE = GROUP BY = HAVING = SELECT = DISTINCT = ORDER BY = LIMIT.

Поэтому мы смогли использовать Стоимость и в HAVING и в ORDER BY . В PostgreSQL мы такое не сможем провернуть в HAVING .

Сначала определяется таблица, из которой выбираются данные (FROM), затем из этой таблицы отбираются записи
в соответствии с условием  WHERE, выбранные данные агрегируются (GROUP BY),  из агрегированных записей выбираются те,
которые удовлетворяют условию после HAVING. Потом формируются данные результирующей выборки,
как это указано после SELECT ( вычисляются выражения, присваиваются имена и пр. ).
Результирующая выборка сортируется, как указано после ORDER BY.*/

-- Вывести максимальную и минимальную цену книг каждого автора, кроме Есенина, количество экземпляров книг которого больше 10.
SELECT author,
       MIN(price) AS Минимальная_цена,
       MAX(price) AS Максимальная_цена
FROM book
WHERE author <> 'Есенин С.А.'
GROUP BY author
HAVING SUM(amount) > 10;

/*Посчитать стоимость всех экземпляров каждого автора без учета книг «Идиот» и «Белая гвардия».
    В результат включить только тех авторов, у которых суммарная стоимость книг
    (без учета книг «Идиот» и «Белая гвардия») более 5000 руб. Вычисляемый столбец назвать Стоимость.
    Результат отсортировать по убыванию стоимости.*/
select author, sum(amount * price) as Стоимость
from book
where (title <> 'Идиот' and title <> 'Белая гвардия')
group by author
having sum(amount * price) > 5000
order by Стоимость desc;

-- 1.4  Вложенный запрос (подзапрос, внутренний запрос) – это запрос внутри другого запроса SQL.
-- Вывести информацию о самых дешевых книгах, хранящихся на складе.
SELECT title, author, price, amount
FROM book
WHERE price = (SELECT MIN(price)
               FROM book);

-- Вывести информацию (автора, название и цену) о  книгах, цены которых меньше или равны средней цене книг на складе.
-- Информацию вывести в отсортированном по убыванию цены виде. Среднее вычислить как среднее по цене книги.
select author, title, price
from book
where price <= (select avg(price) from book)
order by price desc;
-- Использование вложенного запроса в выражении
/*Вывести информацию о книгах, количество экземпляров которых отличается от среднего количества экземпляров книг на
    складе более чем на 3. То есть нужно вывести и те книги, количество экземпляров которых меньше среднего на 3,
    или больше среднего на 3.
  */
SELECT title, author, amount
FROM book
WHERE ABS(amount - (SELECT AVG(amount) FROM book)) > 3;
-- Вывести информацию (автора, название и цену) о тех книгах, цены которых превышают минимальную цену книги на складе
--     не более чем на 150 рублей в отсортированном по возрастанию цены виде.
select author, title, price
from book
where price <= ((select min(price) from book) + 150)
order by price;
-- Вывести информацию о книгах тех авторов, общее количество экземпляров книг которых не менее 12.
/*ПОЯСНЕНИЕ Вложенный запрос отбирает двух авторов (Достоевского и Есенина). А в основном запросе для каждой записи таблицы book
    проверяется, входит ли автор книги в отобранный список, если входит - информация о книге включается в запрос.*/
SELECT title, author, amount, price
FROM book
WHERE author IN (SELECT author
                 FROM book
                 GROUP BY author
                 HAVING SUM(amount) >= 12);
-- Вывести информацию (автора, книгу и количество) о тех книгах, количество экземпляров которых в таблице book не дублируется.
-- Таким образом, необходимо вывести те строки таблицы, у которых числа в столбце amount не повторяются.
-- Во вложенном запросе отберите те значения столбца amount, количество которых, вычисленное с помощью функции count(), равно 1.
select author, title, amount
from book
where amount in (select amount
                 from book
                 group by amount
                 having count(amount) = 1);
-- Вывести информацию о тех книгах, количество которых меньше самого маленького среднего количества книг каждого автора.

SELECT title, author, amount, price
FROM book
WHERE amount < ALL (SELECT AVG(amount)
                    FROM book
                    GROUP BY author);

-- Вывести информацию о тех книгах, количество которых меньше самого большого среднего количества книг каждого автора.
SELECT title, author, amount, price
FROM book
WHERE amount < ANY (SELECT AVG(amount)
                    FROM book
                    GROUP BY author);
/*Вывести информацию о книгах(автор, название, цена),
    цена которых меньше самой большой из минимальных цен, вычисленных для каждого автора.*/
SELECT author, title, price
FROM book
WHERE price < ANY (SELECT min(price)
                   FROM book
                   GROUP BY author);
-- Вывести информацию о книгах, количество экземпляров которых отличается от среднего количества экземпляров
--     книг на складе более чем на 3, а также указать среднее значение количества экземпляров книг.
SELECT title,
       author,
       amount,
       FLOOR((SELECT AVG(amount) FROM book)) AS Среднее_количество
FROM book
WHERE ABS(amount - (SELECT AVG(amount) FROM book)) > 3;
/*Посчитать сколько и каких экземпляров книг нужно заказать поставщикам, чтобы на складе стало одинаковое
    количество экземпляров каждой книги, равное значению самого большего количества экземпляров одной книги на складе.
    Вывести название книги, ее автора, текущее количество экземпляров на складе и количество заказываемых экземпляров книг.
    Последнему столбцу присвоить имя Заказ. В результат не включать книги, которые заказывать не нужно.*/
SELECT title, author, amount, ((SELECT max(amount) FROM book) - amount) AS Заказ
FROM book
WHERE amount not in (select max(amount) from book);

-- 1.5 ЗАПРОСЫ КОРРЕКТИРОВКИ ДАННЫХ
-- На данном уроке будут рассматриваться запросы для реализации типичных для склада действий:
-- получение нового товара (добавление, обновление, удаление данных);
-- продажа товара (обновление данных);
-- формирование заказа на новый товар (создание таблицы).

-- Создать таблицу поставка (supply), которая имеет ту же структуру, что и таблиц book.
create table supply
(
    supply_id serial primary key,
--     supply_id integer primary key generated always as identity(postgres)
--     INT PRIMARY KEY AUTO_INCREMENT (MYSQL)
    title     varchar(50),
    author    varchar(30),
    price     decimal(8, 2),
    amount    int
);

-- Добавление записей в таблицу
insert into supply (title, author, price, amount)
values ('Лирика', 'Пастернак Б.Л.', 518.99, 2),
       ('Черный человек', 'Есенин С.А.', 570.20, 6),
       ('Белая гвардия', 'Булгаков М.А.', 540.50, 7),
       ('Идиот', 'Достоевский Ф.М.', 360.80, 3);

select *
from supply;


-- Добавление записей из другой таблицы
-- Занести все книги из таблицы supply в таблицу book.
INSERT INTO book (title, author, price, amount)
SELECT title, author, price, amount
FROM supply;

-- Добавить из таблицы supply в таблицу book,
-- все книги, кроме книг, написанных Булгаковым М.А. и Достоевским Ф.М.
INSERT INTO book (title, author, price, amount)
SELECT title, author, price, amount
FROM supply
-- where author not in ('Булгаков М.А.', 'Достоевский Ф.М.');
WHERE author <> 'Булгаков М.А.'
  AND author <> 'Достоевский Ф.М.';
/* вместо not in*/

-- ДОБАВЛЕНИЕ ЗАПИСЕЙ, ВЛОЖЕННЫЕ ЗАПРОСЫ
-- Занести из таблицы supply в таблицу book только те книги, названия которых отсутствуют в таблице book.
INSERT INTO book (title, author, price, amount)
SELECT title, author, price, amount
FROM supply
WHERE title NOT IN (SELECT title
                    FROM book);
-- Занести из таблицы supply в таблицу book только те книги, авторов которых нет в  book.
INSERT INTO book (title, author, price, amount)
select title, author, price, amount
from supply
where author not in (select distinct
                     from book);

-- ЗАПРОСЫ НА ОБНОВЛЕНИЕ ЗНАЧЕНИЯ ПОЛЯ ОТДЕЛЬНОЙ СТРОКИ
-- Уменьшить на 30% цену книг в таблице book.
UPDATE book
SET price = 0.7 * price;

-- Уменьшить на 30% цену тех книг в таблице book, количество которых меньше 5.
update book
set price = price * 0.7
where amount < 5;
-- Уменьшить на 10% цену тех книг в таблице book, количество которых принадлежит
-- интервалу от 5 до 10, включая границы.
update book
set price = price * 0.9
where amount between 5 and 10;

-- ЗАПРОСЫ НА ОБНОВЛЕНИЕ НЕСКОЛЬКИХ СТОЛБЦОВ
-- В столбце buy покупатель указывает количество книг, которые он хочет приобрести. Для каждой книги, выбранной покупателем,
--     необходимо уменьшить ее количество на складе на указанное в столбце buy количество, а в столбец buy занести 0.
update book
set amount = amount - buy,
    buy    = 0;

-- добавить столбец в существующую таблицу
alter table book
    add column buy int;
-- заполнил новый столбец значениями
UPDATE book
SET buy = '0'
WHERE book_id between 1 and 5;
-- В таблице book необходимо скорректировать значение для покупателя в столбце buy таким образом, чтобы оно не превышало
--     количество экземпляров книг, указанных в столбце amount. А цену тех книг, которые покупатель не заказывал, снизить на 10%.
update book
set buy   = case when (buy > amount) then buy else amount end,
    price = case when (buy = 0) then (price * 0.9) else price end;
-- MY SQL
-- UPDATE book
-- SET buy = IF(buy > amount, amount, buy),
--     price = IF(buy = 0 , price * 0.9, price);

-- ЗАПРОСЫ НА ОБНОВЛЕНИЕ НЕСКОЛЬКИХ ТАБЛИЦ
-- Если в таблице supply  есть те же книги, что и в таблице book, добавлять эти книги в таблицу book не имеет смысла.
--     Необходимо увеличить их количество на значение столбца amount таблицы supply.
-- MYSQL
-- UPDATE book, supply
-- SET book.amount = book.amount + supply.amount
-- WHERE book.title = supply.title AND book.author = supply.author;

-- ЗАПРОСЫ НА УДАЛЕНИЕ
-- После того, как информация о книгах из таблицы supply перенесена в book , необходимо очистить таблицу  supply.
delete
from supply;

-- Удалить из таблицы supply все книги, названия которых есть в таблице book.
DELETE
FROM supply
WHERE title IN (SELECT title
                FROM book);
-- Удалить из таблицы supply книги тех авторов, общее количество экземпляров книг которых в
-- таблице book превышает 10.
delete
from supply
where author in (select author
                 from book
                 group by author
                 having sum(amount) > 10);

-- Запросы на создание таблицы на основе данных из другой таблицы.
-- Создать таблицу заказ (ordering), куда включить авторов и названия тех книг, количество экземпляров которых
--в таблице book меньше 4. Для всех книг указать одинаковое количество экземпляров 5.
CREATE TABLE ordering AS
SELECT author, title, 5 AS amount
FROM book
WHERE amount < 4;

-- Создать таблицу заказ (ordering), куда включить авторов и названия тех книг, количество экземпляров
--     которых в таблице book меньше 4. Для всех книг указать одинаковое значение - среднее количество экземпляров книг в таблице book.
CREATE TABLE ordering AS
SELECT author,
       title,
       (SELECT ROUND(AVG(amount))
        FROM book) AS amount
FROM book
WHERE amount < 4;

/*Создать таблицу заказ (ordering), куда включить авторов и названия тех книг, количество экземпляров
    которых в таблице book меньше среднего количества экземпляров книг в таблице book. В таблицу включить столбец
    amount, в котором для всех книг указать одинаковое значение - среднее количество экземпляров книг в таблице book.*/

create table ordering as
select author, title, (select round(avg(amount)) from book)
from book
where amount < (select round(avg(amount)) from book);

-- 1.6 ТАБЛИЦА "КОМАНДИРОВКИ", ЗАПРОСЫ НА ВЫБОРКУ
CREATE TABLE trip
(
    trip_id    integer primary key generated always as identity,
    name       VARCHAR(30),
    city       VARCHAR(25),
    per_diem   DECIMAL(8, 2),
    date_first DATE,
    date_last  DATE
);

INSERT INTO trip(name, city, per_diem, date_first, date_last)
VALUES ('Баранов П.Е.', 'Москва', 700, '2020-01-12', '2020-01-17'),
       ('Абрамова К.А.', 'Владивосток', 450, '2020-01-14', '2020-01-27'),
       ('Семенов И.В.', 'Москва', 700, '2020-01-23', '2020-01-31'),
       ('Ильиных Г.Р.', 'Владивосток', 450, '2020-01-12', '2020-02-02'),
       ('Колесов С.П.', 'Москва', 700, '2020-02-01', '2020-02-06'),
       ('Баранов П.Е.', 'Москва', 700, '2020-02-14', '2020-02-22'),
       ('Абрамова К.А.', 'Москва', 700, '2020-02-23', '2020-03-01'),
       ('Лебедев Т.К.', 'Москва', 700, '2020-03-03', '2020-03-06'),
       ('Колесов С.П.', 'Новосибирск', 450, '2020-02-27', '2020-03-12'),
       ('Семенов И.В.', 'Санкт-Петербург', 700, '2020-03-29', '2020-04-05'),
       ('Абрамова К.А.', 'Москва', 700, '2020-04-06', '2020-04-14'),
       ('Баранов П.Е.', 'Новосибирск', 450, '2020-04-18', '2020-05-04'),
       ('Лебедев Т.К.', 'Томск', 450, '2020-05-20', '2020-05-31'),
       ('Семенов И.В.', 'Санкт-Петербург', 700, '2020-06-01', '2020-06-03'),
       ('Абрамова К.А.', 'Санкт-Петербург', 700, '2020-05-28', '2020-06-04'),
       ('Федорова А.Ю.', 'Новосибирск', 450, '2020-05-25', '2020-06-04'),
       ('Колесов С.П.', 'Новосибирск', 450, '2020-06-03', '2020-06-12'),
       ('Федорова А.Ю.', 'Томск', 450, '2020-06-20', '2020-06-26'),
       ('Абрамова К.А.', 'Владивосток', 450, '2020-07-02', '2020-07-13'),
       ('Баранов П.Е.', 'Воронеж', 450, '2020-07-19', '2020-07-25');

/*Вывести из таблицы trip информацию о командировках тех сотрудников, фамилия которых заканчивается на букву «а»,
    в отсортированном по убыванию даты последнего дня командировки виде. В результат включить столбцы
    name, city, per_diem, date_first, date_last.*/

select name, city, per_diem, date_first, date_last
from trip
where name like '%а %'
order by date_last desc;

-- Вывести в алфавитном порядке фамилии и инициалы тех сотрудников, которые были в командировке в Москве.
select distinct name
from trip
where city like 'Москва'
order by name;

SELECT DISTINCT name
FROM trip
WHERE city = 'Москва'
ORDER BY name;

SELECT name
FROM trip
WHERE city = 'Москва'
GROUP BY name
ORDER BY name;

/*Для каждого города посчитать, сколько раз сотрудники в нем были.
Информацию вывести в отсортированном в алфавитном порядке по названию городов. Вычисляемый столбец назвать Количество.*/

select city, count(*) as Количество
from trip
group by city
order by city;

-- ОПЕРАТОР LIMIT
-- Вывести информацию о первой  командировке из таблицы trip. "Первой" считать командировку с самой ранней датой начала.
select *
from trip
order by date_first
limit 1;

-- Вывести два города, в которых чаще всего были в командировках сотрудники. Вычисляемый столбец назвать Количество.
select city, count(*) as Количество
from trip
group by city
order by 2 desc
limit 2;

-- Вывести информацию о командировках во все города кроме Москвы и Санкт-Петербурга (фамилии и инициалы сотрудников, город ,
-- длительность командировки в днях, при этом первый и последний день относится к периоду командировки).
-- Последний столбец назвать Длительность.
-- Информацию вывести в упорядоченном по убыванию длительности поездки, а потом по убыванию названий городов
-- (в обратном алфавитном порядке).

select name, city, (date_last - date_first + 1) as Длительность
from trip
where city not in ('Москва', 'Санкт-Петербург')
order by Длительность desc, city desc;
-- MYSQL
-- select name, city, (DATEDIFF(date_last, date_first) + 1) as Длительность
-- from trip
-- where city not in ('Москва', 'Санкт-Петербург')
-- order by Длительность desc, city desc;

-- Вывести информацию о командировках сотрудника(ов),
--     которые были самыми короткими по времени. В результат включить столбцы name, city, date_first, date_last.


SELECT *
FROM trip;


