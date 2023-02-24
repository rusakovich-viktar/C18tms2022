package by.tms;

public class WrongLoginException extends Throwable {
    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
    }
}
