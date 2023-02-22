package by.tms.repository;

import by.tms.model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SecurityRepository implements SecurityRepositoryAware {
    private static final String GET_USERS_INFO = "select login_key, pass_value from users";
    private Connection connection;
//    НЕ ПОНЯЛ КАК ВЗЯТЬ КОННЕКШЕН живой из листнера и перенес секьюрный метод в студентов с живым коннекшеном

    public SecurityRepository(Connection connection) {
    }

    @Override
    public List<User> findUserLoginPassword() {
        List<User> users = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(GET_USERS_INFO);
            while (rs.next()) {
                String login = rs.getString("user_login");
                String password = rs.getString("user_pass");
                users.add(new User(login, password));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return users;
    }
}


