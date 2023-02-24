package by.tms.hw_1.utils;

import java.util.ArrayList;
import java.util.List;

public class TextFormatter {

    public static List<String> getPalindromes(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (isPalindrome(string)) {
                result.add(string);
            }
        }
        return result;
//        return strings.stream()
//                .filter(TextFormatter::isPalindrome)
//                .collect(Collectors.toList());
    }

    private static boolean isPalindrome(String string) {
        if (string.length() < 2) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder(string);
        return string.equalsIgnoreCase(stringBuilder.reverse().toString());
    }

}