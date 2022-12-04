package a1;

import lombok.*;

import java.util.Random;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    public static final String MALE = "male";
    public static final String FEMALE = "female";
    private String name;
    private int age;
    private String sex = FEMALE;
    private Address address;

    public static void personTest() {
        System.out.println("static personTest");
    }

    public void info() {
        System.out.println("Person");
    }

    /**
     * имплементируем метод спик от интерфейса Speaker.
     */
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
