package by.tms.onlinestore.controller.impl;

import by.tms.onlinestore.controller.BaseCommandController;
import by.tms.onlinestore.model.Attribute;
import by.tms.onlinestore.model.Cart;
import by.tms.onlinestore.model.PagesPath;
import by.tms.onlinestore.model.Product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

import static by.tms.onlinestore.model.RequestParam.ACTION;
import static by.tms.onlinestore.model.RequestParam.CATEGORY_ID;
import static by.tms.onlinestore.model.RequestParam.DESCRIPTION;
import static by.tms.onlinestore.model.RequestParam.ID;
import static by.tms.onlinestore.model.RequestParam.IMAGE_NAME;
import static by.tms.onlinestore.model.RequestParam.NAME;
import static by.tms.onlinestore.model.RequestParam.PRICE_PARAMETER;

public class CartPagePostControllerImpl implements BaseCommandController {
    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
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
        PagesPath path = null;
        if ("Buy".equals(action)) {
            cart.addProduct(product);
            session.setAttribute(Attribute.MY_PRODUCTS.getAttribute(), cart.getProducts());
            path = PagesPath.valueOf(PagesPath.PRODUCT_ID_PAGE.getPath() + product.getId());
        } else if ("Delete".equals(action)) {
            cart.deleteProduct(product);
            session.setAttribute("myProducts", cart.getProducts());
            path = PagesPath.valueOf(PagesPath.CART_PAGE.getPath());
        } else {
            System.out.println("Такой кнопки нет");
        }
        return path;

//        switch (action) {
//            case "Buy" -> {
//
////                response.sendRedirect("/product?productId=" + product.getId());
//            }
//            case "Delete" -> {
//                cart.deleteProduct(product);
//                session.setAttribute("myProducts", cart.getProducts());
//                path = PagesPath.CART_PAGE.getPath();
////                response.sendRedirect("/cart");
//            }
//            default -> {
//                System.out.println("Такой кнопки нет");
//            }
//        }

    }
}

