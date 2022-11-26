package practice_hw.tms.practice2;

public class Practice3 {
    public static void main(String[] args) {
        //операторы перехода
        //break; continue; return

        double randomValue = getRandomValue(5);
        System.out.println(randomValue);

//        return прекращает действие не зависимо от того в цикле или в методе
//        if (true) {
//            System.out.println("true");
//            return;
//        }


//        System.out.println("123");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i + " " + j + ",");
//                break;
            }
            return;
        }

        String str = smth();
        if (str != null) {
            System.out.println(str.length() + " 11111");//NPE
        }


        //continue много вложеностей по коду
        //работает только в циклах
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        for (int j = 0; j < 2; j++) {
            System.out.println("j: " + j);
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    continue;
                }
                System.out.println(i);
            }
        }


//        Задача: вывести все элементы массива которые меньше 3
        int[] mass = new int[]{1, 2, 3, 4, 2};

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 3) {
                continue;
            }
            System.out.print(mass[i] + " ");
        }


        //---------------------------------------------------------------------------
        //break
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 3) {
                break;
            }
            System.out.println(mass[i]);

        }

//        задача с брейком

        calculation();
        System.out.println("Done!");

    }

    public static double getRandomValue(int i) {
        return Math.random() * i;
    }

    private static void calculation() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j > 5) {
                    System.out.println("ALARM");
                    return;
                }
                System.out.println(i + " " + j);
            }
        }
    }

    public static String smth() {
        System.out.println("start");
        if (false) {
            return "1";
        } else {
            System.out.println("end");
            return null;
        }
    }
}
