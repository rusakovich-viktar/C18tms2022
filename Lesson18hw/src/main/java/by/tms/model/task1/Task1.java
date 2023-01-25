package by.tms.model.task1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Task1 {
    // * Основное задание
//         * 1. Написать программу для вывода на консоль названия дня недели по
//         * введенной дате.
    public static void main(String[] args) {
        displayDayOfWeek(3, 29, 1991);
    }

    public static void displayDayOfWeek(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.of("RU")));
    }
}