package by.tms.hw_robot.heads;

import by.tms.hw_robot.PartPrice;

public class SamsungHead extends PartPrice implements IHead {

    public SamsungHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}