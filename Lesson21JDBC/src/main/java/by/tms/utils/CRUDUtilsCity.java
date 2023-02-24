//Тут ничего не поменялось относительно стандартного CRUD кроме City(не работающего (в ALL))

package by.tms.utils;

import by.tms.City;
import by.tms.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtilsCity {
    //CRUD      создание(англ. create),     чтение (read),           модификация (update),            удаление (delete).
    //В SQL     Insert (создание записей),  Select (чтение записей), Update (редактирование записей), Delete (удаление записей).

    private static final String GET_ALL_STUDENTS_QUERY = "select * from students left join city on city.id = students.id_city";
    private static final String INSERT_STUDENT_QUERY = "INSERT INTO students(name, surname, course, id_city) VALUES(?, ?, ?, ?)";
    private static final String UPDATE_STUDENT_QUERY = "UPDATE students SET course = ? WHERE id = ?";
    private static final String DELETE_STUDENT_QUERY = "DELETE FROM students WHERE id = ?";

    public static List<Student> getAllStudents() { //информация о всех студентах
        List<Student> students = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_STUDENTS_QUERY);
            ResultSet rs = preparedStatement.executeQuery();
//            Statement statement = connection.createStatement(); //обьект для создания запросов
//            ResultSet rs = statement.executeQuery(GET_ALL_STUDENTS_QUERY); //сам запрос и его результат
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

    public static List<Student> insertStudent(Student student) { //вставить нового студента и обновить список all
        List<Student> updatedStudents = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_QUERY);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setInt(3, student.getCourse());
            preparedStatement.setLong(4, student.getCity(new City()));//я запутался

            preparedStatement.executeUpdate();

            updatedStudents = getAllStudents();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return updatedStudents;
    }

    public static List<Student> updateStudent(int studentId, int course) {
        List<Student> updatedStudents = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STUDENT_QUERY);
            preparedStatement.setInt(1, course);
            preparedStatement.setInt(2, studentId);
            preparedStatement.executeUpdate();

            updatedStudents = getAllStudents();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return updatedStudents;
    }

    public static List<Student> deleteStudent(int studentId) {
        List<Student> updatedStudents = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT_QUERY);
            preparedStatement.setInt(1, studentId);
            preparedStatement.execute();

            updatedStudents = getAllStudents();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return updatedStudents;
    }
}