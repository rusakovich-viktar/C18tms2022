package hw2;

import java.io.*;
import java.util.ArrayList;

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
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(INPUT_FILE));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            String line;
            TextFormatter textFormatter = new TextFormatter();
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);//чет не срослось убрать лишний -
            }
            System.out.println(stringBuilder.toString());
            ArrayList<String> sentence = textFormatter.stringArrayList(stringBuilder.toString());
            for (String s : sentence) {
                bufferedWriter.write(s + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}