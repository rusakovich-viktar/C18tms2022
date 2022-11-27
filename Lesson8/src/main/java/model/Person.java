package model;//4) Создать класс model.Person, который будет содержать следующие поля имя,
// возраст, пол, адрес(страна, город)

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Person {
    private String name;
    private int age;
    private String gender;
    private Address address;
}
