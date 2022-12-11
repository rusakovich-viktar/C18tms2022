package hw1_robot.hands;

import hw1_robot.PartPrice;

public class SonyHand extends PartPrice implements IHand {

    public SonyHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднял руку Sony");
    }

}
