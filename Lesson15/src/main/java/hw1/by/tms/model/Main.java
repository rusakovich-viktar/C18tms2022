package hw1.by.tms.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static hw1.by.tms.utils.TextFormatter.getPalindromes;

/**
 * 1)В исходном файле hw1/input.txt находятся слова, каждое слово на новой строке.
 * После запуска программы должен создать файл output.txt, который будет содержать в себе только палиндромы.
 */

public class Main {

    public static final String INPUT_FILE = "Lesson15/src/main/java/hw1/input.txt";
    public static final String OUTPUT_FILE = "Lesson15/src/main/java/hw1/output.txt";

    public static void main(String[] args) {


        try {
            List<String> words = Files.readAllLines(Path.of(INPUT_FILE));
            Files.write(Path.of(OUTPUT_FILE), getPalindromes(words));
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }


}