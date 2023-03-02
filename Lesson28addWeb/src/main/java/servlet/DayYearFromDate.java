package servlet;

import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/displaying-day-of-year-from-date")
public class DayYearFromDate extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LocalDate localDate = LocalDate.parse(request.getParameter("date"));
        request.setAttribute("dayOfYearFromDate", localDate);
        int dayOfYear = localDate.getDayOfYear();
        request.setAttribute("dayOfYear", dayOfYear);
        getServletContext().getRequestDispatcher("/day-of-year.jsp").forward(request, response);
    }

}
