package practice.p0;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        System.out.println(getVal());
//        getValue();
        getValue(1, true, false, true);
//        getValue(1);

//        int[] ints = {1, 2, 3, 5};
        getValue(1, 2, 34, 4);

        getValue(12, true);
    }

    private static int getVal() {
        return new Short((short) 10);
    }


    static void getValueMass(int[] args) {
        //работаем с массивом
    }

    static void getValue(int... args) {//синтаксический сахар
        System.out.println(Arrays.toString(args));
    }

//    static void getValue(int... args, boolean b) {
//
//    }

    static void getValue(int a, boolean... b) { //boolean[]
        int[] massiv = {1, 2, 3};
        System.out.println(massiv.length);//
        for (int index = 0; index < massiv.length; index++) {
            System.out.println(massiv[index]);
        }
        System.out.println();
    }

}
