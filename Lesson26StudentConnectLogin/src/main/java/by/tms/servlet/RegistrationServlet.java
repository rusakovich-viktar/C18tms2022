package by.tms.servlet;

import by.tms.model.User;
import by.tms.service.SecurityService;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/register")
public class RegistrationServlet extends HttpServlet {

    String pattern = "^(.+)@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";
    private SecurityService securityService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        securityService = (SecurityService) config.getServletContext().getAttribute("securityService");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("newUsrPass");
            String repeatPass = request.getParameter("repeatPass");
            String name = request.getParameter("newUsrName");
            String surname = request.getParameter("newUsrSurname");
            String birthday = request.getParameter("date");
            String gender = request.getParameter("gender");
            String email = request.getParameter("newUsrEmail");

            if (username == null || password == null || repeatPass == null || name == null || surname == null || birthday == null || gender == null || username.isEmpty() || password.isEmpty() || repeatPass.isEmpty() || name.isEmpty() || surname.isEmpty() || birthday.isEmpty() || gender.isEmpty()) {
                response.getWriter().println("<h2 style='color:red'>Необходимо заполнить все поля формы.</h2>");
            } else if (password.length() < 8) {
                response.getWriter().println("<h2 style='color:red'>password must have minimum 8 Characters.</h2>");
            } else if (!email.matches(pattern)) {
                response.getWriter().println("<h2 style='color:red'>Некорректный формат email</h2>");
            } else {
                securityService.addNewUser(new User(username, password, name, surname, gender, birthday, email));
                response.sendRedirect("/good-registration.jsp");
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            getServletContext().getRequestDispatcher("/registration.jsp").forward(request, response);
        }
    }
}