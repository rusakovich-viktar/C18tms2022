import java.util.Scanner;

import static java.lang.Math.abs;

//3) Меньшее по модулю число
//Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
// пользователем вещественных чисел с консоли.
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();
        System.out.println(Math.min(Math.min(abs(firstNumber), abs(secondNumber)), abs(thirdNumber)));
    }
}