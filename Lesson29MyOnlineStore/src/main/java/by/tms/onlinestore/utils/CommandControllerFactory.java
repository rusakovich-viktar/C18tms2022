package by.tms.onlinestore.utils;

import by.tms.onlinestore.controller.BaseCommandController;
import by.tms.onlinestore.controller.impl.HomePageBaseCommandController;
import by.tms.onlinestore.controller.impl.SignInPageGetControllerImpl;
import by.tms.onlinestore.controller.impl.SignInPagePostControllerImpl;
import by.tms.onlinestore.model.Commands;
import lombok.experimental.UtilityClass;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

import static by.tms.onlinestore.utils.InjectObjectsFactory.createAndInjectInstances;

@UtilityClass
public class CommandControllerFactory {

    private static final Map<String, BaseCommandController> COMMANDS = new ConcurrentHashMap<>();

    public static BaseCommandController defineCommand(Commands command) throws Exception {
        return putIfAbsent(command.getCommand(), createController(command));
    }

    private static Supplier<BaseCommandController> createController(Commands command) {
        return switch (command) {
//            case HOME_PAGE_COMMAND -> HomePageCommandControllerImpl::new;
//            case PRODUCTS_PAGE_COMMAND -> ProductPageCommandControllerImpl::new;
//            case ACCOUNT_PAGE_COMMAND -> AccountPageCommandControllerImpl::new;
//            case ADD_CART_PAGE_COMMAND -> AddCartPageCommandControllerImpl::new;
//            case ADD_FAVORITE_PAGE_COMMAND -> AddFavoritePageCommandControllerImpl::new;
            case CATEGORY_COMMAND -> null;
            case HOME_COMMAND -> HomePageBaseCommandController::new;
            case LOGOUT_COMMAND -> null;
            case PRODUCT_COMMAND -> null;
            case PROFILE_COMMAND -> null;
            case SHOPPING_CART_COMMAND -> null;
            case SIGN_IN_COMMAND -> SignInPageGetControllerImpl::new;
            case SIGN_IN_POST_COMMAND -> SignInPagePostControllerImpl::new;
//            case CREATE_USER_PAGE_COMMAND -> CreateUserPageCommandControllerImpl::new;
//            case CREATE_USER_PAGE_POST_COMMAND -> CreateUserPagePostCommandControllerImpl::new;
//            case DELETE_CART_PRODUCT_PAGE_COMMAND -> DeleteCartProductPageCommandControllerImpl::new;
//            case DELETE_FAVORITE_PRODUCT_PAGE_COMMAND -> DeleteFavoriteCommandControllerImpl::new;
//            case FAVORITES_PAGE_COMMAND -> FavoritesCommandControllerImpl::new;
//            case LOGOUT_PAGE_COMMAND -> LogoutPageCommandControllerImpl::new;
//            case SHOPPING_CART_PAGE_COMMAND -> ShoppingCartPageCommandControllerImpl::new;
//            case SHOPPING_CART_PAGE_POST_COMMAND -> ShoppingCartPagePostCommandControllerImpl::new;
//            case SEARCH_PAGE_COMMAND -> SearchPageCommandControllerImpl::new;
//            case SEARCH_PAGE_POST_COMMAND -> SearchPagePostCommandControllerImpl::new;
            case SIGN_UP_COMMAND -> null;
        };
    }

    private static BaseCommandController putIfAbsent(String key, Supplier<BaseCommandController> supplier) throws Exception {
        BaseCommandController value = COMMANDS.get(key);
        if (value == null) {
            value = create(supplier);
            COMMANDS.put(key, value);
        }
        return value;
    }

    private static BaseCommandController create(Supplier<BaseCommandController> supplier) throws Exception {
        BaseCommandController baseController = supplier.get();
        createAndInjectInstances(baseController);
        return baseController;
    }

}
