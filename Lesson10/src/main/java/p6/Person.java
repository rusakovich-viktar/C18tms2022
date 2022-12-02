package p6;

import a1.Address;
import lombok.*;

import static p6.Sex.MALE;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    //    public static final String MALE = "male";
//    public static final String FEMALE = "female";
    private Address address;
    private int age;
    private String name;
    private Sex sex = MALE;

    public static void personTest() {
        System.out.println("static personTest");
    }

    public void getRecruit(String name) {
        Person[] mass = null;
        for (Person person : mass) {
            if (person.getSex() == MALE && person.getAge() > 18 && person.getAge() <= 27) {

            }
        }

        System.out.println("Person");
    }


    /**
     * имплементируем метод спик от интерфейса Speaker.
     */

}
