package p1;

public class Cow extends Animal {

    private String str;
    public String name;

    public Cow(String name, String str) {
        super(name);//вызов конструктора базового класса
        this.str = str;
//        setName(name);
//        this();
//        info();
    }

    public Cow(String name) {
        super(name);
    }

    public Cow() {
        System.out.println("конструктор по умолчанию");
    }

    public String info() {
        return super.info() + str + " корова";
    }


    @Override
    void speak() {
//        super.speak();//вызов метода супер класса Animal
        System.out.println("Меня зовут " + super.name + "и я умею говорить Му");
        System.out.println("Меня зовут " + getName() + "и я умею говорить Му");
        customSpeak();
    }

    private void customSpeak() {
        System.out.println("customSpeak");
    }

    @Override
    public String getName() {
        return name;
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }


//    @Override
//    public String toString() {
//        return "Cow{" +
//                "name='" + name + '\'' +
//                '}';
//    }

    //  package->   protected   -> public
}
