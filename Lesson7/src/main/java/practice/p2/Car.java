package practice.p2;

public class Car {

    //константы
    public static final String TEMP = "c:\\temp";

    private String model;
    private String color;

    private Engine engine; //глобальная

    //статический блок инициализации
    static {
        System.out.println("static block");
    }

    //блок инициализации
    {
        System.out.println("init block");
    }

    //конструкторы
    public Car(String model, String color, String typeEngine) {
        this.model = model;
        this.color = color;
        this.engine = new Engine(typeEngine);
        System.out.println("Car constructor");
//        this.engine = new Engine(typeEngine);
//        Engine engine = new Engine();//локальная переменная
//        this.engine = engine;
//        this.engine = new Engine();
        System.out.println(engine.type);
        System.out.println(" end Car constructor");
    }

    //метода
    public void start() {
        checkEngine();
        checkDistance();
    }

    private void checkEngine() {
        engine.start();
    }

    private void checkDistance() {
        System.out.println("123");
    }

    //get set

    //внутренний класс
    public class Engine {
        public String type;
        //доступ есть к полям
//        если магазин запчастей то надо отдельный класс
        //start stop
        //инициализация

        public Engine(String type) {
            System.out.println("Engine constructor");
            this.type = type;
        }

        public void info() {
            System.out.println("Model " + model + "Color " + color);
        }

        public void start() {
            System.out.println("start");
        }

        public void stop() {
            System.out.println("stop");
        }
    }

}
