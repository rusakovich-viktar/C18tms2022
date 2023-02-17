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

@WebServlet("/update-student")
public class EditStudentServlet extends HttpServlet {
    private StudentService studentService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        studentService = (StudentService) config.getServletContext().getAttribute("studentService");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/jsp/edit.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            Long id = Long.parseLong(request.getParameter("id"));
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            int course = Integer.parseInt(request.getParameter("course"));
            int cityId = Integer.parseInt(request.getParameter("cityId"));
            studentService.updateStudents(new Student(id, name, surname, course, cityId));
            response.sendRedirect("/get-students");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
            getServletContext().getRequestDispatcher("/jsp/edit.jsp").forward(request, response);
        }
    }
}