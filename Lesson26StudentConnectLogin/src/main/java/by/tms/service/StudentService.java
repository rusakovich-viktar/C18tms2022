package by.tms.service;

import by.tms.model.City;
import by.tms.model.Student;
import by.tms.model.User;
import by.tms.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private final StudentRepository jdbcStudentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.jdbcStudentRepository = studentRepository;
    }

    public List<Student> findStudents() {
        return jdbcStudentRepository.findStudents();
    }

    public void deleteStudent(Long id) {
        jdbcStudentRepository.deleteStudent(id);
    }

    public void addNewStudent(Student student) {
        jdbcStudentRepository.addNewStudent(student);
    }

    public void updateStudents(Student student) {
        jdbcStudentRepository.updateStudents(student);
    }

    public List<City> findCity() {
        return jdbcStudentRepository.findCity();
    }

    public List<User> findUserLoginPassword() {
        return jdbcStudentRepository.findUserLoginPassword();
    }


}


