package hw2;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;

public class TextFormatter {

    public ArrayList<String> stringArrayList(String string) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (StringUtils.isNotEmpty(string)) {
            String[] sentences = string.split("\\. ?");
            for (String sentence : sentences) {
                if ((getOrdinalWordNumber(sentence) >= 3 && getOrdinalWordNumber(sentence) <= 5) || (isPalindrome(sentence))) {
                    arrayList.add(sentence.trim());
                } else if (isPalindrome(sentence.trim())) {
                    arrayList.add(sentence);
                }
            }
        }
        return arrayList;
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