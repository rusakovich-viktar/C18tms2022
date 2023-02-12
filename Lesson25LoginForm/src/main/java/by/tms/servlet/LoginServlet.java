package by.tms.servlet;

import by.tms.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/login", name = "LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        request.getRequestDispatcher("/").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("user");
        String pass = request.getParameter("pass");

        User user = new User();
        if (user.getUsername().equals(name) && user.getPassword().equals(pass)) {
            HttpSession session = request.getSession();
            session.setAttribute("user", name);
            session.setAttribute("pass", pass);
            request.getRequestDispatcher("/homepage").forward(request, response);
        } else {
            response.sendRedirect("/");
        }
    }
}