package by.tms.hw_robot.legs;

import by.tms.hw_robot.PartPrice;

public class SamsungLeg extends PartPrice implements ILeg {

    public SamsungLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println("Идет ногами Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
