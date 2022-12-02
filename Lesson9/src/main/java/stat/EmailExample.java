package stat;

import java.util.ArrayList;
import java.util.List;

public class EmailExample {
    private final static List<String> EMAILS = initEmails();//это статический контент или список адресов клиентов.

    private static List<String> initEmails() {//или переписать в одну строчку
        List<String> result = new ArrayList<>();
        result.add("dd@mail.ru");
        result.add("dd1423fgg@gmail.com");
        result.add("dd3@mail.ru");
        return result;
    }

    private static List<String> emails1 = new ArrayList<>() {{
        add("12");
        add("13");
        add("14");
        add("126");
    }};

    public EmailExample() {
        System.out.println(EMAILS);
    }

    public static void main(String[] args) {
        for (String email : EMAILS) {
            System.out.println(email);
        }
    }
}
