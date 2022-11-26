package practice_hw.tms.practice2;

import java.util.Random;

public class Practice1 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(10));
        }


//        boolean test = true;
//        if (1 < 5) {
//            System.out.println("1");
//        } else {
//            System.out.println("3");
//            System.out.println("2");
//        }


//        if (4 > 5) {
//            System.out.println("2");
//        } else {
//            System.out.println("2");
//        }
        //дейсвтие2


//        int a = 1;
//        if (a < 10) {
//            System.out.println("In the if block");
//        } else {
//            System.out.println("In the else block");
//          }


        boolean flag = true;
        if (5 > 10 || true && false && !flag) {
            System.out.println("1");
        }
//        if (3 > 1) {
//            System.out.println("2");
//        }
//        if (3 > 1) {
//            System.out.println("3");
//        } else {
//            System.out.println("else");
//        }


        int month = 4; // April
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "Winter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Spring";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Summer";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "Autumn";
        } else {
            season = "Not a Month";
        }

        month = 12;


        switch (month) {
            case 1, 2, 12: //month == 1
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("fdsdf");
                break;
        }

        System.out.println("!!!");

        switch (month) {
            case 1: //month == 1
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Not a Month");
        }


        System.out.println("April is in the " + season + ".");

        int a = 8;
        int b = 6;
        boolean bb = true;
//        !bb

        String result1;
        if (a > b) {
            getString();
        } else {
            getString2();
        }
//        a > b ? getString() : getString2();
    }

    private static void getString2() {
        System.out.println("!!!");
        System.out.println("a < b");
    }

    private static void getString() {
        System.out.println("a > b");
    }
}
