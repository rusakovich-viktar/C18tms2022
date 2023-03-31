package by.tms.onlinestore.model;

public enum PagesPath {
    HOME_PAGE("home.jsp"),
    HOME_PAGE_GET_ANYTHING("eshop?command=home"),
    PRODUCT_PAGE("product.jsp"),
    SIGN_IN_PAGE("signin.jsp"),
    SIGN_UP_PAGE("signup.jsp"),
    CART_PAGE("cart.jsp"),
    CART_PAGE_GET("eshop?command=cart"),
    PROFILE_PAGE("profile.jsp"),
    CATEGORY_PAGE("category.jsp"),
    INDEX_PAGE("index.jsp");

    private final String path;

    PagesPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
