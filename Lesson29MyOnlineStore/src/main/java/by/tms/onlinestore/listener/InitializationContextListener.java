package by.tms.onlinestore.listener;

import by.tms.onlinestore.repository.CategoryRepository;
import by.tms.onlinestore.repository.ProductRepository;
import by.tms.onlinestore.repository.UserRepository;
import by.tms.onlinestore.repository.impl.JdbcCategoryRepositoryImpl;
import by.tms.onlinestore.repository.impl.JdbcUserRepositoryImpl;
import by.tms.onlinestore.repository.impl.ProductRepositoryImpl;
import by.tms.onlinestore.repository.utils.ConnectionPool;
import by.tms.onlinestore.service.CategoryService;
import by.tms.onlinestore.service.ProductService;
import by.tms.onlinestore.service.UserService;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.SQLException;

@WebListener
public class InitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(final ServletContextEvent servletContextEvent) {

        ConnectionPool connectionPool = ConnectionPool.getInstance();
        servletContextEvent.getServletContext().setAttribute("connection", connectionPool);

        UserRepository jdbcUserRepository = new JdbcUserRepositoryImpl(connectionPool);
        UserService userService = new UserService(jdbcUserRepository);
        servletContextEvent.getServletContext().setAttribute("userService", userService);

        CategoryRepository jdbcCategoryRepository = new JdbcCategoryRepositoryImpl();
        CategoryService categoryService = new CategoryService(jdbcCategoryRepository);
        servletContextEvent.getServletContext().setAttribute("categoryService", categoryService);

        ProductRepository productRepository = new ProductRepositoryImpl();
        ProductService productService = new ProductService(productRepository);
        servletContextEvent.getServletContext().setAttribute("productService", productService);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        Connection connection = (Connection) servletContextEvent.getServletContext().getAttribute("connection");
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
