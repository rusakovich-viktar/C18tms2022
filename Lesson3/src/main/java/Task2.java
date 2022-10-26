/**
 * Метод должен вернуть максимальное значение из двух чисел
 *
 * <p>
 * Example1:
 * a = 4,
 * b = 5
 * <p>
 * Метод должен вернуть 5
 * Example2:
 * a = 10,
 * b = 10
 * <p>
 * Метод должен вернуть 10
 */

public class Task2 {
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        System.out.println(max(56, 349));
        System.out.println(max(Integer.MAX_VALUE, 349));
        System.out.println(max(Integer.MIN_VALUE, -5));
    }
}