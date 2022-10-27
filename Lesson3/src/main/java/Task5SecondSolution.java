/**
 * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
 * <p>
 * Example1:
 * 3
 * 4
 * return 5
 * <p>
 * Example2:
 * 12
 * 16
 * return 20
 */

public class Task5SecondSolution {
    public static double calculateHypotenuse(int a, int b) {
        return Math.hypot(a, b);
    }

    public static void main(String[] args) {
        System.out.println(calculateHypotenuse(3, 4));
        System.out.println(calculateHypotenuse(12, 16));
    }
}