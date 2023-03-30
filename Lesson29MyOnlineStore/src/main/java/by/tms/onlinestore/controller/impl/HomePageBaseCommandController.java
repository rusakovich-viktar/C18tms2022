package by.tms.onlinestore.controller.impl;

import by.tms.onlinestore.controller.BaseCommandController;
import by.tms.onlinestore.dto.UserDto;
import by.tms.onlinestore.model.Category;
import by.tms.onlinestore.model.Inject;
import by.tms.onlinestore.model.PagesPath;
import by.tms.onlinestore.service.CategoryService;
import lombok.Setter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

import static by.tms.onlinestore.utils.Utils.isUserLogIn;

@Setter
public class HomePageBaseCommandController implements BaseCommandController {
    @Inject
    private CategoryService categoryService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        UserDto userDto = (UserDto) request.getSession().getAttribute("userDto");
        return checkReceivedUser(userDto, request);
    }

    private PagesPath checkReceivedUser(UserDto userDto, HttpServletRequest request) throws ServletException, IOException {
        PagesPath path;
        if (isUserLogIn(userDto)) {
            List<Category> categories = categoryService.getCategories();
            request.setAttribute("categories", categories);
            System.out.println("checkReceivedUser good, forward to home");
//            request.getRequestDispatcher("home.jsp").forward(request);
            path = PagesPath.HOME_PAGE;
        } else {
            System.out.println("checkReceivedUser bad, forward to signin");
            path = PagesPath.SIGN_IN_PAGE;
        }
        return path;
    }
}
