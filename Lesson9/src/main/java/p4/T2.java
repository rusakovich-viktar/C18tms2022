package p4;

public interface T2 {
    String TT = "sdfds";

    void method();

    default String defaultMessage() {
        double d = 5 / 7;
        return "defaultMessage";
    }
}
