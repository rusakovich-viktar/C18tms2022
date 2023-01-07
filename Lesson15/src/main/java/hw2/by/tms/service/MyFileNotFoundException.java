package hw2.by.tms.service;

public class MyFileNotFoundException extends Throwable {
    public MyFileNotFoundException(String message) {
        super(message);
    }

    public MyFileNotFoundException() {
    }
}
