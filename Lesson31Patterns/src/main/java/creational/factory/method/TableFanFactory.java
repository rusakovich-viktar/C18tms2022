package creational.factory.method;

public class TableFanFactory implements IFanFactory {

    @Override
    public IFan createFan() {
        return new TableFan();
    }
}
