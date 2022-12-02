package by.tms;

import static by.tms.SeasonsEnum.SUMMER;

public class Seasons {

    SeasonsEnum seasonEnum = SUMMER;

    @Override
    public String toString() {
        return "Seasons{" +
                "seasonEnum=" + seasonEnum +
                '}';
    }


    private String getDescription() {

        return null;
    }

    private void getSeason() {
        switch (seasonEnum) {
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
            default -> System.out.println("Я люблю придумывать новые времена года");
        }
    }

    public SeasonsEnum getSeasonEnum() {
        return seasonEnum;
    }
}