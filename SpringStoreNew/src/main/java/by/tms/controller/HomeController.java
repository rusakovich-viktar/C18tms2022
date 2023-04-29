package by.tms.controller;

import by.tms.dto.UserDto;
import by.tms.model.Attribute;
import by.tms.model.Category;
import by.tms.service.CategoryService;
import by.tms.utils.Utils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class HomeController {

    private final CategoryService categoryService;

//    @Override
//    public PagesPath execute(HttpServletRequest request) throws Exception {
//        HttpSession session = request.getSession();
//        UserDto userDto = (UserDto) session.getAttribute(USER_DTO.getAttribute());
//        if (isUserLogIn(userDto)) {
//            List<Category> categories = categoryService.getCategories();
//            request.setAttribute(CATEGORIES.getAttribute(), categories);
//            return PagesPath.HOME_PAGE;
//        } else {
//            return PagesPath.SIGN_IN_PAGE;
//        }
//    }

    @GetMapping("/eshop")
    public String getEshop(HttpSession session, HttpServletRequest request) {
//        HttpSession session = request.getSession();
        UserDto userDto = (UserDto) session.getAttribute(Attribute.USER_DTO.getAttribute());
        if (Utils.isUserLogIn(userDto)) {
            List<Category> categories = categoryService.getCategories();
            request.setAttribute(Attribute.CATEGORIES.getAttribute(), categories);
            return "home";
        } else {
            return "signin";
        }
    }

}