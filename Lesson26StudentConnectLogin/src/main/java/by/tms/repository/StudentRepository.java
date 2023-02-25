package by.tms.repository;

import by.tms.City;
import by.tms.Student;
import by.tms.User;
import java.util.List;

public interface StudentRepository {

    List<Student> findStudents();

    void deleteStudent(Long id);

    void addNewStudent(Student student);

    void updateStudents(Student student);

    List<City> findCity();

    List<User> findUserLoginPassword();
}