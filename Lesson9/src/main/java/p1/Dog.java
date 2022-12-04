package p1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public String info() {
        return super.info() + "собака";
    }

    @Override
    public void speak() {
        System.out.println("гав");
    }
}
