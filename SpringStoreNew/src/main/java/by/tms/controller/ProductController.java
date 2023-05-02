package by.tms.controller;

import by.tms.dto.UserDto;
import by.tms.model.Attribute;
import by.tms.model.Product;
import by.tms.model.RequestParam;
import by.tms.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static by.tms.utils.Utils.isUserLogIn;

@RequiredArgsConstructor
@Controller
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product")
    public ModelAndView showProduct(HttpServletRequest request, ModelAndView modelAndView) {
        HttpSession session = request.getSession();
        UserDto userDto = (UserDto) session.getAttribute(Attribute.USER_DTO.getAttribute());
        if (isUserLogIn(userDto)) {
            int productId = Integer.parseInt(request.getParameter(RequestParam.PRODUCT_ID.getValue()));
            Product product = productService.getProductById(productId);
            request.setAttribute(Attribute.ONE_PRODUCT.getAttribute(), product);
            modelAndView.setViewName("product");
        } else {
            modelAndView.setViewName("signin");
        }
        return modelAndView;
    }
}
