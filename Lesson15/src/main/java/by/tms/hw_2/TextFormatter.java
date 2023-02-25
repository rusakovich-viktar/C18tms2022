package by.tms.hw_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextFormatter {

    private static final String WORD_REGEX = "[\\wа-яА-Я]+";
    private static final String SENTENCE_SPLIT_REGEX = "(?<=[?.!])\\s*";
    private static final String MID_WORD_HYPHEN = "(?<=[\\wа-яА-Я])-[$\\r\\n]+(?=[\\wа-яА-Я])";

    public static List<String> getSentencesFromText(String text) {
        //Пришел текст>Сплит>Преобразован в массив > Через asList преобразован в список
        // Arrays.asList Возвращает список фиксированного размера, поддерживаемый указанным массивом.
        // Изменения, внесенные в массив, будут видны в возвращаемом списке, а изменения, внесенные в список, будут видны в массиве)
        List<String> originalSentences = Arrays.asList(text.split("[!.?]\\s*")); //упрощенный SENTENCE_SPLIT_REGEX

        List<String> result = new ArrayList<>();
//        Pattern midWordHyphen = Pattern.compile(MID_WORD_HYPHEN);
        for (String sentence : originalSentences) {
            String replacedSentence = sentence.replaceAll("-*\n+", " ");
            result.add(replacedSentence);
//            Matcher mSentence = midWordHyphen.matcher(originalSentences);
//            result.add(mSentence.replaceAll(""));
        }
        return result;
    }

    public static int getCountWordsInString(String string) {
        return identifyWords(string).size();
    }

    private static List<String> identifyWords(String string) {
        return Arrays.asList(string.split(" "));
//        return Pattern.compile(WORD_REGEX).matcher(string)
//                .results()
//                .map(MatchResult::group)
//                .collect(Collectors.toList());
    }

    public static boolean hasPalindromeInString(String string) {
        for (String word : identifyWords(string)) {
            if (isPalindrome(word)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPalindrome(String string) {
        if (string.length() < 2) {
            return false;
        }
        StringBuilder sb = new StringBuilder(string);
        return string.equalsIgnoreCase(sb.reverse().toString());
    }
}