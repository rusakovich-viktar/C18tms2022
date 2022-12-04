package by.tms.seasons;

public class Seasons {
    public void getLikedSeason(SeasonsEnum seasonEnum) {
        switch (seasonEnum) {
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
            default -> System.out.println("Я люблю придумывать новые времена года");
        }
    }

    public void getDescription() {
        System.out.println("Холодное время года");
    }

    public void getDescription(SeasonsEnum SUMMER) {
        System.out.println("Теплое время года");
    }
}