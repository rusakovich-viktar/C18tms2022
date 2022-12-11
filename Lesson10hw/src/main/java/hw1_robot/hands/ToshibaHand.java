package hw1_robot.hands;

import hw1_robot.PartPrice;

public class ToshibaHand extends PartPrice implements IHand {

    public ToshibaHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднял руку Toshiba");
    }

}
