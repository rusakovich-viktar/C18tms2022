package practice_hw.tms.practice;

import java.util.Arrays;
import java.util.Random;

public class Practice11 {
    public static void main(String[] args) {
        //поговорим про массивы
        int[] array = {100, 200, 36};
        Arrays.sort(array);
        System.out.println(array);
        System.out.println(Arrays.toString(array));

        int m;
        m = 2;
        int[][] mm2;
        mm2 = new int[2][2];
//        mm2 = null;


        //Random позволяет забивать рандомные числа в массивы, переменные
        Random random = new Random();
        System.out.println(random.nextInt(100) - 50);// [-50, 49]
        System.out.println(Math.random());

        //многомерные массивы
        int[][] nums2 = {
                {0, 1000, 2},
                {30, 4, 5},
                {30, 24, 25}
        };

        int[][][] matrix = new int[3][3][3];
        matrix[0][0][0] = 1;
        System.out.println(matrix[0][0][0]);

        nums2 = mm2;
        System.out.println("!" + nums2.length);

        int[][] mm = new int[2][];
        mm[0] = new int[3];
//        mm[1] = new int[5];

//        for (int[] ints : mm) {
        System.out.println(Arrays.deepToString(mm));
//        }

        System.out.println("!!!!");


        for (int i = 0; i < mm.length; i++) {
            for (int j = 0; j < mm[i].length; j++) {
                System.out.printf("%5d", mm[i][j]);
            }
            System.out.println();
        }

//        0 0 0
//        0 0 0 0 0


//        for (int i = 0; i < ; i++) {
//
//        }


        for (int[] ints : mm) {
            System.out.println(Arrays.toString(ints));
        }

//        // можно так вывести
        for (int[] ints : nums2) {
//            System.out.println(Arrays.deepToString(ints));
        }
//        int[][] nums2 = {
//                {0, 1000, 2},
//                {30, 4,   5},
//                {30, 24, 25}
//        };

//
//        //printf для форматированного вывода
        System.out.println("---------");
        for (int i = 0; i < nums2.length; i++) {//по строкам
            for (int j = 0; j < nums2[i].length; j++) {//по столбцам
                System.out.print(nums2[i][j] + " ");
            }
            System.out.println();
        }
    }

}
