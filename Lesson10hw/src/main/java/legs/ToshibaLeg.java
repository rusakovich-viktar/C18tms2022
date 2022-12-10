package legs;

import by.tms.model.PartPrice;

public class ToshibaLeg extends PartPrice implements ILeg {

    public ToshibaLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println("Идет ногами Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
