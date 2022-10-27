/**
 * 1. Метод должен вернуть сумму двух чисел a и b
 * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
 **/
public class Task1 {
    public static int sum(int a, int b) {
        long sum = (long) a + (long) b;
        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
            return -1;
        } else {
            return (int) sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(100, 200));
        System.out.println(sum(-100, -200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(sum(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
}