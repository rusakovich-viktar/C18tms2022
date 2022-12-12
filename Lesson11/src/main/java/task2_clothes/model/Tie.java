package task2_clothes.model;

public class Tie extends Clothes implements MenClothes {

    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Надеты мужской галстук, размера %s, ценой %d, цветом %s ", getSize(), getPrice(), getColor());

    }
}
