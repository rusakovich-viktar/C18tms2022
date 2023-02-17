package by.tms.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(
        name = "AuthenticationFilter",
        description = "Аутентификационный фильтр",
        urlPatterns = "/AuthenticationFilter"
)
@WebFilter(urlPatterns = "*.jsp")

public class AuthenticationFilter implements Filter {

    private ServletContext context;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.context = filterConfig.getServletContext();
        this.context.log("AuthenticationFilter initialized");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String uri = req.getRequestURI();
        this.context.log("Requested Resource::" + uri);

        HttpSession session = req.getSession(false);
        Object user = req.getSession().getAttribute("user");
        this.context.log("Фильтр аутентификации, пользователь::" + user);

        if (user == null && !(uri.endsWith("login.jsp"))) {
            this.context.log("Неавторизованный запрос");
            res.sendRedirect("login.jsp");

        } else {
            // pass the request along the filter chain
            this.context.log("Авторизованный запрос, сессия:: " + session);
            chain.doFilter(request, response);
        }
    }
}
