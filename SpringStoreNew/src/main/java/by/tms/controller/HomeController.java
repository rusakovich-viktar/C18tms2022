package by.tms.controller;

import by.tms.dto.UserDto;
import by.tms.model.Attribute;
import by.tms.model.Category;
import by.tms.service.CategoryService;
import by.tms.utils.Utils;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequiredArgsConstructor
@Controller
//@ResponseBody
public class HomeController {

    private final CategoryService categoryService;

    @GetMapping("/home")
    public ModelAndView getHomePage(HttpSession session, ModelAndView modelAndView) {
        UserDto userDto = (UserDto) session.getAttribute(Attribute.USER_DTO.getAttribute());
        if (Utils.isUserLogIn(userDto)) {
            List<Category> categories = categoryService.getCategories();
//           ModelMap modelMap = new ModelMap();
//            modelMap.addAttribute(Attribute.CATEGORIES.getAttribute(), categories);
            modelAndView.addObject(Attribute.CATEGORIES.getAttribute(), categories);
            modelAndView.setViewName("home");
        } else {
            modelAndView.setViewName("signin");
        }
        return modelAndView;
    }
}