package by.tms.repository;


import by.tms.model.Student;

import java.util.List;

public interface StudentRepository {

    List<Student> findStudents();

    void deleteStudent(Long id);

    void addNewStudent(Student student);

    void updateStudents(Student student);

//    public Student selectOneRow(Long id);

}
