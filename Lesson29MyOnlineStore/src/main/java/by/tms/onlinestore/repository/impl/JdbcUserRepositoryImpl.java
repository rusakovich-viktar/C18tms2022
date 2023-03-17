package by.tms.onlinestore.repository.impl;

import by.tms.onlinestore.model.User;
import by.tms.onlinestore.repository.UserRepository;
import by.tms.onlinestore.repository.utils.ConnectionPool;
import by.tms.onlinestore.repository.utils.ConnectionWrapper;
import lombok.Builder;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Builder
public class JdbcUserRepositoryImpl implements UserRepository {

    private static final String GET_USERS_INFO = "select login_key, pass_value from \"online-store\".users";
    private static final String INSERT_USER_QUERY = "insert into \"online-store\".users (login_key, pass_value, first_name, second_name, day_of_birthday, gender, email) values (?, ?, ?, ?, ?, ?, ?)";
    private static final String GET_USER_BY_LOGIN_AND_PASSWORD = "SELECT login_key, pass_value, first_name, second_name, day_of_birthday, gender, email FROM \"online-store\".users WHERE login_key = ? AND pass_value = ?";
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
                System.out.println("Exeption statement.executeQuery(GET_USERS_INFO)" + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("connectionWrapper.getConnection().createStatement()" + e.getMessage());
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
    public User getUserByLoginAndPassword(String login, String password) {
        User user = null;
        try (ConnectionWrapper connectionWrapper = getConnectionWrapper();
             PreparedStatement statement = connectionWrapper.getConnection().prepareStatement(GET_USER_BY_LOGIN_AND_PASSWORD)) {
            statement.setString(1, login);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                user = User.builder()
                        .username(rs.getString("login_key"))
                        .password(rs.getString("pass_value"))
                        .name(rs.getString("first_name"))
                        .surname(rs.getString("second_name"))
                        .birthday(rs.getString("day_of_birthday"))
                        .gender(rs.getString("gender"))
                        .email(rs.getString("email"))
                        .build();
            }
        } catch (Exception e) {
            System.out.println("Exception connectionWrapper.getConnection().prepareStatement(GET_USER_BY_LOGIN_AND_PASSWORD): " + e.getMessage());
        }
        return user;
    }
}
