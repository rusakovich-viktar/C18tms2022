import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int number;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любые целые числа в диапазоне от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE + " и программа посчитает количество положительных." +
                "\nПри вводе числа, выходящего за диапазон значений, программа завершится с подсчетом чисел, введенных до некорректного значения.");
        System.out.println("Для завершения программы введите любой символ, отличающийся от целого числа.\n");
        System.out.println("Введите ваши числа ниже:");
        while (sc.hasNextInt()) {
            number = sc.nextInt();
            if (number > 0) {
                count++;
            }
        }
        System.out.println("\ud83c\udf81 " + "Количество положительных целых чисел = " + count);
    }
}