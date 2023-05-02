package by.tms.controller;

import by.tms.dto.UserDto;
import by.tms.model.Attribute;
import by.tms.model.Product;
import by.tms.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

import static by.tms.model.Attribute.PRODUCTS;
import static by.tms.model.RequestParam.CATEGORY_ID;
import static by.tms.model.RequestParam.NAME_CATEGORY;
import static by.tms.utils.Utils.isUserLogIn;

@Setter
@Controller
@RequiredArgsConstructor
public class CategoryController {

    private final ProductService productService;

    @GetMapping("/category")
    public ModelAndView showCategories(HttpServletRequest request, ModelAndView modelAndView) {
        HttpSession session = request.getSession();
        UserDto userDto = (UserDto) session.getAttribute(Attribute.USER_DTO.getAttribute());
        if (isUserLogIn(userDto)) {
            int categoryId = Integer.parseInt(request.getParameter(CATEGORY_ID.getValue()));
            String nameCategory = request.getParameter(NAME_CATEGORY.getValue());
            List<Product> categoryProducts = productService.getProductsByCategoryId(categoryId);
            request.setAttribute(PRODUCTS.getAttribute(), categoryProducts);
            request.setAttribute(Attribute.NAME_CATEGORY.getAttribute(), nameCategory);
            modelAndView.setViewName("category");
        } else {
            modelAndView.setViewName("signin");
        }
        return modelAndView;
    }

}