package hw1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * 1)В исходном файле hw1/input.txt находятся слова, каждое слово на новой строке.
 * После запуска программы должен создать файл output.txt, который будет содержать в себе только палиндромы.
 */

public class Main {

    public static final String INPUT_FILE = "Lesson15/src/main/java/hw1/input.txt";
    public static final String OUTPUT_FILE = "Lesson15/src/main/java/hw1/output.txt";

    public static void main(String[] args) {
        //Pav

        try {
            List<String> words = Files.readAllLines(Path.of(INPUT_FILE));
            Files.write(Path.of(OUTPUT_FILE), getPalindromes(words));
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }

    public static List<String> getPalindromes(List<String> strings) { //Pav
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (isPalindrome(string)) {
                result.add(string);
            }
        }
        return result;
//        return strings.stream()
//                .filter(TextFormatter::isPalindrome)
//                .collect(Collectors.toList());
    }

    private static boolean isPalindrome(String string) { //Pav
        if (string.length() < 2) {
            return false;
        }
        StringBuilder sb = new StringBuilder(string);
        return string.equalsIgnoreCase(sb.reverse().toString());
    }
}