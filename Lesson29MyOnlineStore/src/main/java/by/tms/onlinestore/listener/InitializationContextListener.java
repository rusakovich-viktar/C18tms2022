package by.tms.onlinestore.listener;

import by.tms.onlinestore.repository.utils.ConnectionPool;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import static by.tms.onlinestore.model.Attribute.CONNECTION_POOL;
import static by.tms.onlinestore.model.Attribute.USER_UUID;

@WebListener
public class InitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(final ServletContextEvent servletContextEvent) {

        ConnectionPool connectionPool = ConnectionPool.getInstance(); //++
        servletContextEvent.getServletContext().setAttribute(CONNECTION_POOL.getAttribute(), connectionPool);


//
//        servletContextEvent.getServletContext().setAttribute("connection", connectionPool);
//
//        UserRepository jdbcUserRepository = new JdbcUserRepositoryImpl(connectionPool);
//        UserService userService = new UserService(jdbcUserRepository);
//        servletContextEvent.getServletContext().setAttribute("userService", userService);
//
//        CategoryRepository jdbcCategoryRepository = new JdbcCategoryRepositoryImpl();
//        CategoryService categoryService = new CategoryService(jdbcCategoryRepository);
//        servletContextEvent.getServletContext().setAttribute("categoryService", categoryService);
//
//        ProductRepository productRepository = new ProductRepositoryImpl();
//        ProductService productService = new ProductService(productRepository);
//        servletContextEvent.getServletContext().setAttribute("productService", productService);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ConnectionPool.getInstance().closeAllConnection();


//        ConnectionPool connectionPool = (ConnectionPool) servletContextEvent.getServletContext().getAttribute(CONNECTION_POOL.getAttribute());
//        connectionPool.closeAllConnection();
//        servletContextEvent.getServletContext().removeAttribute(CONNECTION_POOL.getAttribute());
        servletContextEvent.getServletContext().removeAttribute(USER_UUID.getAttribute());
    }
}

