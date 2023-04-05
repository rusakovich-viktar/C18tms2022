package by.tms.onlinestore.controller.impl;

import by.tms.onlinestore.controller.BaseCommandController;
import by.tms.onlinestore.dto.UserDto;
import by.tms.onlinestore.model.Attribute;
import by.tms.onlinestore.model.PagesPath;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static by.tms.onlinestore.utils.Utils.isUserLogIn;

public class ProfilePageControllerImpl implements BaseCommandController {
    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        UserDto userDto = (UserDto) session.getAttribute(Attribute.USER_DTO.getAttribute());
        if (isUserLogIn(userDto)) {
            return PagesPath.PROFILE_PAGE;
        } else {
            return PagesPath.SIGN_IN_PAGE;
        }
    }
}
