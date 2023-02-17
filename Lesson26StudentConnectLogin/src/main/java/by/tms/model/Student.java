package by.tms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
    private Long id;
    private String name;
    private String surname;
    private int course;
    private String city;
    private int cityId;


    public Student(String name, String surname, int course, int cityId) {

        this.name = name;
        this.surname = surname;
        this.course = course;
        this.cityId = cityId;
    }

    public Student(String name, String surname, int course, String city) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.city = city;
    }

    public Student(Long id, String name, String surname, int course, int cityId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.cityId = cityId;
    }


    public Student(Long id, String name, String surname, int course, String city) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.city = city;
    }
}
