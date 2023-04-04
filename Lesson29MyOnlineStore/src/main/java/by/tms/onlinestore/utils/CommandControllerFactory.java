package by.tms.onlinestore.utils;

import by.tms.onlinestore.controller.BaseCommandController;
import by.tms.onlinestore.controller.impl.CartPageControllerImpl;
import by.tms.onlinestore.controller.impl.CartPagePostControllerImpl;
import by.tms.onlinestore.controller.impl.CategoryPageControllerImpl;
import by.tms.onlinestore.controller.impl.HomePageBaseCommandController;
import by.tms.onlinestore.controller.impl.LogoutPageControllerImpl;
import by.tms.onlinestore.controller.impl.ProductPageControllerImpl;
import by.tms.onlinestore.controller.impl.ProfilePageControllerImpl;
import by.tms.onlinestore.controller.impl.SignInPageControllerImpl;
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
            case CATEGORY_COMMAND -> CategoryPageControllerImpl::new;
            case HOME_COMMAND -> HomePageBaseCommandController::new;
            case LOGOUT_COMMAND -> LogoutPageControllerImpl::new;
            case PRODUCT_COMMAND -> ProductPageControllerImpl::new;
            case PROFILE_COMMAND -> ProfilePageControllerImpl::new;
            case SHOPPING_CART_COMMAND -> CartPageControllerImpl::new;
            case SHOPPING_CART_POST_COMMAND -> CartPagePostControllerImpl::new;
            case SIGN_IN_COMMAND -> SignInPageControllerImpl::new;
            case SIGN_IN_POST_COMMAND -> SignInPagePostControllerImpl::new;
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
