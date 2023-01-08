package by.tms.model.Task3;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Task3Result {
    static OperationAware<String> reverseString = StringUtils::reverse;
    static OperationAware<Integer> factorial = (n) -> {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = i * result;
        }
        return result;
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = getNumberToChooseMethod(scanner);
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
            case 1 -> System.out.println(reverseString.operation(inputString));
            case 2 -> System.out.println(factorial.operation(inputNumber));
        }
    }

    private static int getNumberToChooseMethod(Scanner scanner) {
        int value = 0;
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

    @FunctionalInterface
    interface OperationAware<T> {
        T operation(T t);
    }
}