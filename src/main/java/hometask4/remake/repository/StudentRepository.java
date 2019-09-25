package hometask4.remake.repository;

import hometask4.remake.domain.Student;

public interface StudentRepository {

    Student save(Student student);

    Student findById(Long id);

    Student update(Long id, Student student);

    Student deleteById(Long id);

}
