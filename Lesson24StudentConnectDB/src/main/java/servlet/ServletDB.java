package servlet;

import model.Student;
import service.StudentServiceDbUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "servlet-db", value = "/servlet-db")
public class ServletDB extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        StudentServiceDbUtils studentServiceDbUtils = new StudentServiceDbUtils();
        List<Student> students = studentServiceDbUtils.getAllStudents();
        request.setAttribute("data", students);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/students.jsp");
        requestDispatcher.forward(request, response);
    }

}
