package by.tms.repository.impl;

import by.tms.dto.UserDto;
import by.tms.model.User;
import by.tms.repository.UserRepository;
import by.tms.repository.utils.ConnectionWrapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
@AllArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private static final String GET_USERS_INFO = "select login_key, pass_value from \"online-store\".users";
    private static final String INSERT_USER_QUERY = "insert into \"online-store\".users (login_key, pass_value, first_name, second_name, day_of_birthday, gender, email, registration_date) values (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String GET_USER_BY_LOGIN_AND_PASSWORD = "SELECT id, login_key, pass_value, first_name, second_name, day_of_birthday, gender, email, registration_date FROM \"online-store\".users WHERE login_key = ? AND pass_value = ?";
    private static final String GET_USER_BY_ID = "SELECT id, login_key, first_name, second_name, day_of_birthday, gender, email, registration_date FROM \"online-store\".users WHERE id = ?";

    private static final String UPDATE_USER_QUERY = "UPDATE \"online-store\".users set first_name = ?, second_name = ?, day_of_birthday = ?, gender = ?, email = ? where \"online-store\".users.id = ?";

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
            statement.setDate(8, Date.valueOf(user.getRegistrationDate()));
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
                        .id(rs.getLong("id"))
                        .username(rs.getString("login_key"))
                        .password(rs.getString("pass_value"))
                        .name(rs.getString("first_name"))
                        .surname(rs.getString("second_name"))
                        .birthday(rs.getString("day_of_birthday"))
                        .gender(rs.getString("gender"))
                        .email(rs.getString("email"))
                        .registrationDate(rs.getString("registration_date"))
                        .build();
            }
        } catch (Exception e) {
            System.out.println("Exception connectionWrapper.getConnection().prepareStatement(GET_USER_BY_LOGIN_AND_PASSWORD): " + e.getMessage());
        }
        return user;
    }

    @Override
    public UserDto updateUserDtoById(UserDto userDto) {
        try (ConnectionWrapper connectionWrapper = getConnectionWrapper();
             PreparedStatement statement = connectionWrapper.getConnection().prepareStatement(UPDATE_USER_QUERY)) {
            statement.setString(1, userDto.getName());
            statement.setString(2, userDto.getSurname());
            statement.setDate(3, Date.valueOf(userDto.getBirthday()));
            statement.setString(4, userDto.getGender());
            statement.setString(5, userDto.getEmail());
            statement.setLong(6, userDto.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("SQLException:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("getConnectionWrapper exception in userRepository: " + e.getMessage());
        }
        return userDto;
    }

    @Override
    public UserDto findUserDtoById(Long id) {
        UserDto userDto = null;
        try (ConnectionWrapper connectionWrapper = getConnectionWrapper();
             PreparedStatement statement = connectionWrapper.getConnection().prepareStatement(GET_USER_BY_ID)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                userDto = UserDto.builder()
                        .id(rs.getLong("id"))
                        .username(rs.getString("login_key"))
                        .name(rs.getString("first_name"))
                        .surname(rs.getString("second_name"))
                        .birthday(rs.getString("day_of_birthday"))
                        .gender(rs.getString("gender"))
                        .email(rs.getString("email"))
                        .registrationDate(rs.getString("registration_date"))
                        .build();
            }
        } catch (Exception e) {
            System.out.println("Exception connectionWrapper.getConnection().prepareStatement(GET_USER_BY_ID): " + e.getMessage());
        }
        return userDto;
    }

}
