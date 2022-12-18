import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork {
    public static void main(String[] args) {

        System.out.println("Task1===========");
//     * По строкам дополнительная!
//     *  1) Даны строки разной длины c четным числом символов(казаки, просмотреть и так далее),
//     *  необходимо вернуть ее два средних знака.
//     * Например, если дана строка "string"  результат будет "ri", для строки "code" результат "od",  для "Practice" результат "ct".
        String[] wordsArray = {"казаки", "string", "code", "Practice"};
        printCentalWords(wordsArray);

        System.out.println("Task2=============");
//     * По  регулярным выражениям!
//     * 2) Дана строка "cab, ccab, cccab" Необходимо составить регулярное выражение, сделать класс Pattern, Matcher, вызвать метод find и вывести слова на консоль
//     * Должно вывести:
//     * cab
//     * ccab
//     * cccab
        String string = "cab, ccab, cccab";
        Pattern pattern = Pattern.compile("c+.b");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println("Task3============");
//     * 3) Дана строка "Versions: Java  5, Java 6, Java   7, Java 8, Java 12."  Найти все подстроки "Java X", где X - число и распечатать их.
        String stringJava = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        Pattern patternJava = Pattern.compile("Java\s+[0-9]+");
        Matcher matcherJava = patternJava.matcher(stringJava);
        while (matcherJava.find()) {
            System.out.println(matcherJava.group().replaceAll("\s+", "\s")); //если не надо было искать те что больше одного пробела и выравнивать их, то убрать все что реплейс и до конца)
        }

        System.out.println("Task4===========");
//     * 4*)со звездочкой! Предложение состоит из нескольких слов, разделенных пробелами. Например: "One two three раз два три one1 two2 123 ".
//     *  Найти количество слов, содержащих только символы латинского алфавита.
//     *  Необходимо составить регулярное выражение и вызвать его в методе split(Regexp)
//     *  String str = "One two three раз два три one1 two2 123 ";
//     *  System.out.println(str.split("регулярное выражение").length);
//     *  Подсказка: тут надо использовать:
//     *  1) группы ()
//     *  2) | - оператор или
//     *  3) [] - группировки символов
//     *  4) +,* - квантификаторы
//     *
//     *  PS: Кто не сможет осилить регулярное выражение, то сделайте как сможете!
        String str = "One two three раз два три one1 two2 123 ";
        System.out.println(str.split("[A-Za-z]+[^0-9]+").length);

//     *  5*)со звездочкой! В метод на вход приходит строка
//     *
//     *  public static boolean validate(String str) {
//            return false;
//        }
//     * Необходимо выполнить проверку на валидацию входящей строки и вернуть false или true
//     * - Строка должна содержать только маленькие латинские буквы и цифры 1 или 5 без знака подчеркивания.
//     * - Длина строки должна быть от 4 до 20 символов.
//     *
//     * PS: нужно посмотреть презентацию страница 44 (Метасимволы для группировки символов)
//     *
//     *
    }

    private static void printCentalWords(String[] wordsArray) {
        for (String word : wordsArray) {
            System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 1));
        }
    }
}