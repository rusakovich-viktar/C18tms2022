package by.tms;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

//     * 3) Вывести список имен, но с первой заглавной буквой. список имен: "john", "arya", "sansa"
public class Task3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "arya", "sansa");
        names.stream()
                .map(StringUtils::capitalize)
                .forEach(System.out::println);
    }
}