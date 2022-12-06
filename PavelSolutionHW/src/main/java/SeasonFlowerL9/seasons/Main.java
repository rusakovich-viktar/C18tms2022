package SeasonFlowerL9.seasons;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Season> seasons = new ArrayList<>();
        seasons.add(Season.SUMMER);
        seasons.add(Season.AUTUMN);
        seasons.add(Season.WINTER);
        seasons.add(Season.SPRING);
        for (Season season : seasons) {
            System.out.println(season.getDescription());
            System.out.println("Средняя температура воздуха = " + season.getTemperature());
            System.out.println(season.getInfo());
        }
    }
}
