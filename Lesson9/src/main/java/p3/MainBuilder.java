package p3;

import p3.SimplePerson.SimplePersonBuilder;

public class MainBuilder {
    public static void main(String[] args) {
        SimplePerson simplePerson = new SimplePerson("sdf", 34, "male");//1 способ

        SimplePersonBuilder personBuilder = SimplePerson.builder()
                .name("Алекс")
                .age(13)
                .sex("male");
        SimplePerson build = personBuilder.build();

        SimplePerson person = SimplePerson.builder()
                .name("Алекс")
                .age(13)
                .sex("male")
                .build();//2 способ

        SimplePerson adf = new SimplePersonBuilder().name("adf").build();//3 способ

        SimplePerson person1 = SimplePerson.builder()
                .name("Алекс")
                .age(13)
                .sex("male")
                .build();//2 способ
        System.out.println();
    }
}
