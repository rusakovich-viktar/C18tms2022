package by.tms.onlinestore.controller.impl;

import by.tms.onlinestore.controller.BaseCommandController;
import by.tms.onlinestore.dto.UserDto;
import by.tms.onlinestore.model.Attribute;
import by.tms.onlinestore.model.Inject;
import by.tms.onlinestore.model.PagesPath;
import by.tms.onlinestore.model.Product;
import by.tms.onlinestore.model.RequestParam;
import by.tms.onlinestore.service.impl.ProductService;
import lombok.Setter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static by.tms.onlinestore.utils.Utils.isUserLogIn;

@Setter
public class ProductPageControllerImpl implements BaseCommandController {

    @Inject
    private ProductService productService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        UserDto userDto = (UserDto) session.getAttribute(Attribute.USER_DTO.getAttribute());
        PagesPath path;
        if (isUserLogIn(userDto)) {
            int productId = Integer.parseInt(request.getParameter(RequestParam.PRODUCT_ID.getValue()));
            Product product = productService.getProductById(productId);
            request.setAttribute(Attribute.ONE_PRODUCT.getAttribute(), product);
            path = PagesPath.PRODUCT_PAGE;
        } else {
            path = PagesPath.SIGN_IN_PAGE;
        }
        return path;
    }
}
