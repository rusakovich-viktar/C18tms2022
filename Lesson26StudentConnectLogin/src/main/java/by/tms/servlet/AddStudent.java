package by.tms.servlet;

import by.tms.model.Student;
import by.tms.service.StudentService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add-student")
public class AddStudent extends HttpServlet {
    private StudentService studentService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        studentService = (StudentService) config.getServletContext().getAttribute("studentService");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/jsp/create.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            int course = Integer.parseInt(request.getParameter("course"));
            int cityId = Integer.parseInt(request.getParameter("cityId"));
            studentService.addNewStudent(new Student(name, surname, course, cityId));
            response.sendRedirect("/get-students");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            getServletContext().getRequestDispatcher("/jsp/create.jsp").forward(request, response);
        }
    }
}