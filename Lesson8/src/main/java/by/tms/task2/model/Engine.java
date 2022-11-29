package by.tms.task2.model;

import lombok.Getter;

@Getter
public class Engine {

    private final String ENGINE;

    public Engine(String engine) {
        ENGINE = engine;
    }

    protected void startEngine() {
        System.out.println("Запуск двигателя...");
        System.out.println("Двигатель запущен");
    }

    protected void stopEngine() {
        System.out.println("Остановка двигателя...");
        System.out.println("Двигатель остановлен");
    }

}