package by.tms.onlinestore.controller.impl;

import by.tms.onlinestore.controller.BaseCommandController;
import by.tms.onlinestore.dto.UserDto;
import by.tms.onlinestore.model.Attribute;
import by.tms.onlinestore.model.Inject;
import by.tms.onlinestore.model.PagesPath;
import by.tms.onlinestore.model.Product;
import by.tms.onlinestore.service.impl.ProductService;
import lombok.Setter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

import static by.tms.onlinestore.model.Attribute.PRODUCTS;
import static by.tms.onlinestore.model.RequestParam.CATEGORY_ID;
import static by.tms.onlinestore.model.RequestParam.NAME_CATEGORY;
import static by.tms.onlinestore.utils.Utils.isUserLogIn;

@Setter
public class CategoryPageControllerImpl implements BaseCommandController {
    @Inject
    private ProductService productService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        UserDto userDto = (UserDto) session.getAttribute(Attribute.USER_DTO.getAttribute());
        PagesPath path;
        if (isUserLogIn(userDto)) {
            int categoryId = Integer.parseInt(request.getParameter(CATEGORY_ID.getValue()));
            String nameCategory = request.getParameter(NAME_CATEGORY.getValue());
            List<Product> categoryProducts = productService.getProductsByCategoryId(categoryId);
            request.setAttribute(PRODUCTS.getAttribute(), categoryProducts);
            request.setAttribute(Attribute.NAME_CATEGORY.getAttribute(), nameCategory);
            path = PagesPath.CATEGORY_PAGE;
        } else {
            path = PagesPath.SIGN_IN_PAGE;
        }
        return path;
    }
}