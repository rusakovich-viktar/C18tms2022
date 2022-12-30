package hw3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// * 3) Проверка на цензуру:
//         * Создаете 2 файла.
//         * 1 - й. Содержит исходный текст.
//         * 2 - й. Содержит слова недопустимые в тексте (black list). Структура файла определите сами,
//         хотите каждое слово на новой строке, хотите через запятую разделяйте.
//         * Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
//         встретилось ни одного недопустимого слова, то выводите сообщение о том что
//         текст прошел проверку на цензуру.
//         * Если нет, то выводите соответствующее сообщение, кол-во предложений не
//         прошедших проверку и сами предложения подлежащие исправлению.
public class Main {

    private static final String BLACKLIST = "Lesson15/src/main/java/hw3/blacklist.txt";
    private static final String BLACKLIST_SEPARATOR = "[;\n]";
    private static final String TEXT = "Lesson15/src/main/java/hw3/text.txt";


    public static void main(String[] args) {

        try {
            String text = Files.readString(Path.of(TEXT));
            String[] blacklist = Files.readString(Path.of(BLACKLIST)).split(BLACKLIST_SEPARATOR);
            if (hasBlacklistWordInString(text, blacklist)) {
                System.out.println("В тексте обнаружены слова из чёрного списка." +
                        "\nПредложения, подлежащие исправлению:");
                List<String> sentences = getSentencesFromText(text);
                int sentencesWithBLWords = 0;
                for (String sentence : sentences) {
                    if (hasBlacklistWordInString(sentence, blacklist)) {
                        System.out.println(sentence);
                        sentencesWithBLWords++;
                    }
                }
                System.out.println("Всего предложений, подлежащих исправлению: " + sentencesWithBLWords);
            } else {
                System.out.println("В тексте не встечаются слова из чёрного списка.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

    public static boolean hasBlacklistWordInString(String string, String[] blacklist) {
        for (String blWord : blacklist) {
            if (string.contains(blWord)) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getSentencesFromText(String text) {
        List<String> originalSentences = Arrays.asList(text.split("[!.?]\\s*"));

        List<String> result = new ArrayList<>();
//        Pattern midWordHyphen = Pattern.compile(MID_WORD_HYPHEN);
        for (String sentence : originalSentences) {
            String replacedSentence = sentence.replaceAll("-*\n+", "");
            result.add(replacedSentence);
//            Matcher mSentence = midWordHyphen.matcher(sentence);
//            result.add(mSentence.replaceAll(""));
        }
        return result;
    }
}