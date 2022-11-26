package practice_hw.tms.practice2;

public class Practice1_1 {
    public static void main(String[] args) {


//while (логическое выражение) //упрощенная версия for
//        while (true) {
//            System.out.println("1");
//        }
//
//        for (; ; ) {
//
//        }

//        while (true) {
//
//        }

        int count = 0;
        while (count++ < 5) {
            System.out.println("1");
//            if (count == 5) {
//                break;
//            }
//            count++;
        }

        //Задача
        //найти середину между i = 100 и j = 200 с помощью while
        int i = 100;
        int j = 200;
        while (!(++i == --j)) {//false - вышли из цикла
        }
        System.out.println("середина промежутка " + i);
        System.out.println("середина промежутка " + j);

        System.out.println();


        int l = 0;
        while (l <= 100) { //если условие false то не будет ни одной итерации
            System.out.println(l++);
        }


        //Задача: что выведет на консоль
        int kk = 0;
        while (true) {
            if (kk > 10) {
                break;
            }
            kk++;
        }
        System.out.println(kk);//11
    }
}
