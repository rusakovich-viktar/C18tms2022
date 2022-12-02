package by.tms;

enum SeasonsEnum {
    WINTER("Зима", -6), SPRING("Весна", 7), SUMMER("Лето", 15), AUTUMN("Осень", 6);
    public final String seasonName;
    private final int averageTemperature;

    SeasonsEnum(String seasonName, int averageTemperature) {
        this.seasonName = seasonName;
        this.averageTemperature = averageTemperature;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }
}