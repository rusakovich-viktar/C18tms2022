package by.tms.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Bouquet {
    private Flower[] flowers;


    public int getPrice() {
        int BouquetPrice = 0;
        for (Flower flower : flowers) {
            BouquetPrice += flower.getPrice();
        }
        return BouquetPrice;
    }
}