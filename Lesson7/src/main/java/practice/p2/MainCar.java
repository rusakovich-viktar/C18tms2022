package practice.p2;

public class MainCar {
    public static void main(String[] args) {
        System.out.println(Car.TEMP);

//        Car.Engine engineDVS = new Car.Engine("двс");

        Car car = new Car("жигули", "красный", "sasdasd");
//        Car.Engine engine = car.new Engine("двс");
//        Panel panel = new Panel(12);
//        engine.start();
//        panel.check();


//        Car.Engine.Test test = engine.new Test();
//        test.test();
//        engine.info();
//        engine.start();
//        engine.stop();
        Panel panel = new Panel(12);
        panel.check();
    }
}
