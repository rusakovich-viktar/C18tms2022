package by.tms.onlinestore.repository.impl;

import by.tms.onlinestore.model.User;
import by.tms.onlinestore.repository.UserRepository;
import by.tms.onlinestore.repository.utils.ConnectionPool;
import by.tms.onlinestore.repository.utils.ConnectionWrapper;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcUserRepositoryImpl implements UserRepository {

    private static final String GET_USERS_INFO = "select login_key, pass_value from \"online-store\".users";
    private static final String INSERT_USER_QUERY = "insert into \"online-store\".users (login_key, pass_value, first_name, second_name, day_of_birthday, gender, email) values (?, ?, ?, ?, ?, ?, ?)";

    private final ConnectionPool connectionPool;

    public JdbcUserRepositoryImpl(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    @Override
    public List<User> findUsersLoginPasswordAndPutAllInList() {
        List<User> users = new ArrayList<>();
        try (ConnectionWrapper connectionWrapper = getConnectionWrapper();
                Statement statement = connectionWrapper.getConnection().createStatement()) {
            try (ResultSet rs = statement.executeQuery(GET_USERS_INFO)) {
                while (rs.next()) {
                    String login = rs.getString(1);
                    String password = rs.getString(2);
                    users.add(new User(login, password));
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return users;
    }

    @Override
    public void addNewUser(User user) {
        try (ConnectionWrapper connectionWrapper = getConnectionWrapper();
                PreparedStatement statement = connectionWrapper.getConnection().prepareStatement(INSERT_USER_QUERY)) {
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getName());
            statement.setString(4, user.getSurname());
            statement.setDate(5, Date.valueOf(user.getBirthday()));
            statement.setString(6, user.getGender());
            statement.setString(7, user.getEmail());
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Exception in addNewUser: " + e.getMessage());
        }
    }

    @Override
    public User findAndGetUserByLoginAndPassword(String login, String password) {
//
//
//
//        stmt = conn.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
//        stmt.setString(1, username);
//        stmt.setString(2, password);
//
//        rs = stmt.executeQuery();
//
//        if (rs.next()) {
//            response.sendRedirect("home.jsp");
//        } else {
//            PrintWriter out = response.getWriter();
//            out.println("<html><body><p>Invalid username or password.</p></body></html>");
//        return new User();
        return new User();
    }

}
