package by.tms.hw2_clother.jacket;

import lombok.ToString;

@ToString
public class JacketColumbia implements IJacket {

    @Override
    public void putOn() {
        System.out.println("куртка Columbia надета");
    }

    @Override
    public void pullOff() {
        System.out.println("куртка Columbia снята");
    }
}
