package repository;


import model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcStudentRepository implements StudentRepository {

    private static final String GET_ALL_STUDENTS_QUERY = "select name,surname,course, city_name from students left join city on city.id = students.id_city";

    private final Connection connection;

    public JdbcStudentRepository(Connection connection) {
        this.connection = connection;
    }


    @Override
    public List<Student> findStudents() {
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(GET_ALL_STUDENTS_QUERY);
            List<Student> students = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int course = rs.getInt("course");
                String city = rs.getString("city_name");
                students.add(new Student(name, surname, course, city));
            }
            return students;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}