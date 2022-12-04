package p6;

import lombok.Getter;

@Getter
public enum Sex {

    MALE("мужской", 18, 27), TEST, FEMALE("женский", 23, 12);

    private String myName;//глобальная переменная
    private int from;
    private int to;


    Sex(String myName, int from, int to) {
        this.myName = myName;
        this.from = from;
        this.to = to;
    }

    Sex() {
    }

    public static Sex parse(String value) {
        for (Sex sex : values()) {
            if (sex.getMyName().equalsIgnoreCase(value)) {
                return sex;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "myName='" + myName + '\'' +
                '}';
    }
}
