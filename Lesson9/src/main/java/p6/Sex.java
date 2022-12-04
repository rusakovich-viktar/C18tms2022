package p6;

import lombok.Getter;

@Getter
public enum Sex {

    MALE("male"), FEMALE("female");

    private String myName;

    Sex(String myName) {
        this.myName = myName;
    }

    public Sex parse(String value) {
        return Sex.valueOf(value);
    }

//    @Override
//    public String toString() {
//        return "Sex{" +
//                "myName='" + myName + '\'' +
//                '}';
//    }
}
