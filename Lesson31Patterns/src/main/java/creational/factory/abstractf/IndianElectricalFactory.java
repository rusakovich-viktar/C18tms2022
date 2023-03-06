package creational.factory.abstractf;

public class IndianElectricalFactory implements IElectricalFactory {

    @Override
    public IFan getFan() {
        return new IndianFan();
    }

    @Override
    public ITubelight getTubeLight() {
        return new IndianTubelight();
    }
}
