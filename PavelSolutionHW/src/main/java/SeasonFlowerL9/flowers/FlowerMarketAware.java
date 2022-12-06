package SeasonFlowerL9.flowers;

public interface FlowerMarketAware {
    //количество проданных цветов
    int getCountSoldFlowers();

    //информацию о букете
    String info();

    //выручка за день
    int getPriceInDay();

    Bouquet getBouquet(String... flowers);
}
