/* Пока просто не трогаю
package by.tms.utils;

import by.tms.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    //CRUD      создание(англ. create),     чтение (read),           модификация (update),            удаление (delete).
    //В SQL     Insert (создание записей),  Select (чтение записей), Update (редактирование записей), Delete (удаление записей).

    private static final String GET_ALL_STUDENTS_QUERY = "SELECT * FROM students";
    private static final String INSERT_STUDENT_QUERY = "INSERT INTO students(cityName, surname, course) VALUES(?, ?, ?)";
    private static final String UPDATE_STUDENT_QUERY = "UPDATE students SET course = ? WHERE id = ?";
    private static final String DELETE_STUDENT_QUERY = "DELETE FROM students WHERE id = ?";

    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_STUDENTS_QUERY);
            ResultSet rs = preparedStatement.executeQuery();
//            Statement statement = connection.createStatement(); //обьект для создания запросов
//            ResultSet rs = statement.executeQuery(GET_ALL_STUDENTS_QUERY); //сам запрос и его результат
            while (rs.next()) {
                int id = rs.getInt("id");
                String cityName = rs.getString("cityName");
                String surname = rs.getString("surname");
                int course = rs.getInt("course");
                students.add(new Student(id, cityName, surname, course));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    public static List<Student> saveStudent(Student student) { //вставить нового студента и обновить список all
        List<Student> updatedStudents = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_QUERY);
            preparedStatement.setString(1, student.getCityName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setInt(3, student.getCourse());
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
*/
