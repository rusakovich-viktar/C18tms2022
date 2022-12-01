package by.tms.task2.model;

public interface RequiredFieldsEngineClassAware {

    default void stopEngine() {
        System.out.println("Остановка двигателя...");
        System.out.println("Двигатель остановлен");
    }

    default void startEngine() {
        System.out.println("Запуск двигателя...");
        System.out.println("Двигатель запущен");
    }

}
