package p3;

import lombok.*;
import lombok.experimental.SuperBuilder;
import p1.Speaker;

import java.util.Random;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Person implements Speaker {
    public static final String MALE = "male";
    public static final String FEMALE = "female";
    private Address address;
    private int age;
    private String name;
    private String sex;

    public static void personTest() {
        System.out.println("static personTest");
    }

    public void info() {
        System.out.println("Person");
    }

    /**
     * имплементируем метод спик от интерфейса Speaker.
     */
    @Override
    public void speak() {
        Random random = new Random();
        if (random.nextInt(40) < 20) {
            System.out.println("Hello, my name is " + name);
        } else {
            secureInfo();
        }
        System.out.println("I am living in " + address.toString());
    }

    private void secureInfo() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old");
    }
}
