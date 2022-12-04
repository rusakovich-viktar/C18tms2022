package by.tms.flowers;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Bouquet {
    private Flower[] flowers;

    public BigDecimal getPrice() {
        BigDecimal result = BigDecimal.ZERO;
        for (Flower flower : flowers) {
            result = result.add(Flower.getPrice());//хз что тут передавать в гет

        }
        return result;
    }


}
