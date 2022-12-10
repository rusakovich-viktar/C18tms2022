package by.tms.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public enum FlowerType {
    ROSE("роза", 15),
    LILY("лилия", 7),
    ASTER("астра", 5),
    GERBERA("гербера", 5),
    TULIP("тюльпан", 8),
    CARNATION("гвоздика", 11);
    private final String NAME;
    private final int PRICE;
}
