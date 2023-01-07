package by.tms.model.Task3;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Task3Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = -1;
        value = checkScanner(scanner, value);
        String inputString = null;
        int inputNumber = 0;
        if (value == 1) {
            System.out.println("Введите слово для реверса");
            while (StringUtils.isEmpty(inputString)) {
                inputString = scanner.nextLine();
            }
        } else {
            System.out.println("Введите положительное число для корректного расчета факториала");
            inputNumber = scanner.nextInt();

        }

        switch (value) {
            case 1 -> reverseText((inputString));
            case 2 -> factorialUsingStreams((inputNumber));
            default -> System.out.println(("Метод, который не произойдет (пока что)"));
        }
    }

    private static int checkScanner(Scanner scanner, int value) {
        do {
            System.out.println("Внимание! Введите 1 для реверса строки или 2 для вычисления факториала");
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
            } else {
                System.out.println("Проверьте введенное значение");
                scanner.next();
            }
        } while (!(value == 1 || value == 2));
        return value;
    }

    private static void reverseText(String text) {
        OperationAware<String> reverseString = StringUtils::reverse;
        System.out.println(reverseString.operation(text));
    }

    private static void factorialUsingStreams(int n) {
        System.out.println(LongStream.rangeClosed(1, n).reduce(1, (long x, long y) -> x * y));
    }

    //    @FunctionalInterface
//    interface StringOperation {
//        String reverse(String string);
//    }
    @FunctionalInterface
    interface OperationAware<T> {
        T operation(T t);
    }
}