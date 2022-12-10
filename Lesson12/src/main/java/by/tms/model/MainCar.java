package by.tms.model;

public class MainCar {
    public static void main(String[] args) {
        Car toyota = new Car("Тойота", 280, 25000);
        Car lada = new Car("Лада", 180, 8000);
        Car mazda = new Car("Мазда", 220, 14000);
        Car bmw = new Car("БМВ", 330, 39000);
        Car renault = new Car("Рено", 200, 12000);
        toyota.start();
        lada.start();
        mazda.start();
        bmw.start();
        renault.start();
    }
}
