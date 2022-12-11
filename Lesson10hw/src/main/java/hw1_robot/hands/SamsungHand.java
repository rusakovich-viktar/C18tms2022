package hw1_robot.hands;

import hw1_robot.PartPrice;

public class SamsungHand extends PartPrice implements IHand {

    public SamsungHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднял руку Samsung");
    }
}

