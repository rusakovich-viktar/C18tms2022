package SeasonFlowerL9.flowers;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Магазин по продаже букетов из цветов.
 */
@Getter
public class FlowerMarket implements FlowerMarketAware {
    //        private int countSoldFlowers;//количество проданных цветов
    private final List<Bouquet> soldBouquets = new ArrayList<>();//проданные букеты

    //магазин умеет собирать(получать) букет из цветов
    public Bouquet getBouquet(String... flowers) {

        Flower[] result = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            String flowerName = flowers[i];

            Flower.Type type = findPriceByFlowerName(flowerName);
            if (type != null) {
                result[i] = new Flower(type.name(), type.getCost());
            }
        }
        Bouquet bouquet = new Bouquet(result);
        soldBouquets.add(bouquet);
        return bouquet;
    }

    private Flower.Type findPriceByFlowerName(String name) {
        for (Flower.Type flowerType : Flower.Type.values()) {
            if (flowerType.name().equalsIgnoreCase(name)) {
                return flowerType;
            }
        }
        return null;
    }

    //магазин умеет отдавать информацию о количестве проданных цветов
    //также можно узнать сколько продали букетов(как это сделать?)
    public int getCountSoldFlowers() {
        int count = 0;
        for (Bouquet soldBouquet : soldBouquets) {
            count += soldBouquet.getFlowers().length;
        }
        return count;
    }

    @Override
    public String info() {
        StringBuilder result = new StringBuilder();
        for (Bouquet soldBouquet : soldBouquets) {
            result.append(soldBouquet.toString());
        }
        return result.toString();
    }

    @Override
    public int getPriceInDay() {
        int price = 0;
        for (Bouquet soldBouquet : soldBouquets) {
            price += soldBouquet.getPrice();
        }
        return price;
    }

}
