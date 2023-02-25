package by.tms.hw2_clother.trousers;

import lombok.ToString;

@ToString
public class TrousersMarkFormelle implements ITrousers {

    @Override
    public void putOn() {
        System.out.println("Штаны MarkFormelle надеты");
    }

    @Override
    public void pullOff() {
        System.out.println("Штаны MarkFormelle сняты");
    }
}
