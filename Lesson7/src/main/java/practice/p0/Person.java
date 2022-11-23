package practice.p0;

import lombok.Setter;

import java.util.List;

import static lombok.AccessLevel.PUBLIC;

public class Person {

    @Setter(PUBLIC)
    private String name;
    private int age;
    private List<String> list;
    private boolean flag;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
