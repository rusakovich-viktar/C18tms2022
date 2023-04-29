package by.tms.model;

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
    PRODUCTS("products"),
    NAME_CATEGORY("nameCategory"),
    MY_PRODUCTS("myProducts"),
    ONE_PRODUCT("oneProduct"),
    USER_DTO("userDto");

    private final String attribute;
}
