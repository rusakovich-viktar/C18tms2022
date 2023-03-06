package creational.factory.abstractf;

public class USFan implements IFan {

    @Override
    public void switchOn() {
        System.out.println("Включился Американский вентилятор");
    }
}
