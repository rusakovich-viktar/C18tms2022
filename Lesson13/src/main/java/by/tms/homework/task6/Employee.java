package by.tms.homework.task6;

import lombok.AllArgsConstructor;
import lombok.Getter;

//Создать класс Employee, у которого есть переменные класса - String fullname, double salary.
//        * Создать массив содержащий несколько объектов этого типа. Создать класс Report (по возможности интерфейс),
//        * который будет содержать метод generateReport, в котором выводится информация о зарплате всех сотрудников.
//        * Используйте форматировании строк(https://javarush.ru/quests/lectures/questmultithreading.level02.lecture06)
//        * Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после запятой и по одной первой букве имени и отчества через точки.
//        * Пример: | Л.Н. Толстой		|		200.34|
@AllArgsConstructor
@Getter
public class Employee {
    private String fullName;
    private double salary;


}
