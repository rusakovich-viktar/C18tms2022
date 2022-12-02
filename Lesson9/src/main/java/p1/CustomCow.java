package p1;

import lombok.Getter;

@Getter
public class CustomCow extends Cow {
    private String color;

    public CustomCow(String name) {
        super(name, "кастом");
    }

    public CustomCow(String name, String str, String color) {
        super(name, str);
        this.color = color;
    }

    public String info() {
        return super.info() + color;
    }

    //    @Override
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    @Override
//    public void speak() {
////        System.out.println("Му " + getName());
//        System.out.println("Му " + super.name);
//    }

//    @Override
//    public String toString() {
//        return "CustomCow{" +
//                "name='" + name + '\'' +
//                '}';
//    }

    //     protected -> package -> public
}
