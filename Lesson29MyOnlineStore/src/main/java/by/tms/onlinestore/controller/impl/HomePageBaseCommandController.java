package by.tms.onlinestore.controller.impl;

import by.tms.onlinestore.controller.BaseCommandController;
import by.tms.onlinestore.dto.UserDto;
import by.tms.onlinestore.model.Category;
import by.tms.onlinestore.model.Inject;
import by.tms.onlinestore.model.PagesPath;
import by.tms.onlinestore.service.CategoryService;
import lombok.Setter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

import static by.tms.onlinestore.model.Attribute.CATEGORIES;
import static by.tms.onlinestore.model.Attribute.USER_DTO;
import static by.tms.onlinestore.utils.Utils.isUserLogIn;

@Setter
public class HomePageBaseCommandController implements BaseCommandController {
    @Inject
    private CategoryService categoryService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        UserDto userDto = (UserDto) session.getAttribute(USER_DTO.getAttribute());
        if (isUserLogIn(userDto)) {
            List<Category> categories = categoryService.getCategories();
            request.setAttribute(CATEGORIES.getAttribute(), categories);
            return PagesPath.HOME_PAGE;
        } else {
            return PagesPath.SIGN_IN_PAGE;
        }
    }
}