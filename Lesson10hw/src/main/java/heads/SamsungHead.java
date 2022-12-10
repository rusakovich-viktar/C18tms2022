package heads;

import by.tms.model.PartPrice;

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