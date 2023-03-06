package creational.factory.simple;

public class ExhaustFan implements IFan {

    @Override
    public void switchOn() {
        System.out.println("Вытяжной вентилятор включился");
    }

    @Override
    public void switchOff() {
        System.out.println("Вытяжной вентилятор выключился");
    }
}
