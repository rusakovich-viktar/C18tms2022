package servlet;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/displaying-day-of-week-from-date")
public class DayWeekFromDate extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LocalDate localDate = LocalDate.parse(request.getParameter("date"));
        request.setAttribute("dayOfWeekFromDate", localDate);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        String ruFormatDayOfWeek = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.of("RU"));
        request.setAttribute("dayOfWeek", ruFormatDayOfWeek);
        getServletContext().getRequestDispatcher("/day-of-week.jsp").forward(request, response);
    }

}
