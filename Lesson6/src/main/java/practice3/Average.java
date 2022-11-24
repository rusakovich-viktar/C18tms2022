package practice3;

public class Average {
    public static void main(String[] args) {
        int[] nums = {10, 11, 12, 13, 14, 15};
        int result = findAverage(nums);
        System.out.println("Среднее арифметическое " + (double) result / nums.length);

        int[][] matrix = new int[3][5];
        for (int[] ints : matrix) {
            for (int i = 0; i < ints.length; i++) {
                System.out.println("");
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

            }
        }
//        O(n*n)= O(n^2)
//        O(n*m)
    }

    private static int findAverage(int[] nums) {
        int result = 0;
        //O(n+2) = O(n)
        for (int value : nums) {
            result = result + value;
            int v = 9;
        }
        return result;
    }
}
