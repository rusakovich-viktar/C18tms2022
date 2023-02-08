package servlet;

import model.Student;
import service.StudentService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "GetAllUsers", value = "/users")
public class ServletStudent extends HttpServlet {
    private StudentService studentService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        studentService = (StudentService) config.getServletContext().getAttribute("studentService");
        System.out.println("init");
    }

    @Override
    protected void doGet
            (HttpServletRequest request,
             HttpServletResponse response)
            throws ServletException, IOException {
        List<Student> students = studentService.findStudents();
        request.setAttribute("data", students);
        getServletContext().getRequestDispatcher("/students.jsp").forward(request, response);
    }
}