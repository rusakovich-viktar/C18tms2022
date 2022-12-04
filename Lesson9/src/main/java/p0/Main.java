package p0;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setAge(45);
//        person.setName("Иван");
//        System.out.println(person);

        new Person("this.name",
                12,
                getSex()
        );

        Person person1 = Person.builder()
                .name("Иван")
                .age(23)
                .sex("мужской")
                .build();
        System.out.println(person1);
    }

    private static String getSex() {
        return null;
    }
}
