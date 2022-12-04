package p0;

public class ToyotaTundra extends Car {
    @Override
    void go() {
        System.out.println("ToyotaTundra");
    }

    @Override
    void stop() {
        System.out.println("ToyotaTundra");
    }

    @Override
    void draw() {
        System.out.println("ToyotaTundra");
    }

    @Override
    boolean check() {
        return true;
    }
}
