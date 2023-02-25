package by.tms.task3;

import by.tms.task3.utils.Task3Utils;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Task3Result {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Task3Utils.getNumberToChooseMethod(scanner);
        switch (value) {
            case 1 -> {
                System.out.println("Введите слово для реверса");
                String inputString = null;
                while (StringUtils.isEmpty(inputString)) {
                    inputString = scanner.nextLine();
                }
                System.out.println(Task3Utils.reverseString.operation(inputString));
            }
            case 2 -> {
                System.out.println("Введите положительное число для корректного расчета факториала");
                int inputNumber = scanner.nextInt();
                System.out.println(Task3Utils.factorial.operation(inputNumber));
            }
            default -> System.out.println("default");
        }
    }
}