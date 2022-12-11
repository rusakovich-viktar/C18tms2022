package task1_musical_instrument.service;

import task1_musical_instrument.model.Drum;
import task1_musical_instrument.model.Guitar;
import task1_musical_instrument.model.IInstrument;
import task1_musical_instrument.model.Tube;

public class Main {
    public static void main(String[] args) {
        IInstrument[] instruments = new IInstrument[IInstrument.Type.values().length];
        instruments[0] = createInstrument(IInstrument.Type.GUITAR, 6);
        instruments[1] = createInstrument(IInstrument.Type.DRUM, 24);
        instruments[2] = createInstrument(IInstrument.Type.TUBE, 11);
        for (IInstrument instrument : instruments) {
            instrument.play();

        }
    }

    private static IInstrument createInstrument(IInstrument.Type iType, int argument) { //почему без статик не видит в классе?
        return switch (iType) {
            case GUITAR -> new Guitar(argument);
            case DRUM -> new Drum(argument);
            case TUBE -> new Tube(argument);
        };
    }
}
