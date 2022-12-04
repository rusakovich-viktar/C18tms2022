package by.tms.task2;

import by.tms.task2.model.Car;
import by.tms.task2.model.Engine;
import by.tms.task2.model.GasTank;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine("ДВС"), new GasTank(50, 50));
        car.startCar();
        System.out.println("====");
        car.stopCar();
        System.out.println("====");
        car.go();
        System.out.println("====");
        car.go(20.0);
        System.out.println("====");
        car.go(10.0);
        System.out.println("====");
        car.getAllDistance();
        System.out.println("====");


//        car.carRefuel();
    }
}
