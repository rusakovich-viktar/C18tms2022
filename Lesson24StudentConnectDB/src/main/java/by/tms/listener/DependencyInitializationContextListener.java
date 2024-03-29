package by.tms.listener;

import by.tms.repository.JdbcStudentRepository;
import by.tms.repository.StudentRepository;
import by.tms.service.StudentService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class DependencyInitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(final ServletContextEvent servletContextEvent) {
        final String dbDriver = servletContextEvent.getServletContext().getInitParameter("db_driver");
        String username = servletContextEvent.getServletContext().getInitParameter("db_user");
        String password = servletContextEvent.getServletContext().getInitParameter("db_password");
        String dbUrl = servletContextEvent.getServletContext().getInitParameter("db_url");
        
        try {
            Class.forName(dbDriver);
            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            StudentRepository repository = new JdbcStudentRepository(connection);
            StudentService studentService = new StudentService(repository);
            servletContextEvent.getServletContext().setAttribute("studentService", studentService);
            servletContextEvent.getServletContext().setAttribute("connection", connection);
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
            e.printStackTrace();
        }
    }
}