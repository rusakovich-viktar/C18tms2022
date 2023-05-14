package by.tms.controller;

import by.tms.dto.UserDto;
import by.tms.model.Product;
import by.tms.service.ProductService;
import by.tms.utils.Constants;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static by.tms.utils.Constants.Attributes.PRODUCTS;
import static by.tms.utils.Constants.Attributes.USER_DTO;
import static by.tms.utils.Constants.RequestParams.CATEGORY_ID;
import static by.tms.utils.Utils.isUserLogIn;

@Controller
@RequiredArgsConstructor
public class CategoryController {

    private final ProductService productService;

    @GetMapping("/category")
    public ModelAndView showCategories(@RequestParam(CATEGORY_ID) int categoryId,
                                       @RequestParam(Constants.RequestParams.NAME_CATEGORY) String nameCategory,
                                       HttpServletRequest request, ModelAndView modelAndView) {
        HttpSession session = request.getSession();
        UserDto userDto = (UserDto) session.getAttribute(USER_DTO);
        if (isUserLogIn(userDto)) {
            List<Product> categoryProducts = productService.getProductsByCategoryId(categoryId);
            modelAndView.addObject(PRODUCTS, categoryProducts);
            modelAndView.addObject(Constants.Attributes.NAME_CATEGORY, nameCategory);
            modelAndView.setViewName("category");
        } else {
            modelAndView.setViewName("signin");
        }
        return modelAndView;
    }

}