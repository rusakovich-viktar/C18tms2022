package heads;

import by.tms.model.PartPrice;

public class SonyHead extends PartPrice implements IHead {

    public SonyHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}