package by.tms.controller;

import by.tms.dto.UserDto;
import by.tms.model.Attribute;
import by.tms.model.Cart;
import by.tms.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

import static by.tms.model.Attribute.USER_DTO;
import static by.tms.model.RequestParam.ACTION;
import static by.tms.model.RequestParam.CATEGORY_ID;
import static by.tms.model.RequestParam.DESCRIPTION;
import static by.tms.model.RequestParam.ID;
import static by.tms.model.RequestParam.IMAGE_NAME;
import static by.tms.model.RequestParam.NAME;
import static by.tms.model.RequestParam.PRICE_PARAMETER;
import static by.tms.utils.Utils.isUserLogIn;

public class CartController {
    
    @PostMapping("/cart")
    public ModelAndView addProductToCart(HttpServletRequest request, ModelAndView modelAndView) {
        HttpSession session = request.getSession(false);
        Cart cart = (Cart) session.getAttribute(Attribute.CART.getAttribute());
        int id = Integer.parseInt(request.getParameter(ID.getValue()));
        String imageName = request.getParameter(IMAGE_NAME.getValue());
        String name = request.getParameter(NAME.getValue());
        String description = request.getParameter(DESCRIPTION.getValue());
        String priceParameter = request.getParameter(PRICE_PARAMETER.getValue());
        int categoryId = Integer.parseInt(request.getParameter(CATEGORY_ID.getValue()));
        BigDecimal price = new BigDecimal(priceParameter);
        Product product = new Product(id, imageName, name, description, price, categoryId);
        String action = request.getParameter(ACTION.getValue());
        if ("Buy".equals(action)) {
            cart.addProduct(product);
            session.setAttribute(Attribute.MY_PRODUCTS.getAttribute(), cart.getProducts());
            request.setAttribute(Attribute.ONE_PRODUCT.getAttribute(), product);
            modelAndView.setViewName("product");
        } else if ("Delete".equals(action)) {
            cart.deleteProduct(product);
            session.setAttribute(Attribute.MY_PRODUCTS.getAttribute(), cart.getProducts());
            modelAndView.setViewName("cart");
        } else {
            System.out.println("Такой кнопки нет");
        }
        return modelAndView;
    }

    @GetMapping("/cart")
    public ModelAndView showProductInCart(HttpServletRequest request, ModelAndView modelAndView) {
        HttpSession session = request.getSession();
        UserDto userDto = (UserDto) session.getAttribute(USER_DTO.getAttribute());
        if (isUserLogIn(userDto)) {
            modelAndView.setViewName("cart");
        } else {
            modelAndView.setViewName("signin");
        }
        return modelAndView;
    }
}


