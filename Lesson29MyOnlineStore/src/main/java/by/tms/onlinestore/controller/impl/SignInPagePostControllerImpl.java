package by.tms.onlinestore.controller.impl;

import by.tms.onlinestore.controller.BaseCommandController;
import by.tms.onlinestore.dto.UserDto;
import by.tms.onlinestore.model.Attribute;
import by.tms.onlinestore.model.Cart;
import by.tms.onlinestore.model.Inject;
import by.tms.onlinestore.model.PagesPath;
import by.tms.onlinestore.model.User;
import by.tms.onlinestore.service.impl.UserService;
import lombok.Setter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static by.tms.onlinestore.model.RequestParam.PASSWORD;
import static by.tms.onlinestore.model.RequestParam.USERNAME;

@Setter
public class SignInPagePostControllerImpl implements BaseCommandController {
    @Inject
    private UserService userService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        String username = request.getParameter(USERNAME.getValue());
        String pass = request.getParameter(PASSWORD.getValue());

//        try {
//            validateParamNotNull(username);
//            validateParamNotNull(pass);
//        } catch (RequestParamNullException ex) {
//            System.out.println(ex.getMessage());
//        }
        PagesPath path;
        User user = userService.getUserByLoginAndPassword(username, pass);
        if (user != null) {
            HttpSession session = request.getSession();
            UserDto userDto = new UserDto(user.getUsername(), user.getName(), user.getSurname(), user.getGender(), user.getBirthday(), user.getEmail(), user.getRegistrationDate());
            Cart cart = new Cart();
            session.setAttribute(Attribute.CART.getAttribute(), cart);
            session.setAttribute(Attribute.USERNAME.getAttribute(), username);
            session.setAttribute(Attribute.USER_DTO.getAttribute(), userDto);
            path = PagesPath.HOME_PAGE_GET_ANYTHING;
        } else {
            path = PagesPath.SIGN_IN_PAGE;
        }
        return path;
    }

}

