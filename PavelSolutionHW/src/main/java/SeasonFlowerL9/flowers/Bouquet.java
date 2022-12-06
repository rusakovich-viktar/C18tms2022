package SeasonFlowerL9.flowers;

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

    //можно получить цену всех цветов в букете
    public int getPrice() {
        int result = 0;
        for (Flower flower : flowers) {
            if (flower != null) {
                result = result + flower.getPrice();
            }
        }
        return result;
    }

    //можно удалить цветы из букета, если не понравились какие-то цветки
    public void deleteFlowers(String... removedFlowers) {
        for (String removedFlowerName : removedFlowers) {
            for (int i = 0; i < flowers.length; i++) {
                if (flowers[i] != null && removedFlowerName.equalsIgnoreCase(flowers[i].getName())) {
                    flowers[i] = null;
                    break;
                }
            }
        }
    }
}
