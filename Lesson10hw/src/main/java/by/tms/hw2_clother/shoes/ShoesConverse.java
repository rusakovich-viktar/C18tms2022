package by.tms.hw2_clother.shoes;

import lombok.ToString;

@ToString
public class ShoesConverse implements IShoes {

    @Override
    public void putOn() {
        System.out.println("ботинки Converse надеты");
    }

    @Override
    public void pullOff() {
        System.out.println("ботинки Converse сняты");
    }
}
