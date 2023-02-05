package service;

import model.Student;
import repository.StudentRepositoryTest;

import java.util.List;

public class StudentServiceTest {
    private final StudentRepositoryTest studentRepositoryTest;

    public StudentServiceTest(StudentRepositoryTest studentRepositoryTest) {
        this.studentRepositoryTest = studentRepositoryTest;
    }

    public List<Student> findStudentsTest() {
        return studentRepositoryTest.findStudentsTest();
    }
}
