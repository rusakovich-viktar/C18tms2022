package practice_hw.tms.practice2;

public class Practice1_0 {
    /**
     * https://overcoder.net/q/190300/в-чем-разница-между-циклом-i-и-i-для-java
     *
     * @param args
     */
    public static void main(String[] args) {

//       //Поговорим про for
////        for ([инициализация]; [логическое выражение]; [обновление]){
////            //тело цикла
////        }
//
        int[] mass = new int[5000];
//        1 2 3 4 5
        //Данные конструкции эквивалентны
        boolean b = true;
////
        for (int i = 0; i < mass.length && b; i += 3) { //i=i+3
            System.out.println("1");
            if (i == 3) {
                b = false;
            }
        }
        //1
//        for (int i = 0; i < mass.length; i++) {
//            System.out.println("1");
//        }
//        for (int i = 0; i < mass.length; ++i) {
//            System.out.println("1");
//        }
//        for (int i = 0; i < 3000; i++) {
//        //логика
//        }

//        for (int i = 0; i < mass.length; i++) {
//            System.out.println("1");
//        }
//
//
//        for (int i = 0; i < 10; i -= 2) {//i -=2  что будет?
//            System.out.print(i + " ");
////            break;
//        }


//        for (; ;) {
//
//        }


//        test();


//бесконечный цикл и выход из него
//        for (; ;) {
//
//        }
//

        for (int pp = 0; pp < 10; pp++) {
            System.out.print(pp + " ");
        }

        int pp = 0;
        for (; ; ) {
            System.out.print(pp + " ");
            if (pp++ >= 10) {
                break;
            }
        }

        //2 переменные в for
        for (int j = 0, k = 10; j < k; j++, k--) {
            System.out.println(j + " " + k);
        }
//------------------------------------------------------------------------------------------
//        Задача: используюя for вывести от 0 до 100 которые делятся нацело на 5 (оптимальное обновление нужно)

        for (int i = 5; i <= 10000000; i += 5) {
            System.out.println(i);
        }

        System.out.println();
//        for (int i = 5; i <= 100; i++) {
//            if (i % 5 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//        for (int i = 5; i <= 100; i += 5) {
//            System.out.print(i + " ");
//        }

    }

    private static void test() {
        while (true) {
            System.out.println("dsfsd");
        }
    }


}
