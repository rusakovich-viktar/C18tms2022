package by.tms.onlinestore.model;

public enum RequestParam {
    USERNAME("username"),
    PASSWORD("password"),
    PRODUCT_ID("productId"),
    REPEAT_PASS("repeatPass"),
    SURNAME("newUsrSurname"),
    BIRTHDAY("date"),
    GENDER("gender"),
    EMAIL("newUsrEmail"),
    REGISTRATION_DATE("registrationDate"),
    ID("id"),
    IMAGE_NAME("imageName"),
    NAME("name"),
    DESCRIPTION("description"),
    PRICE_PARAMETER("price"),
    CATEGORY_ID("categoryId"),
    NAME_CATEGORY("nameCategory"),
    ACTION("action"),
    COMMAND("command");


    private final String value;

    RequestParam(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

