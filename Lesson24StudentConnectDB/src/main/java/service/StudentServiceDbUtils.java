package service;

import model.Student;
import utils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceDbUtils {

    private static final String GET_ALL_STUDENTS_QUERY = "select name,surname,course, city_name from students left join city on city.id = students.id_city";

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_STUDENTS_QUERY);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int course = rs.getInt("course");
                String city = rs.getString("city_name");
                students.add(new Student(name, surname, course, city));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }
}