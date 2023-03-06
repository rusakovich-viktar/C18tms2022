package creational.factory.method;

/*"Define an interface for creating an object, but let subclasses
decide which class to instantiate.
Factory Method lets a class defer instantiation to subclasses"
«Определите интерфейс для создания объекта, но позвольте подклассам
решать, какой класс создавать экземпляр.
Фабричный метод позволяет классу отложить создание экземпляра до подклассов»*/

public class Main {

    public static void main(String[] args) {
        IFanFactory fanFactory = new TableFanFactory();
        IFan fan = fanFactory.createFan();
        fan.switchOn();
    }
}