package by.tms.repository;

import by.tms.Student;
import java.util.List;

public interface StudentRepository {

    List<Student> findStudents();
}