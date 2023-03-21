package by.tms.onlinestore.servlet;

import by.tms.onlinestore.model.User;
import by.tms.onlinestore.service.UserService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/signup")
public class SignUpServlet extends HttpServlet {

    String pattern = "^(.+)@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";
    private UserService userService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        userService = (UserService) config.getServletContext().getAttribute("userService");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("signup.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String repeatPass = request.getParameter("repeatPass");
            String name = request.getParameter("newUsrName");
            String surname = request.getParameter("newUsrSurname");
            String birthday = request.getParameter("date");
            String gender = request.getParameter("gender");
            String email = request.getParameter("newUsrEmail");
            String registrationDate = request.getParameter("registrationDate");

            if (username == null || password == null || repeatPass == null || name == null || surname == null || birthday == null || gender == null || username.isEmpty() || password.isEmpty() || repeatPass.isEmpty() || name.isEmpty() || surname.isEmpty() || birthday.isEmpty() || gender.isEmpty()) {
                response.getWriter().println("<h2 style='color:red'>Необходимо заполнить все поля формы.</h2>");
            } else if (password.length() < 8) {
                response.getWriter().println("<h2 style='color:red'>password must have minimum 8 Characters.</h2>");
            } else if (!email.matches(pattern)) {
                response.getWriter().println("<h2 style='color:red'>Некорректный формат email</h2>");
            } else {
                userService.addNewUser(new User(username, password, name, surname, gender, birthday, email, registrationDate));
                System.out.println("Регистрация прошла успешно, forward to home");
                request.getRequestDispatcher("home").forward(request, response);
            }

        } catch (Exception e) {
            System.out.println("Exception registration: " + e.getMessage());
            request.getRequestDispatcher("signup").forward(request, response);
        }
    }
}