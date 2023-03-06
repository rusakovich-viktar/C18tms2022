package by.tms.repository.student;

import by.tms.model.City;
import by.tms.model.Student;
import java.util.List;

public interface StudentRepository {

    List<Student> findStudents();

    void deleteStudent(Long id);

    void addNewStudent(Student student);

    void updateStudents(Student student);

    List<City> findCity();

//    List<User> findUserLoginPassword();
}