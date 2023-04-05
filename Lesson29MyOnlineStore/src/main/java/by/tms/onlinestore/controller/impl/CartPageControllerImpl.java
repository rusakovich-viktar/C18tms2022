package by.tms.onlinestore.controller.impl;

import by.tms.onlinestore.controller.BaseCommandController;
import by.tms.onlinestore.dto.UserDto;
import by.tms.onlinestore.model.PagesPath;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static by.tms.onlinestore.model.Attribute.USER_DTO;
import static by.tms.onlinestore.utils.Utils.isUserLogIn;

public class CartPageControllerImpl implements BaseCommandController {
    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        UserDto userDto = (UserDto) session.getAttribute(USER_DTO.getAttribute());
        if (isUserLogIn(userDto)) {
            return PagesPath.CART_PAGE;
        } else {
            return PagesPath.SIGN_IN_PAGE;
        }
    }
}
