package stat;


import static stat.CountInstanceClass.count;

public class MainCountClass {
    public static void main(String[] args) {
        CountInstanceClass countInstanceClass = new CountInstanceClass();
        CountInstanceClass countInstanceClass2 = new CountInstanceClass();
        CountInstanceClass countInstanceClass3 = new CountInstanceClass();
        CountInstanceClass countInstanceClass4 = new CountInstanceClass();
//        CountInstanceClass.count++;

//        System.out.println(CountInstanceClass.count++);
        System.out.println("количество объектов класса = " + count);
    }
}
