package task2_clothes.model;

public class Skirt extends Clothes implements WomenClothes {

    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.printf("Надета женская юбка, размера %s, ценой %d, цветом %s ", getSize(), getPrice(), getColor());
    }
}
