package SeasonFlowerL9.simple_flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Bouquet {
    private Flower[] flowers;

    public int getPrice() {
        int result = 0;
        for (Flower flower : flowers) {
            result = result + flower.getFlowerType().getPrice();
        }
        return result;
    }
//    private String wrapper;
}
