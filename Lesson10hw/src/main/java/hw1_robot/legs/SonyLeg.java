package hw1_robot.legs;

import hw1_robot.PartPrice;

public class SonyLeg extends PartPrice implements ILeg {

    public SonyLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println("Идет ногами Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
