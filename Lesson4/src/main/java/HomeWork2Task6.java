import java.math.BigInteger;

/**
 * Задача со звездочкой!
 * Метод должен печатать все простые числа <1000
 * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
 */

public class HomeWork2Task6 {

    public static void main(String[] args) {
        printPrimeNumbers();
    }

    public static void printPrimeNumbers() {
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            BigInteger bigInteger = BigInteger.valueOf(i);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(i));
            if (probablePrime) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Всего " + count + " простых чисел в диапазоне от 0 до 1000");
    }
}