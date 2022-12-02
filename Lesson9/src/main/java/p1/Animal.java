package p1;

public class Animal {//final
    protected String name;//общая характеристика

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        name = "Animal";
    }

    public String getName() {
        return name;
    }

    void changeName(String newName) {
        if (true) {
//            name = newName;
        }
    }

    public String info() {
        return "Мое имя" + name;
    }

    void speak() { //private
        System.out.println("Я умею говорить");
    }

    void speak(String value) { //private
        System.out.println("Я умею говорить" + value);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
