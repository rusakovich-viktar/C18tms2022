package task1_instrument.model;

public class Tube implements IInstrument {

    private int tubeDiameter;

    public Tube(int tubeDiameter) {
        this.tubeDiameter = tubeDiameter;
    }

    @Override
    public void play() {
        System.out.printf("играет труба диаметром %d см\n", tubeDiameter);
    }

}
