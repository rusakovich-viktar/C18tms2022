package creational.factory.simple;


public class FanFactory implements IFanFactory {

    @Override
    public IFan createFan(FanType type) {
        return switch (type) {
            case TableFan -> new TableFan();
            case CeilingFan -> new CeilingFan();
            case ExhaustFan -> new ExhaustFan();
        };
    }
}
