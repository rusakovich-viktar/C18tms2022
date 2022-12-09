package by.tms.model;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkAuthorization("qwerty", "12345", "12345"));
    }

    private static boolean checkAuthorization(String login, String password, String confirmPassword) {
        try {
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("invalid confirm password");
            }
            if (!checkValidation(login)) {
                throw new WrongLoginException("invalid login");
            }
            if (!checkValidation(password)) {
                throw new WrongPasswordException("invalid password");
            }
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
        return true;
    }

    private static boolean checkValidation(String inputData) {
        return inputData.matches("(^[a-zA-Z0-9_]{1,20}$)");
    }
}

/*
https://habr.com/ru/post/260773/
https://www.regextester.com/
https://regex101.com/*/