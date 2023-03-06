package by.tms.servlet;

import by.tms.model.City;
import by.tms.service.StudentService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(value = "/get-city") (ВОЗМОЖНО ВЫВЕДУ ЧТО НИБУДЬ ЕЩЕ ПО ГОРОДАМ )
public class GetAllCities extends HttpServlet {

    private StudentService studentService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        studentService = (StudentService) config.getServletContext().getAttribute("studentService");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<City> cities = studentService.findCity();
        request.setAttribute("studentCity", cities);
        getServletContext().getRequestDispatcher("/jsp/add-city.jsp").forward(request, response);
    }
}