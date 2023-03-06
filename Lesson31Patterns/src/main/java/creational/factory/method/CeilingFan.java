package creational.factory.method;


public class CeilingFan implements IFan {

    @Override
    public void switchOn() {
        System.out.println("Потолочный вентилятор включился");

    }

    @Override
    public void switchOff() {
        System.out.println("Потолочный вентилятор выключился");
    }
}
