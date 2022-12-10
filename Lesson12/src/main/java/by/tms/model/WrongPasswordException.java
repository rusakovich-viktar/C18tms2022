package by.tms.model;

public class WrongPasswordException extends Throwable {
    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
    }
}
