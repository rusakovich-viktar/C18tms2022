package by.tms.hw2_clother.jacket;

import lombok.ToString;

@ToString
public class JacketSavage implements IJacket {
    @Override
    public void putOn() {
        System.out.println("куртка Savage надета");
    }

    @Override
    public void pullOff() {
        System.out.println("куртка Savage снята");
    }
}
