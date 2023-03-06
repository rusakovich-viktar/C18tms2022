package by.tms.repository.security;

import by.tms.model.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcSecurityRepository implements SecurityRepositoryAware {

    private static final String GET_USERS_INFO = "select login_key, pass_value from users";
    private static final String INSERT_USER_QUERY = "insert into users (login_key, pass_value, first_name, second_name, day_of_birthday, gender, email) values (?, ?, ?, ?, ?, ?, ?)";
    
    private final Connection connection;

    public JdbcSecurityRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<User> findUserLoginPassword() {
        List<User> users = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(GET_USERS_INFO);
            while (rs.next()) {
                String login = rs.getString(1);
                String password = rs.getString(2);
                users.add(new User(login, password));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return users;
    }

    @Override
    public void addNewUser(User user) {
        try {
            PreparedStatement statement = connection.prepareStatement(INSERT_USER_QUERY);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getName());
            statement.setString(4, user.getSurname());
            statement.setDate(5, Date.valueOf(user.getBirthday()));
            statement.setString(6, user.getGender());
            statement.setString(7, user.getEmail());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

}


