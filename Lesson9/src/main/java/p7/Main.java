package p7;

import static p7.Type.INTEGER;

public class Main {
    public static void main(String[] args) {
        Type type = INTEGER;
        System.out.println(type.parse("1"));
    }
}
