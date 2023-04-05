package by.tms.onlinestore.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Commands {

    CATEGORY_COMMAND("category"),
    HOME_COMMAND("home"),
    LOGOUT_COMMAND("logout"),
    PRODUCT_COMMAND("product"),
    PROFILE_COMMAND("profile"),
    SHOPPING_CART_COMMAND("cart"),
    SHOPPING_CART_POST_COMMAND("cart-post"),
    SIGN_IN_COMMAND("signin"),
    SIGN_IN_POST_COMMAND("signin-post"),
    SIGN_UP_COMMAND("signup");

    private final String command;

    Commands(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    private static final Map<String, Commands> commandsMapping = new HashMap<>();

    static {
        for (Commands command : values()) {
            commandsMapping.put(command.getCommand(), command);
        }
    }

    public static Commands fromString(String type) {
        return Optional.ofNullable(commandsMapping.get(type))
                .orElseThrow(() -> new IllegalStateException("Unknown command type"));
    }
}
