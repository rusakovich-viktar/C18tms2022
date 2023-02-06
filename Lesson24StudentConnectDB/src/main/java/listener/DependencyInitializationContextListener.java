package listener;

import repository.JdbcStudentRepositoryTest;
import repository.StudentRepositoryTest;
import service.StudentServiceTest;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebListener
public class DependencyInitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(final ServletContextEvent servletContextEvent) {
        final String dbDriver = servletContextEvent.getServletContext().getInitParameter("db_driver");
        String username = servletContextEvent.getServletContext().getInitParameter("db_user");
        String password = servletContextEvent.getServletContext().getInitParameter("db_password");
        String dbUrl = servletContextEvent.getServletContext().getInitParameter("db_url");

        try {
            try {
                Class.forName(dbDriver);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            StudentRepositoryTest repository = new JdbcStudentRepositoryTest(connection);
            StudentServiceTest studentServiceTest = new StudentServiceTest(repository);
            servletContextEvent.getServletContext().setAttribute("studentService", studentServiceTest);
            servletContextEvent.getServletContext().setAttribute("connection", connection);
        } catch (RuntimeException | SQLException e) {
            throw new RuntimeException(e);
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
