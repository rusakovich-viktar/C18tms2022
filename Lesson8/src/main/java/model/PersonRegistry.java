//model.PersonRegistry содержит список людей (model.Person), которые могут быть призваны в армию

package model;

import lombok.AllArgsConstructor;

import static utils.Constants.MALE;
@AllArgsConstructor
public class PersonRegistry {


    public static Person[] people = new Person[6];

    //пока хз как вбить в ячейку массива
    people[0]


    Person person = new Person("Виктор", 31, MALE, new Address("Belarus", "Minsk"));
    Person person2 = new Person("Виктор", 31, MALE, new Address("Belarus", "Minsk"));
    Person person3 = new Person("Виктор", 31, MALE, new Address("Belarus", "Minsk"));
    Person person4 = new Person("Виктор", 31, MALE, new Address("Belarus", "Minsk"));


}

