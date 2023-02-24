package by.tms.task1.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Task1Utils {

    public static void displayDayOfWeek(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.of("RU")));
    }
}