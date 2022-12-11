package task2_clothes.model;

public class Trousers extends Clothes implements MenClothes, WomenClothes {
    public Trousers(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Надеты мужские штаны, размера %s, ценой %d, цветом %s ", getSize(), getPrice(), getColor());
    }

    @Override
    public void dressWomen() {
        System.out.printf("Надеты женские штаны, размера %s, ценой %d, цветом %s ", getSize(), getPrice(), getColor());
    }
}
