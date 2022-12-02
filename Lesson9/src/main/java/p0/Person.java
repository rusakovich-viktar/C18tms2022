package p0;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
//@Setter
//@ToString
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private String sex;

//    public Person(String name, int age, String sex) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }

    public Person() {
    }

    private void test() {
        System.out.println("");
    }
//    public static Person.PersonBuilder builder() {
//        return new Person.PersonBuilder();
//    }
//
//    public static class PersonBuilder {
//        private String name;
//        private int age;
//        private String sex;
//
//        PersonBuilder() {
//        }
//
//        public Person.PersonBuilder name(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public Person.PersonBuilder age(int age) {
//            this.age = age;
//            return this;
//        }
//
//        public Person.PersonBuilder sex(String sex) {
//            this.sex = sex;
//            return this;
//        }
//
//        public Person build() {
//            return new Person(this.name, this.age, this.sex);
//        }
//    }
}
