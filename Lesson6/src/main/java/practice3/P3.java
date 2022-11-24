package practice3;

import java.util.Arrays;

public class P3 {
    //    Существует массив и его надо развернуть или инвертировать. например
    // 1,2,3 - 3,2,1
    public static void main(String[] args) {

        {
//            int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8};
            System.out.println(Arrays.toString(array));
            invertArray(array);
            System.out.println(Arrays.toString(array));
        }
//
//        {
//            int[] array = new int[]{0, -13, -42};
//            System.out.println(Arrays.toString(array));
//            invertArray(array);
//            System.out.println(Arrays.toString(array));
//        }
//
//        {
//            int[] array = new int[]{0, 100, 200, -23};
//            System.out.println(Arrays.toString(array));
//            invertArray(array);
//            System.out.println(Arrays.toString(array));
//        }
        testInvert(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        testInvert(new int[]{5, 6, 7, 8, 9});
        testInvert(new int[]{3, 4, 5, 6, 7, 8, 9});

    }

    private static void testInvert(int[] array) {
        System.out.println(Arrays.toString(array));
        int m = 0;
        invertArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static void invertArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }
}
