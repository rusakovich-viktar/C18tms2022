package servlet;

import model.Student;
import service.StudentServiceTest;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Servlet", value = "/users")
public class ServletStudentTest extends HttpServlet {
    private StudentServiceTest studentServiceTest;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        studentServiceTest = (StudentServiceTest) config.getServletContext().getAttribute("studentService");
        System.out.println("init");
    }

    @Override
    protected void doGet
            (HttpServletRequest request,
             HttpServletResponse response)
            throws ServletException, IOException {
        List<Student> students = studentServiceTest.findStudentsTest();
        request.setAttribute("data", students);
        getServletContext().getRequestDispatcher("/students.jsp").forward(request, response);
    }

}
