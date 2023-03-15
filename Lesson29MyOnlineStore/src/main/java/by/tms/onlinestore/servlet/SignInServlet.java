package by.tms.onlinestore.servlet;

import static by.tms.onlinestore.utils.HttpRequestParamValidator.validateParamNotNull;

import by.tms.onlinestore.dto.UserDto;
import by.tms.onlinestore.exceptions.RequestParamNullException;
import by.tms.onlinestore.model.Cart;
import by.tms.onlinestore.model.User;
import by.tms.onlinestore.service.UserService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/signin")
public class SignInServlet extends HttpServlet {


    private UserService userService;


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        userService = (UserService) config.getServletContext().getAttribute("userService");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("signin.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String login = request.getParameter("username");
        String pass = request.getParameter("password");
        try {
            validateParamNotNull(login);
            validateParamNotNull(pass);
            List<User> users = userService.findUserLoginPassword();
            for (User user : users) {
                if (user.getUsername().equals(login) && user.getPassword().equals(pass)) {
                    UserDto userDto = new UserDto(user.getUsername());
                    Cart cart = new Cart();
                    session.setAttribute("cart", cart);
                    session.setAttribute("username", login);
                    request.getSession().setAttribute("userDto", userDto);
                    request.getRequestDispatcher("home").forward(request, response);
                    break;
                }
            }
            request.getRequestDispatcher("signin.jsp").forward(request, response);
        } catch (RequestParamNullException e) {
            System.out.println(e.getMessage());
        }
    }
}
