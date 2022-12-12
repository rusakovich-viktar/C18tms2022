package by.tms.flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Flower {

    private static int totalSold = 0;
    private FlowerType flowerType;
    private int price;

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
        totalSold++;
    }

    public static int getTotalSold() {
        return totalSold;
    }
}
