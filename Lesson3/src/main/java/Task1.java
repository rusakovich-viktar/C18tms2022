public class Task1 {
    public static int sum(int a, int b) {
        if ((long) a + (long) b > Integer.MAX_VALUE || (long) a + (long) b < Integer.MIN_VALUE) {
            return -1;
        } else {
            return a + b;
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(100, 200));
        System.out.println(sum(-100, -200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(sum(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
}