package SeasonFlowerL9.simple_flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FlowerType {
    ROSE(14),
    LILY(7),
    ASTER(5),
    GERBERA(5),
    TULIP(8),
    CACTUS(1),
    CARNATION(11);

    private final int price;
}
