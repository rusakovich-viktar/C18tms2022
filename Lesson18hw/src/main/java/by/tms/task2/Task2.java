package by.tms.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

//     * 2. Написать программу для вывода на экран дату следующего вторника.
public class Task2 {

    public static void main(String[] args) {
        LocalDate nextTuesday = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(nextTuesday);
    }
}