package task2_clothes.model;

public class TShirt extends Clothes implements MenClothes, WomenClothes {
    public TShirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Надета мужская футболка, размера %s, ценой %d, цветом %s ", getSize(), getPrice(), getColor());
    }

    @Override
    public void dressWomen() {
        System.out.printf("Надета женская футболка, размера %s, ценой %d, цветом %s ", getSize(), getPrice(), getColor());
    }
}
