package by.tms.onlinestore.servlet;

import by.tms.onlinestore.dto.UserDto;
import by.tms.onlinestore.model.Attribute;
import by.tms.onlinestore.model.Product;
import by.tms.onlinestore.service.impl.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static by.tms.onlinestore.model.Attribute.PRODUCTS;
import static by.tms.onlinestore.model.RequestParam.CATEGORY_ID;
import static by.tms.onlinestore.model.RequestParam.NAME_CATEGORY;
import static by.tms.onlinestore.utils.Utils.isUserLogIn;

@WebServlet("/category")
public class CategoryServlet extends HttpServlet {

    private ProductService productService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        productService = (ProductService) config.getServletContext().getAttribute("productService");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDto userDto = (UserDto) request.getSession().getAttribute("userDto");
        if (isUserLogIn(userDto)) {
            int categoryId = Integer.parseInt(request.getParameter(CATEGORY_ID.getValue()));
            String nameCategory = request.getParameter(NAME_CATEGORY.getValue());
            List<Product> categoryProducts = productService.getProductsByCategoryId(categoryId);
            request.setAttribute(PRODUCTS.getAttribute(), categoryProducts);
//            request.setAttribute("products", categoryProducts);
            request.setAttribute(Attribute.NAME_CATEGORY.getAttribute(), nameCategory);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("category.jsp");
            requestDispatcher.forward(request, response);
        } else {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("signin.jsp");
            requestDispatcher.forward(request, response);
        }
    }
}
