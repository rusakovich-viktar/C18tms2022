package hw2_clother.trousers;

import lombok.ToString;

@ToString
public class TrousersZara implements ITrousers {

    @Override
    public void putOn() {
        System.out.println("Штаны Zara надеты");
    }

    @Override
    public void pullOff() {
        System.out.println("Штаны Zara сняты");
    }
}
