package hw1_robot.heads;

import hw1_robot.PartPrice;

public class ToshibaHead extends PartPrice implements IHead {

    public ToshibaHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }

}
