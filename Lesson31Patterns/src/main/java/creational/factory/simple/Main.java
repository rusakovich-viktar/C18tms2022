package creational.factory.simple;

public class Main {

    public static void main(String[] args) {
        IFanFactory simpleFactory = new FanFactory();
        IFan fan = simpleFactory.createFan(FanType.TableFan);
        fan.switchOn();
    }
}