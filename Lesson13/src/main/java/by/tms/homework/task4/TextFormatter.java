package by.tms.homework.task4;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class TextFormatter {

    public void printSentences(String string) {
        if (StringUtils.isNotEmpty(string)) {
            String[] sentences = string.split("\\. ?");
            for (String sentence : sentences) {
                if ((getOrdinalWordNumber(sentence) >= 3 && getOrdinalWordNumber(sentence) <= 5) || isPalindrome(sentence)) {
                    System.out.println(sentence.trim());
                }
            }
        } else {
            System.out.println("null или isEmpty");
        }
    }

    private boolean isPalindrome(String string) {
        String[] words = string.trim().split(" ");
        for (String word : words) {
            if (NumberUtils.isDigits(word) || word.length() < 2) {
                continue;
            }
            if (StringUtils.reverse(word).equalsIgnoreCase(word)) {
                return true;
            }
        }
        return false;
    }

    private int getOrdinalWordNumber(String string) {
        return string.trim().split(" ").length;
    }
}