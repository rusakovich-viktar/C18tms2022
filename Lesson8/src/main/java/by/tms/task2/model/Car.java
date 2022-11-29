package by.tms.task2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Car {

    private Engine engine;
    private GasTank gasTank;
    private String model;
    private int year;
    private int distanceTraveled;
    private boolean checkPowerOnOffButton;


    public Car(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    private void startCar() {
        if (gasTank.getCurrentVolumeGas() > 0) {
//            checkPowerOnOffButton = true;
            System.out.println("Проверка запуска двигателя...");
            engine.startEngine();
            System.out.println("Автомобиль заведен");
        } else {
            System.out.println("Нет топлива, машина не заводится");
        }
    }

    private void go() {
        System.out.println("Машина поехала");
    }


}
