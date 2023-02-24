package by.tms.hw2_clother.jacket;

import lombok.ToString;

@ToString
public class JacketNike implements IJacket {
    @Override
    public void putOn() {
        System.out.println("куртка Nike надета");
    }

    @Override
    public void pullOff() {
        System.out.println("куртка Nike снята");
    }
}