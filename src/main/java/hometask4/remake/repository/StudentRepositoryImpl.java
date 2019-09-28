package hometask4.remake.repository;

import hometask4.remake.domain.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class StudentRepositoryImpl implements StudentRepository {
    private Map<Long, Student> idToStudent = new HashMap<>();
    private static Long counter = 0L;

    public StudentRepositoryImpl(){

    }

    @Override
    public Student save(Student student) {
        if (Objects.isNull(student)) {
            throw new IllegalArgumentException("Null is not allowed");
        }
        return idToStudent.put(++counter, student);
    }

    @Override
    public Student findById(Long id) {
        if (Objects.isNull(id)) {
            throw new IllegalArgumentException("Null is not allowed");
        } else {
            return idToStudent.getOrDefault(id, null);
        }
    }

    @Override
    public Student update(Long id, Student student) {
        if (Objects.isNull(id)) {
            throw new IllegalArgumentException("Null is not allowed");
        }
        if (findById(id) == null){
            throw new IndexOutOfBoundsException("There is no user with this id");
        }
        return idToStudent.put(id, student);
    }

    @Override
    public Student deleteById(Long id) {
        if (Objects.isNull(id)) {
            throw new IllegalArgumentException("Null is not allowed");
        }
        return idToStudent.remove(id);
    }

    public Map<Long, Student> getIdToStudent() {
        return idToStudent;
    }
}
