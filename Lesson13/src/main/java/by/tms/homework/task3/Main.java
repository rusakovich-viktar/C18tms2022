package by.tms.homework.task3;

import org.apache.commons.lang3.StringUtils;

//    * 3) В массиве находятся слова. Вывести на экран слова палиндромы
//     * (т.е которые читаются справа на лево и слева на право одинаково, например: заказ, казак, дед...)
public class Main {

    public static void main(String[] args) {
        String[] wordsArray = {"еле-еле", "левел", "трицератопс", "шалаш", "наворован", "радуга"};
        for (String word : wordsArray) {
            if (word.equalsIgnoreCase(StringUtils.reverse(word))) {
                System.out.println(word);
            }
        }
    }
}