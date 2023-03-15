package by.tms.onlinestore.servlet;

import static by.tms.onlinestore.utils.Utils.isUserLogIn;

import by.tms.onlinestore.dto.UserDto;
import by.tms.onlinestore.model.Cart;
import by.tms.onlinestore.model.Product;
import java.io.IOException;
import java.math.BigDecimal;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cart")
public class ShoppingCartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDto userDto = (UserDto) request.getSession().getAttribute("userDto");
        if (isUserLogIn(userDto)) {
            request.getRequestDispatcher("cart.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("signin.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession(false);
        Cart cart = (Cart) session.getAttribute("cart");
        int id = Integer.parseInt(request.getParameter("id"));
        String imageName = request.getParameter("imageName");
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String priceParameter = request.getParameter("price");
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        BigDecimal price = new BigDecimal(priceParameter);
        Product product = new Product(id, imageName, name, description, price, categoryId);
        String action = request.getParameter("action");
        switch (action) {
            case "Buy" -> {
                cart.addProduct(product);
                session.setAttribute("myProducts", cart.getProducts());
                response.sendRedirect("/product?productId=" + product.getId());
            }
            case "Delete" -> {
                cart.deleteProduct(product);
                session.setAttribute("myProducts", cart.getProducts());
                response.sendRedirect("/cart");
            }
            default -> {
                System.out.println("Такой кнопки нет");
            }
        }
    }
}
