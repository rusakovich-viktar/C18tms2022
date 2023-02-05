package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student {
    private Long id;
    private String name;
    private String surname;
    private int course;
    private String city;


    public Student(String name, String surname, int course) {

        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public Student(String name, String surname, int course, String city) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.city = city;
    }
}
