package by.tms.hw_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/*2)Текстовый файл hw2/input.txt содержит текст.
 * После запуска программы в другой файл должны записаться только те предложения, в которых от 3-х до 5-ти слов.
 * Если в предложении присутствует слово-палиндром, то не имеет значения какое кол-во слов в предложении, оно попадает в output.txt файл.
 * Пишем все в ООП стиле. Создаем класс TextFormatter
 * в котором два метода:
 * 1. Метод принимает строку и возвращает кол-во слов в строке.
 * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
 * В main считываем файл.
 * Разбиваем текст на предложения. Используя методы класса TextFormatter определяем подходит ли нам предложение.
 * Если подходит добавляем его в output.txt файл*/
public class Main {

    public static final String INPUT_FILE = "Lesson15/src/main/java/hw2/input.txt";
    public static final String OUTPUT_FILE = "Lesson15/src/main/java/hw2/output.txt";

    public static void main(String[] args) {

        String text = null;
        try {
            text = Files.readString(Path.of(INPUT_FILE));
            List<String> sentences = TextFormatter.getSentencesFromText(text);
            List<String> filteredSentences = new ArrayList<>();
            for (String sentence : sentences) {
                int numberOfWords = TextFormatter.getCountWordsInString(sentence);
                if (numberOfWords >= 3 && numberOfWords <= 5 || TextFormatter.hasPalindromeInString(sentence)) {
                    filteredSentences.add(sentence);
                }
            }
            Files.write(Path.of(OUTPUT_FILE), filteredSentences);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}