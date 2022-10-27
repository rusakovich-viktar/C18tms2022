import java.util.Arrays;
//Импорт для решения № 2

/**
 * Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
 **/
public class Task4 {
//    public static int max(int[] array) {
//        if (array != null) {
//            int max = array[0];
//            for (int i = 1; i < array.length; i++) {
//                if (array[i] > max) {
//                    max = array[i];
//                }
//            }
//            return max;
//        } else {
//            return 0;
//        }
//    }

    /*Второй вариант решения*/

    public static int max(int[] array) {
        if (array != null) {
            Arrays.sort(array);
            return array[array.length - 1];
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        System.out.println(max(new int[]{-5, 999, 1005, 0}));
        System.out.println(max(null));
    }
}
