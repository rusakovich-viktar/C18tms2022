package by.tms.task2.model;

public interface RequiredFieldsCarClassesAware {

    default void go() {
        System.out.println("Машина поехала");
    }

    void startCar();

    void go(int distanceTraveled);

    void stopCar();
}