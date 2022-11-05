/**
 * На вход приходит массив целых чисел типа int
 * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
 * в котором это значение распечатается на консоль.
 */
public class HomeWork2Task3 {

    public static void main(String[] args) {
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
    }

    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int count = 0;
        if (ints != null && ints.length > 0) {
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}