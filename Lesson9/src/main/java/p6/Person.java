package p6;

import lombok.*;
import p3.Address;

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
    private PassengerType passengerType;

    public static void personTest() {
        System.out.println("static personTest");
    }

    public void info() {
        System.out.println("Person");
    }


    /**
     * имплементируем метод спик от интерфейса Speaker.
     */

}
