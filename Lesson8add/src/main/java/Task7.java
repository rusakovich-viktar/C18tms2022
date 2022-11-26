/*7. Реализуйте алгоритм сортировки пузырьком.*/
// Практика 6 урок

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        //сортировка пузырьком
        int[] array = {3, 10, 5, 1, 9};
        sortBubble(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortBubble(int[] array) {
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
    }
}