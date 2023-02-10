package by.tms.filter;

import javax.servlet.*;
import java.io.IOException;

//@WebFilter("/*")
public class EncodingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (request.getCharacterEncoding() == null) {
            request.setCharacterEncoding("UTF-8");
        }
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response);

    }

    @Override
    public void destroy() {
        System.out.println("filter destroy");
    }
}
