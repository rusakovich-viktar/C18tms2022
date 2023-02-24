package by.tms.task1.model;

//4) Создать класс model.Person, который будет содержать следующие поля имя,
// возраст, пол, адрес(страна, город)

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Setter
@Getter
public class Person {

    private String name;
    private int age;
    private String gender;
    private Address address;

    public Person(String name, int age, String gender, Address address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
}