package by.tms.task2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import static by.tms.task2.utils.Constants.COUNT100KILOMETRES;
import static by.tms.task2.utils.Constants.FUEL_CONSUMPTION_LITRES_PER_100;

@AllArgsConstructor
@Getter
@Setter


public class Car implements RequiredFieldsCarClassesAware {

    private int fuelConsumptionFact;
    private Engine engine;
    private GasTank gasTank;
    private String model = "Dodge challenger";
    private int year = 1984;
    private int distanceTraveled;
    private boolean checkPowerOnButton;


    public Car(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    public Car(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public void startCar() {
        if (gasTank.getCurrentVolumeGas() > 0) {
            checkPowerOnButton = true;
            System.out.println("Проверка запуска двигателя...");
            engine.startEngine();
            System.out.println("Автомобиль заведен");
        } else {
            System.out.println("Нет топлива, машина не заводится");
        }
    }

    public void carRefuel(GasTank.r) {

    }

    public void checkFuelVolume() {

    }

    @Override
    public void go(int distanceTraveled) {
        System.out.println("Машина поехала");
        tripReport(distanceTraveled);
    }

    private void tripReport(int distanceTraveled) {
        fuelConsumptionFact = FUEL_CONSUMPTION_LITRES_PER_100 * distanceTraveled / COUNT100KILOMETRES;
        System.out.printf("Машина проехала километров: %d, потрачено литров топлива за поездку: %d\n", distanceTraveled, fuelConsumptionFact);
    }

    @Override
    public void go() {
        System.out.println("Машина поехала");
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
