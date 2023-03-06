package by.tms.servlet;

import by.tms.model.City;
import by.tms.model.Student;
import by.tms.service.StudentService;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        Optional<String> stringRequest = Optional.ofNullable(request.getParameter("id"));
        if (stringRequest.isPresent()) {
            request.getParameter("id");
            List<City> cities = studentService.findCity();
            request.setAttribute("studentCity", cities);
            getServletContext().getRequestDispatcher("/jsp/edit-by-id.jsp").forward(request, response);
        } else {
            response.sendRedirect("/get-students");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Long id = Long.parseLong(request.getParameter("id"));
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            int course = Integer.parseInt(request.getParameter("course"));
            Long cityId = Long.parseLong(request.getParameter("cityId"));
            City city = new City(cityId);
            studentService.updateStudents(new Student(id, name, surname, course, city));
            response.sendRedirect("/get-students");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
            response.sendRedirect("/get-students");
        }
    }
}