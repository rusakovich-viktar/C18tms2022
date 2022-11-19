public class Main {
    public static void main(String[] args) {
        User user = new User("Виктор", "Русакович", 31, "мужской");
        System.out.println(user.getNameSurName());
        System.out.println(user.userInfo());
        System.out.println(user.getAge());
        user.addAge(4);
        System.out.println(user.getAge());

        User user1 = new User("Никита", "мужской");
        System.out.println(user1.getName());
    }
}