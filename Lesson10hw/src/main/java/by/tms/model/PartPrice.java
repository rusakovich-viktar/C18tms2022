package by.tms.model;

public abstract class PartPrice {
    public final int price;

    protected PartPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
