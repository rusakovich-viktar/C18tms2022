package p1;

public class Cat extends Animal {
//    private String name;


    public Cat(String name) {
        super(name);
    }

    @Override
    void speak() {
//        this.name = name;
//        super.speak();
        //кастомная логика
        System.out.println("Мяу");
    }
}
