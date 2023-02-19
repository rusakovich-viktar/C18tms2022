package by.tms.service;

import by.tms.model.Student;
import by.tms.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private final StudentRepository JdbcStudentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.JdbcStudentRepository = studentRepository;
    }

    public List<Student> findStudents() {
        return JdbcStudentRepository.findStudents();
    }

    public void deleteStudent(Long id) {
        JdbcStudentRepository.deleteStudent(id);
    }

    public void addNewStudent(Student student) {
        JdbcStudentRepository.addNewStudent(student);
    }

    public void updateStudents(Student student) {
        JdbcStudentRepository.updateStudents(student);
    }

//    public void selectOneRow(Long id) {
//        JdbcStudentRepository.selectOneRow(id);
//    }

}


