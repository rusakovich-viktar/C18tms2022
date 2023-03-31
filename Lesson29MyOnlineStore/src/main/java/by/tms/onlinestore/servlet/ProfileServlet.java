//package by.tms.onlinestore.servlet;
//
//import by.tms.onlinestore.dto.UserDto;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//import static by.tms.onlinestore.utils.Utils.isUserLogIn;
//
//@WebServlet("/profile")
//public class ProfileServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        UserDto userDto = (UserDto) request.getSession().getAttribute("userDto");
//        if (isUserLogIn(userDto)) {
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("profile.jsp");
//            requestDispatcher.forward(request, response);
//        } else {
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("signin.jsp");
//            requestDispatcher.forward(request, response);
//        }
//    }
//}
