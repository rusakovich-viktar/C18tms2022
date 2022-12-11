package hw2_clother.shoes;

import lombok.ToString;

@ToString
public class ShoesMarko implements IShoes {

    @Override
    public void putOn() {
        System.out.println("ботинки Marko надеты");
    }

    @Override
    public void pullOff() {
        System.out.println("ботинки Marko сняты");
    }
}
