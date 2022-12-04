package by.tms.task2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Engine implements RequiredFieldsEngineClassAware {

    private final String engine;

    void stopEngine() {
        System.out.println("Остановка двигателя...");
        System.out.println("Двигатель остановлен");
    }

    void startEngine() {
        System.out.println("Запуск двигателя...");
        System.out.println("Двигатель запущен");
    }
}