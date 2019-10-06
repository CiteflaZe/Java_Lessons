package project.repository;

import org.springframework.stereotype.Component;
import project.domain.Student;

import java.util.List;
import java.util.Optional;

@Component
public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public Student save(Student user) {
        return null;
    }

    @Override
    public Optional<Student> findEmail(String email) {
        return Optional.empty();
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public List<Student> findByName() {
        return null;
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Optional<Student> deleteByEmail(String email) {
        return Optional.empty();
    }
}
