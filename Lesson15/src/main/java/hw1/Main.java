package hw1;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.io.*;

/**
 * 1)В исходном файле hw1/input.txt находятся слова, каждое слово на новой строке.
 * После запуска программы должен создать файл output.txt, который будет содержать в себе только палиндромы.
 */

public class Main {

    public static final String INPUT_FILE = "Lesson15/src/main/java/hw1/input.txt";
    public static final String OUTPUT_FILE = "Lesson15/src/main/java/hw1/output.txt";

    public static void main(String[] args) {
        String stringWithPalindrome = readPalindromeFromFile(INPUT_FILE);

        write(stringWithPalindrome, OUTPUT_FILE);
    }

    static String readPalindromeFromFile(String file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(INPUT_FILE))) {
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equalsIgnoreCase(StringUtils.reverse(line)) && !NumberUtils.isDigits(line)) {
                    stringBuilder.append(line).append("\n");
                }
            }
            System.out.println("Чтение палиндромов из файла завершено");
            return stringBuilder.toString();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    static void write(String stringWithPalindrome, String file) {
        try {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
                if (StringUtils.isNotEmpty(stringWithPalindrome)) {
                    bufferedWriter.write(stringWithPalindrome + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Запись в файл завершена (если файл был, конечно)");
    }
}