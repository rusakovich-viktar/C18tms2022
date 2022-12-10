package by.tms.flowers;

public class FlowerMarket {
    private static int countOfFlowersSold;

    public Bouquet getBouquet(FlowerType... flowers) {
        Flower[] bouquetFlowers = new Flower[flowers.length];
        for (int i = 0; i < bouquetFlowers.length; i++) {
            bouquetFlowers[i] = new Flower(flowers[i].getNAME(), flowers[i].getPRICE());
        }
        return new Bouquet(bouquetFlowers);
    }
}