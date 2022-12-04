package stat3;

import static stat3.External.Inner;

public class Main {
    public static void main(String[] args) {
        External external = new External(1);
        System.out.println("внешний объект, value = " + external.getValue());//внешний объект

        Inner inner1 = new Inner(2);//1 объект
//        System.out.println(Inner.TEMP);

        System.out.println("1 объект, value =" + inner1.getValue());

        Inner inner2 = new Inner(3);//2 объект
        System.out.println("2 объект, value = " + inner2.getValue());

        inner1.setValue(5);

        System.out.println("1 объект, value = " + inner1.getValue());
        System.out.println("2 объект, value = " + inner2.getValue());
        new Main().test33();//вызов не статического метода
    }

    private void test33() {

    }
}
