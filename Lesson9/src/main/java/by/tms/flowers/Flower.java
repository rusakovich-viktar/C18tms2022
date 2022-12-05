package by.tms.flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter

public class Flower {

    private static int totalSold = 0;
    private String name;
    private int price;

    public Flower(String name, int price) {
        this.name = name;
        this.price = price;
        totalSold++;
    }

    public static int getTotalSold() {
        return totalSold;
    }
}
