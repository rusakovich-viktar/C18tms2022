package p4;

public interface T1 {
    void method();

    default String default4Message() {
        return "defaultMessage";
    }

//    private method
}
