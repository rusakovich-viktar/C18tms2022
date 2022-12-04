package by.tms.flowers;

import lombok.*;
import lombok.experimental.UtilityClass;

import java.math.BigDecimal;


@ToString
@Setter
@Getter
@AllArgsConstructor
@UtilityClass
@NoArgsConstructor
public class Flower {

    private FlowerType flowerName; // по итогу у меня дублирвание идет и тут и в энам
    private BigDecimal price;  // то же самое,
    // не понимаю как передать энем в флауэр, флауэр в букет, букет в магазин, Как их связать вообще?

}