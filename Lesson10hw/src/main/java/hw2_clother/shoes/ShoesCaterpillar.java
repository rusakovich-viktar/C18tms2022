package hw2_clother.shoes;

import lombok.ToString;

@ToString
public class ShoesCaterpillar implements IShoes {

    @Override
    public void putOn() {
        System.out.println("ботинки Caterpillar надеты");
    }

    @Override
    public void pullOff() {
        System.out.println("ботинки Caterpillar сняты");
    }
}
