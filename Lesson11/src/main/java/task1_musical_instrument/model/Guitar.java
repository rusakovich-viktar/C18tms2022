package task1_musical_instrument.model;

public class Guitar implements IInstrument {
    private int stringCount;

    public Guitar(int stringCount) {
        this.stringCount = stringCount;
    }

    @Override
    public void play() {
        System.out.printf("играет гитара с количеством струн %d\n", stringCount);
    }

}
