package project.repository;

import project.domain.Student;

import java.util.List;
import java.util.Optional;

//CRUD
public interface StudentRepository {

    Student save(Student user);

    Optional<Student> findEmail(String email);

    List<Student> findAll();

    List<Student> findByName();

    void update(Student student);

//    Only admin can do this
    Optional<Student> deleteByEmail(String email);
}
