package CarMilitaryLesson8.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String sex;
    private Address address;

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
}
