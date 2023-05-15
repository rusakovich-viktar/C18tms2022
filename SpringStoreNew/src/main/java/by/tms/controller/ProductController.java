package by.tms.controller;

import by.tms.dto.UserDto;
import by.tms.model.Product;
import by.tms.service.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import static by.tms.utils.Constants.Attributes.ONE_PRODUCT;
import static by.tms.utils.Constants.Attributes.USER_DTO;
import static by.tms.utils.Constants.RequestParams.PRODUCT_ID;
import static by.tms.utils.Utils.isUserLogIn;

@RequiredArgsConstructor
@Controller
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product")
    public ModelAndView showProduct(HttpServletRequest request, ModelAndView modelAndView) {
        HttpSession session = request.getSession();
        UserDto userDto = (UserDto) session.getAttribute(USER_DTO);
        if (isUserLogIn(userDto)) {
            int productId = Integer.parseInt(request.getParameter(PRODUCT_ID));
            Product product = productService.getProductById(productId);
            request.setAttribute(ONE_PRODUCT, product);
            modelAndView.setViewName("product");
        } else {
            modelAndView.setViewName("signin");
        }
        return modelAndView;
    }
}
