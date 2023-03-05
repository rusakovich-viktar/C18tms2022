package creational.factory.method;

public class ExhaustFanFactory implements IFanFactory {

    @Override
    public IFan createFan() {
        return new ExhaustFan();
    }
}
