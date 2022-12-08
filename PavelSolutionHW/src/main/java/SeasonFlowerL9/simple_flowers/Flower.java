package SeasonFlowerL9.simple_flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Flower {
    //    private String name;
//    private int price;
    private FlowerType flowerType;
    private static int count;

//    public Flower(String name, int price) {
//        this.name = name;
//        this.price = price;
//        count++;
//    }


    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
