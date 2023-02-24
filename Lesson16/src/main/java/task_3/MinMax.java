package task_3;

import java.util.Arrays;
import lombok.Getter;
import lombok.NonNull;

//     * 3)Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и максимального элемента массива.
//     * Массив является переменной класса. Массив должен передаваться в класс через конструктор.
//     * Написать метод принимающий MinMax объект и печатающий информацию об элементах.
@Getter
public class MinMax<T extends Number> {

    private final T[] arrayOfNumbers;

    public MinMax(@NonNull T[] array) {
//        Objects.requireNonNull(array);
        if (array.length == 0) {
            throw new IllegalArgumentException("array is empty");
        }
        this.arrayOfNumbers = array;
    }

    public T getMax() {
        Arrays.sort(arrayOfNumbers);
        return arrayOfNumbers[arrayOfNumbers.length - 1];
    }

    public T getMin() {
        Arrays.sort(arrayOfNumbers);
        return arrayOfNumbers[0];
    }
}
