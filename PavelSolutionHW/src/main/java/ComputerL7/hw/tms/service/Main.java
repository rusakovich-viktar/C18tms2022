package ComputerL7.hw.tms.service;

import com.tms.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Иван", "Иванов", 23, "мужской");
        System.out.println(user.getFirstLastName());
        user.addAge(10);
        System.out.println(user.getAge());
        System.out.println(user.info());
        System.out.println(user);
    }
}
