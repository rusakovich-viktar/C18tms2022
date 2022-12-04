package p6;

import static p6.DayOfWeek1.MONDAY;
import static p6.Sex.MALE;


public class Main {

    public static void main(String[] args) {

        System.out.println(MONDAY);


//        for (DayOfWeek1 value : DayOfWeek1.values()) {
//            System.out.println(value);
//        }

        DayOfWeek1 dayOfWeek1 = MONDAY;//DayOfWeek1.valueOf("MONDAY");

        System.out.println(dayOfWeek1.hashCode());
        System.out.println(dayOfWeek1.ordinal());


//        DayOfWeek1 dayOfWeek1 = DayOfWeek1.valueOf("monday");
//        System.out.println(dayOfWeek1);
        System.out.println(DayOfWeek1.class.getSuperclass());

        System.out.println(Sex.parse("мужской"));


        DayOfWeek dayOfWeek = createDayOfWeek(dayOfWeek1);


        Sex sex = MALE;
        System.out.println(sex == MALE);// false, true
        System.out.println(sex.equals(MALE));//true
//
//
        System.out.println(MALE);
        System.out.println(MALE + " ");
        System.out.println(MALE.getMyName());


//        System.out.println(MALE.parse("MALE").name());
//
//        for (Sex value : Sex.values()) {
//            System.out.print(value.name() + " ");
//        }
//
//
//        DayOfWeek dayOfWeek = new DayOfWeek("Суббота");
//        System.out.println(dayOfWeek);
//        System.out.println(DayOfWeek2.SUNDAY);
//
//        int value = 1;
//        Season season = getaVoid(value);
//        switch (season) {
//            case ЛЕТО:
//                System.out.println("лето");
//                break;
//            case ЗИМА:
//                System.out.println("зима");
//                break;
//        }
//
//        System.out.println(ЗИМА.myValue);
//
//        System.out.println(new Main().getClass().getSimpleName());
//
////        System.out.println(Season.ЗИМА);
////        Season season = Season.ЗИМА;
////        switch (season) {
////            case ЗИМА:
////                System.out.println("");
////                break;
////            case ЛЕТО:
////                System.out.println("");
////                break;
////        }
    }

    private static DayOfWeek createDayOfWeek(DayOfWeek1 dayOfWeek1) {
        switch (dayOfWeek1) {
            case MONDAY -> new DayOfWeek("понедельник");
            case SUNDAY -> new DayOfWeek("выходной");
        }
        return null;
    }

    private static Season getaVoid(int value) {
        for (Season season : Season.values()) {
            if (season.myValue == value) {
                return season;
            }
        }
        return null;
    }

    enum Type {
        ADT, LL
    }
}
