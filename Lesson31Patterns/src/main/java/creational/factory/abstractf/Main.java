package creational.factory.abstractf;

/*“Provide an interface for creating families of related or dependent
objects without specifying their concrete classes.”

«Предоставьте интерфейс для создания семейств связанных или зависимых
объектов без указания их конкретных классов».*/


public class Main {

    public static void main(String[] args) {
        IElectricalFactory electricalFactory = new USElectricalFactory();
        IFan fan = electricalFactory.getFan();
        fan.switchOn();
    }
}