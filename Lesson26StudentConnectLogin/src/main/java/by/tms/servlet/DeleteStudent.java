package by.tms.servlet;

import by.tms.service.StudentService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/delete-student")
public class DeleteStudent extends HttpServlet {
    private StudentService studentService;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        studentService = (StudentService) config.getServletContext().getAttribute("studentService");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Optional<String> stringRequest = Optional.ofNullable(request.getParameter("id"));
        if (stringRequest.isPresent()) {
            Long id = Long.parseLong(request.getParameter("id"));
            studentService.deleteStudent(id);
            response.sendRedirect("/get-students");
        } else {
            getServletContext().getRequestDispatcher("/jsp/delete.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            Long id = Long.parseLong(request.getParameter("deleted-id"));
            studentService.deleteStudent(id);
            response.sendRedirect("/get-students");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            getServletContext().getRequestDispatcher("/jsp/delete.jsp").forward(request, response);
        }
    }
}

