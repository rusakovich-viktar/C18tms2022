package by.tms.repository;


import by.tms.model.City;
import by.tms.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcStudentRepository implements StudentRepository {

    private static final String GET_ALL_STUDENTS_QUERY = "select students.id,students.name,students.surname,students.course, city_name from students left join city on city.id = students.id_city order by students.id";
    private static final String DELETE_STUDENT_QUERY = "delete from students where id = ?";
    private static final String INSERT_STUDENT_QUERY = "insert into students (name, surname, course, id_city) values (?, ?, ?, ?)";
    private static final String UPDATE_STUDENT_QUERY = "UPDATE students set name = ?, surname = ?, course = ?, id_city = ? where students.id = ?";
    private static final String GET_ALL_CITY = "select id, city_name from city order by city_name";


    private final Connection connection;

    public JdbcStudentRepository(Connection connection) {
        this.connection = connection;
    }


    @Override
    public List<Student> findStudents() {
        List<Student> students = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(GET_ALL_STUDENTS_QUERY);
            while (rs.next()) {
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int course = rs.getInt("course");
                String cityName = rs.getString("city_name");
                students.add(new Student(id, name, surname, course, new City(cityName)));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    @Override
    public void deleteStudent(Long id) {
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE_STUDENT_QUERY);
            statement.setLong(1, id);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Override
    public void addNewStudent(Student student) {
        try {
            PreparedStatement statement = connection.prepareStatement(INSERT_STUDENT_QUERY);
            statement.setString(1, student.getName());
            statement.setString(2, student.getSurname());
            statement.setInt(3, student.getCourse());
            statement.setLong(4, student.getCity().getCityId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Override
    public void updateStudents(Student student) {
        try {
            PreparedStatement statement = connection.prepareStatement(UPDATE_STUDENT_QUERY);
            statement.setString(1, student.getName());
            statement.setString(2, student.getSurname());
            statement.setInt(3, student.getCourse());
            statement.setLong(4, student.getCity().getCityId());
            statement.setLong(5, student.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<City> findCity() {
        List<City> cities = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(GET_ALL_CITY);
            while (rs.next()) {
                Long cityId = rs.getLong("id");
                String cityName = rs.getString("city_name");
                cities.add(new City(cityId, cityName));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cities;
    }
}
