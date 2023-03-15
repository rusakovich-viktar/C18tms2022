package by.tms.onlinestore.listener;

import by.tms.onlinestore.repository.CategoryRepository;
import by.tms.onlinestore.repository.UserRepository;
import by.tms.onlinestore.repository.impl.JdbcCategoryRepositoryImpl;
import by.tms.onlinestore.repository.impl.JdbcUserRepositoryImpl;
import by.tms.onlinestore.repository.impl.ProductRepositoryImpl;
import by.tms.onlinestore.service.CategoryService;
import by.tms.onlinestore.service.ProductService;
import by.tms.onlinestore.service.UserService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(final ServletContextEvent servletContextEvent) {
        final String dbDriver = servletContextEvent.getServletContext().getInitParameter("db_driver");
        String username = servletContextEvent.getServletContext().getInitParameter("db_user");
        String password = servletContextEvent.getServletContext().getInitParameter("db_password");
        String dbUrl = servletContextEvent.getServletContext().getInitParameter("db_url");

        try {
            Class.forName(dbDriver);
            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            UserRepository userRepositoryImpl = new JdbcUserRepositoryImpl(connection);
            UserService userService = new UserService(userRepositoryImpl);
            servletContextEvent.getServletContext().setAttribute("connection", connection);
            servletContextEvent.getServletContext().setAttribute("userService", userService);

            ProductService productService = new ProductService(new ProductRepositoryImpl());
            servletContextEvent.getServletContext().setAttribute("productService", productService);

            CategoryRepository jdbcCategoryRepository = new JdbcCategoryRepositoryImpl(connection);
            CategoryService categoryService = new CategoryService(jdbcCategoryRepository);
            servletContextEvent.getServletContext().setAttribute("categoryService", categoryService);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        try {
            final Connection connection = (Connection) servletContextEvent.getServletContext().getAttribute("connection");
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
