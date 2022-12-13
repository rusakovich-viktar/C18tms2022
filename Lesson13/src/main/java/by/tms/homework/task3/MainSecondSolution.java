package by.tms.homework.task3;

//    * 3) В массиве находятся слова. Вывести на экран слова палиндромы
//     * (т.е которые читаются справа на лево и слева на право одинаково, например: заказ, казак, дед...)
public class MainSecondSolution {

    public static void main(String[] args) {
        String[] wordsArray = {"еле-еле", "левел", "трицератопс", "шалаш", "наворован", "радуга"};
        for (String word : wordsArray) {
            if (word.equalsIgnoreCase(new StringBuilder(word).reverse().toString())) {
                System.out.println(word);
            }
        }
    }
}