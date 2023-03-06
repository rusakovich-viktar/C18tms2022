package creational.factory.method;

public class CeilingFanFactory implements IFanFactory {

    @Override
    public IFan createFan() {
        return new CeilingFan();
    }
}
