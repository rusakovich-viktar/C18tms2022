package by.tms.hw_robot.heads;

import by.tms.hw_robot.PartPrice;

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
