package practice_hw.tms.practice2;

import java.util.Scanner;

public class Practice1_3 {
    public static void main(String[] args) {
//        System.out.println("Введите число");
//        Scanner scanner = new Scanner(System.in);
//        int s = scanner.nextInt();
//        switch (s) {
//            case 3:
//                System.out.println("Лате готово");
//                break;
//            case 5:
//                System.out.println("Капучино готово");
//                break;
//            case 7:
//                System.out.println("sss");
//                break;
//            default:
//                System.out.println("Кофе готово");
//        }

//        String str = "12";
//        switch (str) {
//            case "12":
//                System.out.println("12");
//                break;
//            case "14":
//                System.out.print("14");
//                break;
//            default:
//                System.out.println("default");
//        }

//        if (s == 1) {
//            System.out.println("Лате готово");
//        } else if (s == 2) {
//            System.out.println("Капучино готово");
//        } else {
//            System.out.println("Кофе готово");
//        }


        int value = 0;
        System.out.println("Добро пожаловать в кафе, что будете?");
        Scanner scanner = new Scanner(System.in);
        boolean exist = true;
        while (exist) {
            value = getEnteredValueFromConsole(scanner);
            if (exist = value != 3) {
                System.out.println("Спасибо за выбор");
                switch (value) {
                    case 1 -> System.out.println("Лате готово");
                    case 2 -> System.out.println("Капучино готово");
                }
                System.out.println("Что то еще?");
            } else {
                System.out.println("До свидания! Будем рады Вас видеть еще.");
            }
        }
    }

    private static int getEnteredValueFromConsole(Scanner scanner) {
        int value = 0;
        do {
            menu();
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
            } else {
                scanner.next();
            }
        } while (value < 1 || value > 3);
        return value;
    }

    private static void menu() {
        System.out.println("лате (нажми 1)");
        System.out.println("капучино (нажми 2)");
        System.out.println("выход (нажми 3)");
    }
}
