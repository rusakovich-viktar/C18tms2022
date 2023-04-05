//package by.tms.onlinestore.servlet;
//
//import lombok.extern.slf4j.Slf4j;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Slf4j
//@WebServlet(value = "/signin")
//public class SignInServlet extends HttpServlet {
//
////    private UserService userService;
//
////    @Override
////    public void init(ServletConfig config) throws ServletException {
////        super.init(config);
////        userService = (UserService) config.getServletContext().getAttribute("userService");
////    }
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        request.getRequestDispatcher("signin.jsp").forward(request, response);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        String login = request.getParameter("username");
////        String pass = request.getParameter("password");
////        log.info("ello привет");
////        try {
////            validateParamNotNull(login);
////            validateParamNotNull(pass);
////        } catch (RequestParamNullException ex) {
////            System.out.println(ex.getMessage());
////        }
////        User user = userService.getUserByLoginAndPassword(login, pass);
////        if (user != null) {
////            HttpSession session = request.getSession();
////            UserDto userDto = new UserDto(user.getUsername(), user.getName(), user.getSurname(), user.getGender(), user.getBirthday(), user.getEmail(), user.getRegistrationDate());
////            Cart cart = new Cart();
////            session.setAttribute("cart", cart);
////            session.setAttribute("username", login);
////            session.setAttribute("userDto", userDto);
////            request.getRequestDispatcher("home").forward(request, response);
////        } else {
////            response.sendRedirect("signin");
////        }
//    }
//}
