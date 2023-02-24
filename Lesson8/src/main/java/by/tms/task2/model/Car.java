package by.tms.task2.model;

import static by.tms.task2.utils.Constants.COUNT_100_KILOMETRES;
import static by.tms.task2.utils.Constants.FUEL_CONSUMPTION_LITRES_PER_100;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Car implements RequiredFieldsCarClassesAware {

    private double fuelConsumptionFact;
    private Engine engine; //1
    private GasTank gasTank; //2
    private String model = "Dodge challenger";
    private int year = 1984;
    private double distanceTraveled;
    private boolean checkPowerOnButton;
    private double countDistanceAllTimes;

    public Car(Engine engine, GasTank gasTank) { //3
        this.engine = engine;
        this.gasTank = gasTank;
    }

    public void checkPowerOnButton() {
        checkPowerOnButton = true;
    }

    @Override
    public void startCar() {
        if (checkFuelVolume()) {
            checkPowerOnButton();
            System.out.println("Проверка запуска двигателя...");
            engine.startEngine();
            System.out.println("Автомобиль заведен");
        } else {
            System.out.println("Машина не завелась");
        }
    }

    public boolean checkFuelVolume() {
        if (gasTank.getCurrentVolumeGas() > 0) {
            return true;
        } else {
            System.out.println("Нет топлива");
            return false;
        }
    }

    @Override
    public void go(double distanceTraveled) {
        if (checkFuelVolume() && checkPowerOnButton) {

            System.out.println("Машина поехала");
            countDistanceAllTimes += distanceTraveled;
            fuelConsumptionFact = FUEL_CONSUMPTION_LITRES_PER_100 * distanceTraveled / COUNT_100_KILOMETRES;
            System.out.printf("Машина проехала километров: %.2f, потрачено литров топлива за поездку: %.2f\n", distanceTraveled, fuelConsumptionFact);
        }
    }

    @Override
    public void go() {
        System.out.println("Машина поехала");
    }

    public void getAllDistance() {
        System.out.printf("Общее пройденное расстояние %.2f\n", countDistanceAllTimes);
    }

    @Override
    public void stopCar() {
        checkPowerOnButton = false;
        System.out.println("Производится остановка автомобиля...");
        engine.stopEngine();
        System.out.println("Автомобиль остановлен");
        gasTank.getCurrentVolumeGas();
    }
}