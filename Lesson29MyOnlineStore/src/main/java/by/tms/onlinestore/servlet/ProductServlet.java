//package by.tms.onlinestore.servlet;
//
//import by.tms.onlinestore.dto.UserDto;
//import by.tms.onlinestore.model.Product;
//import by.tms.onlinestore.model.RequestParam;
//import by.tms.onlinestore.service.impl.ProductService;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//import static by.tms.onlinestore.utils.Utils.isUserLogIn;
//
//@WebServlet("/product")
//public class ProductServlet extends HttpServlet {
//
//    private ProductService productService;
//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//        productService = (ProductService) config.getServletContext().getAttribute("productService");
//    }
//
//    @Override
////    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        UserDto userDto = (UserDto) request.getSession().getAttribute("userDto");
////        if (isUserLogIn(userDto)) {
////            int productId = Integer.parseInt(request.getParameter(RequestParam.PRODUCT_ID.getValue()));
////            Product product = productService.getProductById(productId);
////            request.setAttribute("oneProduct", product);
////            RequestDispatcher requestDispatcher = request.getRequestDispatcher("product.jsp");
////            requestDispatcher.forward(request, response);
////        } else {
////            RequestDispatcher requestDispatcher = request.getRequestDispatcher("signin.jsp");
////            requestDispatcher.forward(request, response);
////        }
////    }
//}
