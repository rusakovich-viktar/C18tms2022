package by.tms.task3.utils;

import by.tms.task3.OperationAware;
import java.util.Scanner;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;

@UtilityClass
public class Task3Utils {

    public static OperationAware<String> reverseString = StringUtils::reverse;
    public static OperationAware<Integer> factorial = n -> {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = i * result;
        }
        return result;
    };

    public static int getNumberToChooseMethod(Scanner scanner) {
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
}