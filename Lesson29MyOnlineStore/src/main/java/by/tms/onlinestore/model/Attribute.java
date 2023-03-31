package by.tms.onlinestore.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Attribute {

    USER_UUID("userUUID"),
    CONNECTION_POOL("connectionPool"),

    CART("cart"),

    USERNAME("username"),
    CATEGORIES("categories"),
    USER_DTO("userDto");

    private final String attribute;
}
