package hw2_clother.trousers;

import lombok.ToString;

@ToString
public class TrousersBershka implements ITrousers {

    @Override
    public void putOn() {
        System.out.println("Штаны Bershka надеты");

    }

    @Override
    public void pullOff() {
        System.out.println("Штаны Bershka сняты");
    }
}
