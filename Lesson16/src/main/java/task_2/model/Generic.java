package task_2.model;
//+++    * 2) Обобщенный класс с тремя параметрами
//+++     * Создать обобщенный класс с тремя параметрами (T, V, K).
//+++            * Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K),
//+++            * методы возвращающие значения трех переменных.
//+++            Создать метод, выводящий на консоль имена классов для трех переменных класса.
//            * Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (String),
//     * V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.

import java.io.Serializable;

public class Generic<T extends Comparable<String>, V extends Animal & Serializable, K extends Number> {

    private final T t;
    private final V v;
    private final K k;

    public Generic(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void getNameClasses() {
        System.out.println(t.getClass().getName());
        System.out.println(v.getClass().getName());
        System.out.println(k.getClass().getName());
    }
}