package task1_musical_instrument.model;

public class Drum implements IInstrument {
    private int drumSize;

    public Drum(int drumSize) {
        this.drumSize = drumSize;
    }

    @Override
    public void play() {
        System.out.printf("играет бас-барабан размером %d дюйма\n", drumSize);
    }
}
