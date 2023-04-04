package by.tms.onlinestore.listener;

import by.tms.onlinestore.repository.CategoryRepository;
import by.tms.onlinestore.repository.impl.JdbcCategoryRepositoryImpl;
import by.tms.onlinestore.repository.impl.ProductRepositoryImpl;
import by.tms.onlinestore.service.CategoryService;
import by.tms.onlinestore.service.ProductService;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.DriverManager;

@WebListener
public class InitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ProductService productService = new ProductService(new ProductRepositoryImpl());
        sce.getServletContext().setAttribute("productService", productService);
        CategoryRepository jdbcCategoryRepository = new JdbcCategoryRepositoryImpl(getConnection(sce));
        CategoryService categoryService = new CategoryService(jdbcCategoryRepository);
        sce.getServletContext().setAttribute("categoryService", categoryService);
    }

    private Connection getConnection(ServletContextEvent sce) {
        String username = sce.getServletContext().getInitParameter("db_user");
        String password = sce.getServletContext().getInitParameter("db_password");
        String dbUrl = sce.getServletContext().getInitParameter("db_url");
        String dbDriver = sce.getServletContext().getInitParameter("db_driver");
        try {
            Class.forName(dbDriver);
            return DriverManager.getConnection(dbUrl, username, password);
        } catch (Exception e) {
            System.out.println("Unexpected error " + e.getMessage());
        }
        return null;
    }
}
