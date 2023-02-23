package by.tms.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

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
        System.out.println(("Requested Resource::" + uri));

        HttpSession session = req.getSession(false);

        if (req.getSession().getAttribute("requestUsername") == null && !(uri.endsWith("login.jsp"))) {
            System.out.println(("Неавторизованный запрос"));
            RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/login.jsp");
            requestDispatcher.forward(request, response);

        } else {
            // pass the request along the filter chain
            System.out.println(("Авторизованный запрос, сессия:: " + session));
            chain.doFilter(request, response);
        }
    }
}
