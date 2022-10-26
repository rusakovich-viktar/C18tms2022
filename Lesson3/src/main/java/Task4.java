import java.util.Arrays;
//Импорт для решения № 2
/**
 * Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
 **/
public class Task4 {
    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        if (max == Integer.MIN_VALUE) {
            return 0;
        } else {
            return max;
        }
    }

    /*Второй вариант решения*/

//    public static int max(int[] array) {
//        Arrays.sort(array);
//        if (array.length == 0) {
//            return 0;
//        } else {
//            return array[array.length - 1];
//        }
//    }

    public static void main(String[] args) {
        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        System.out.println(max(new int[]{-5, 999, 1005, 0}));
        System.out.println(max(new int[0]));
        System.out.println(max(new int[]{}));
    }
}
