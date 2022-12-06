package SeasonFlowerL9.simple_flowers;

public class FlowerMarket {


    public Bouquet getBouquet(FlowerType... flowers) {
        Flower[] resultFlowers = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
//            String flowerName = flowers[i];
//            FlowerType flowerType = FlowerType.valueOf(flowerName);
//            resultFlowers[i] = new Flower(flowerName, flowerType.getPrice());//ROSE - 14
            resultFlowers[i] = new Flower(flowers[i]);//ROSE - 14

        }
        return new Bouquet(resultFlowers);
    }
}
