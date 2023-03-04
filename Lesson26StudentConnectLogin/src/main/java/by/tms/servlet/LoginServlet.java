package by.tms.servlet;

import by.tms.model.User;
import by.tms.service.SecurityService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {

    private SecurityService securityService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        securityService = (SecurityService) config.getServletContext().getAttribute("securityService");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String requestUsername = request.getParameter("requestUsername");
        String requestPassword = request.getParameter("requestPassword");
        List<User> users = securityService.findUserLoginPassword();
//        List<User> users = studentService.findUserLoginPassword();
        for (User user : users) {
            if (user.getUsername().equals(requestUsername) && user.getPassword().equals(requestPassword)) {
                User userAccess = new User();
                session.setAttribute("requestUsername", requestUsername);
                session.setAttribute("requestPassword", requestPassword);
                System.out.println("залогинен пользователь " + requestUsername);
                response.sendRedirect("/");
            }
        }
    }
}