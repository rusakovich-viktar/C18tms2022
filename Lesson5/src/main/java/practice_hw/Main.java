package practice_hw;

public class Main {
    public static void main(String[] args) {
//        int[] ints = new int[5];
//        int m = 9;
        int month = -1;
        int day = 0;

        Zodiac zodiac = new Zodiac();
        String name = zodiac.getZodiacName(month, day);
        if (name != null) {
            System.out.println("имя зодиака " + name);
        } else {
            System.out.println("не корректны данные");
        }
    }
}
