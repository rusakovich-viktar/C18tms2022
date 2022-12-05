package by.tms.flowers;

import static by.tms.flowers.FlowerType.*;

public class Main {

    public static void main(String[] args) {
        FlowerMarket flowerMarket = new FlowerMarket();
        Bouquet bouquetOne = flowerMarket.getBouquet(ROSE);
        System.out.println(bouquetOne);
        System.out.printf("Стоимость букета равна %d \n", bouquetOne.getPrice());
        Bouquet bouquetTwo = flowerMarket.getBouquet(ROSE, LILY);
        System.out.println(bouquetTwo);
        System.out.printf("Стоимость букета равна %d \n", bouquetTwo.getPrice());
        Bouquet bouquetThree = flowerMarket.getBouquet(ROSE, TULIP, GERBERA);
        System.out.println(bouquetThree);
        System.out.printf("Стоимость букета равна %d \n", bouquetThree.getPrice());
        Bouquet bouquetFour = flowerMarket.getBouquet(ROSE, CARNATION);
        System.out.println(bouquetFour);
        System.out.printf("Стоимость букета равна %d \n", bouquetFour.getPrice());
        Bouquet bouquetFive = flowerMarket.getBouquet(ROSE, ASTER, TULIP, LILY);
        System.out.println(bouquetFive);
        System.out.printf("Стоимость букета равна %d \n", bouquetFive.getPrice());
        System.out.printf("Всего продано цветов %d", Flower.getTotalSold());

    }
}


// * Создать класс "Flower", который содержит переменные имя и стоимость, гет сет и toString (lombok подключаем)
// * Необходимо:
//         * 1) собрать 5 букетов (используем массив) с определением их стоимости, т.е создаем класс Bouquet,
//         * который содержит массив объектов Flower, который инициализируется через конструктор, а также метод по вычислению стоимости.
//         * 2) вывести на консоль информацию по каждому букету.
//         * 3*звездочка) Подсчитать количество всех проданных цветов.
//         * Пояснения решения:
//         * Создать класс FlowerMarket, который содержит метод public Bouquet getBouquet(String... flowers),
//        // * Создать enum FlowerType c константами названия цветов.
//        * Для создания букета в метод getBouquet нужно передавать константы через запятую(ROSE, ROSE, ROSE, ROSE, ROSE)
//        * По названию константы enam создать объект класса Flower и поместить в массив,
//        * для передачи его в класс букета.
// * Также в енам константах необходимо создать переменную cost(стоимость) типа int и прописать стоимость каждого цветка, гет, сет, конструктор!
// * ROSE - 15
// * LILY - 7
// * ASTER - 5
// * HERBERA - 5
// * TULIP - 8
// * CARNATION - 11