package p0_1;


public class Main {
    public static void main(String[] args) {
//        Person person = new Person("name", 4, "");
//        person.setAge(45);
//        person.setName("Иван");

        Person person1 = Person.builder()
                .name("Иван")
                .age(23)
                .sex("мужской")
                .build();
        System.out.println(person1);
    }
}
