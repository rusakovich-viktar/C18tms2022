package by.tms.seasons;

public class Main {
    public static void main(String[] args) {
        SeasonsEnum seasonEnum = SeasonsEnum.WINTER;
        System.out.println(seasonEnum.toString());
        Seasons seasons = new Seasons();
        seasons.getLikedSeason(seasonEnum);
        seasons.getDescription();
        seasons.getDescription(SeasonsEnum.SUMMER);
        for (SeasonsEnum seasonsEnum : SeasonsEnum.values()) {
            System.out.println(seasonsEnum);
        }
    }
}