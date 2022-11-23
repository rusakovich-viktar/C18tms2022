package practice.p2;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("бмв", "белый", "двс");
        Car.Engine engine = car.new Engine("дизель");

        Panel panel = new Panel(23);
        panel.check();

        engine.start();
        engine.stop();

//        Car.Engine engine = new Car.Engine("бензин");
//        engine.start();


//        Car car1 = new Car("бмв", "белый", "газ");

//        Address address = new Address("Беларусь", "Минск");
//        System.out.println(address);
////        ProtectedMethod protectedMethod = new ProtectedMethod(address);
////        protectedMethod.info();
//        System.out.println(address);

    }
}
