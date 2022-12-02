package stat4;

public class Main {
    public static void main(String[] args) {
        External external = new External(1);
        System.out.println("внешний объект, value = " + external.getValue());//внешний объект

        External.Inner inner1 = new External.Inner();//1 объект
        System.out.println("1 объект, value = " + inner1.value);
        System.out.println("1 объект, value = " + External.Inner.value);

        External.Inner inner2 = new External.Inner();//2 объект
        System.out.println("2 объект, value = " + inner2.value);
        inner1.value = 5;
        System.out.println("1 объект, value = " + inner1.value);
        System.out.println("2 объект, value = " + inner2.value);

    }
}
