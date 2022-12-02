package p6;

public enum DayOfWeekEnum {

    MONDAY("понедельник"), FRIDAY("пятница");
    private final String value;

    DayOfWeekEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
