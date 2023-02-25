package by.tms.hw_robot.legs;

import by.tms.hw_robot.PartPrice;

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
