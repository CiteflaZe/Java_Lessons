package hometask4.remake;

import hometask4.remake.domain.Student;
import hometask4.remake.repository.StudentRepository;
import hometask4.remake.repository.StudentRepositoryImpl;

import java.util.Objects;

public class Menu {


    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepositoryImpl();

        System.out.println(studentRepository.save(Student.builder().withId(1l).build()).toString());
    }

}
