package p4;

/**
 * Множественное наследование
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(T2.TT);
        Implementation implementation = new Implementation();
        implementation.defaultMessage();
        implementation.default4Message();
    }
}
