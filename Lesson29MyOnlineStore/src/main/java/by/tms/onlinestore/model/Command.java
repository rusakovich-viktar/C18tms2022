package by.tms.onlinestore.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Command {

    CATEGORY_COMMAND("category"),
    HOME_COMMAND("home"),
    LOGOUT_COMMAND("logout"),
    PRODUCT_COMMAND("product"),
    PROFILE_COMMAND("profile"),
    SHOPPING_CART_COMMAND("cart"),
    SIGN_IN_COMMAND("signin"),
    SIGN_UP_COMMAND("signup");

    private static final Map<String, Command> commandMapping = new HashMap<>();

    static {
        for (Command type : values()) {
            commandMapping.put(type.getCommand(), type);
        }
    }

    public static Command fromString(String type) {
        return Optional.ofNullable(commandMapping.get(type))
                .orElseThrow(() -> new IllegalStateException("Unknown command type"));
//        for (Command value : values()) {
//            if (value.command.equals(type)) {
//                return value;
//            }
//        }
//        throw new IllegalStateException("Unknown command type");
    }

    private final String command;

    Command(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
