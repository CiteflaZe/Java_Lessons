package project.service;

import project.domain.Student;

import java.util.List;

public interface StudentService {

    Student register(Student student);

    Student login(String email, String password);

    List<Student> showAll();

}
