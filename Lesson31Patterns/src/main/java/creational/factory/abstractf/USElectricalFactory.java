package creational.factory.abstractf;

public class USElectricalFactory implements IElectricalFactory {

    @Override
    public IFan getFan() {
        return new USFan();
    }

    @Override
    public ITubelight getTubeLight() {
        return new USTubelight();
    }
}
