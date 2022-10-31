import java.util.Scanner;

//2)Проверка четности числа
//Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
// чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
// Если пользователь введёт не целое число, то сообщать ему об ошибке.
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число для проверки чётности: ");
        while (true)
            if (scanner.hasNextInt()) {
                int inputNumber = scanner.nextInt();
                if (inputNumber % 2 == 0) {
                    System.out.println("Число " + inputNumber + " является чётным");
                } else {
                    System.out.println("Число " + inputNumber + " является нечётным");
                }
            } else {
                System.out.println("Ошибка, вы ввели не целое число");
                break;
            }
    }
}
