package creational.factory.method;

public class TableFan implements IFan {

    @Override
    public void switchOn() {
        System.out.println("Настольный вентилятор включился");
    }

    @Override
    public void switchOff() {
        System.out.println("Настольный вентилятор выключился");
    }

}
