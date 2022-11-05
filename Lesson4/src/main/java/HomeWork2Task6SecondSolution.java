import java.math.BigInteger;
import java.util.Scanner;

/**
 * Задача со звездочкой!
 * Метод должен печатать все простые числа <1000
 * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
 */

// Метод запросит 2 числа и посчитает количество простых чисел в диапазоне
public class HomeWork2Task6SecondSolution {

    public static void main(String[] args) {
        printPrimeNumbers();
    }

    public static void printPrimeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число диапазона, число не может быть отрицательным");
        int firstDigit = scanner.nextInt();
        if (firstDigit < 0) {
            firstDigit = 0;
        }
        System.out.println("Введите последнее число диапазона, число не может быть меньше первого");
        int lastDigit = scanner.nextInt();
        int count = 0;
        for (int i = firstDigit; i <= lastDigit; i++) {
            if (i != 0 && i != 1) {
                BigInteger bigInteger = BigInteger.valueOf(i);
                boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(i));
                if (probablePrime) {
                    System.out.println(i);
                    count++;
                }
            }
        }
        System.out.println("Всего " + count + " простых чисел в диапазоне от " + firstDigit + " до " + lastDigit);
    }
}