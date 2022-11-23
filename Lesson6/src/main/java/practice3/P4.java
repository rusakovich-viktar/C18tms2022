package practice3;

import java.util.Arrays;

public class P4 {
    //сортировка пузырьком
    public static void main(String[] args) {
        int[] array = {3, 10, 5, 1, 9};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        // i - номер прохода
        for (int i = 0; i < array.length - 1; i++) {
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        //O(n*n+n) = O(n^2)
    }

}
