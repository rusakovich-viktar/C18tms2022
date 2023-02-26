package servlet;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/now-time-servlet")
public class ServletTimeNow extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setIntHeader("Refresh", 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm.ss");
        LocalTime currentTime = LocalTime.now();
        String formattedCurrentTime = currentTime.format(formatter);
        request.setAttribute("formattedCurrentTime", formattedCurrentTime);
        getServletContext().getRequestDispatcher("/current-time.jsp").forward(request, response);
    }

}