package by.tms.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(urlPatterns = "/*",
           initParams = {@WebInitParam(name = "encoding", value = "UTF-8", description = "Encoding params")})
public class WebEncodingFilter implements Filter {

    private String encoding;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encoding = filterConfig.getInitParameter("encoding");
        System.out.println("encoding filter is init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (!encoding.equals(request.getCharacterEncoding())) {
            request.setCharacterEncoding(encoding);
            response.setCharacterEncoding(encoding);
            response.setContentType("text/html");
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("encoding filter is destroyed");
        encoding = null;
    }
}