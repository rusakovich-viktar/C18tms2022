/**
 * //     * Метод должен вернуть среднее значение из массива чисел
 * //     * (необходимо сумму всех элеменов массива разделить на длину массива)
 * //     * <p>
 * //     * Example:
 * //     * array = {1,2,3,4,5}
 * //     * Метод должен return 3.0
 * //
 */
public class Task3 {
    public static double average(int[] array) {
        if (array != null) {
            double sumArray = 0;
            for (int i = 0; i < array.length; i++) {
                sumArray += array[i];
            }
            return sumArray / array.length;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(average(null));
        System.out.println(average(new int[]{}));
        System.out.println(average(new int[]{0}));
        System.out.println(average(new int[]{0, 3}));
        System.out.println(average(new int[]{0, 0, 3}));
        System.out.println(average(new int[]{1, 2, 3, 4, 5}));
        System.out.println(average(new int[]{0, -2, 3, -1, 5}));
    }
}