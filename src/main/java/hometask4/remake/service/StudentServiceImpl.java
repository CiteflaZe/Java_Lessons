package hometask4.remake.service;

import hometask4.remake.domain.Department;
import hometask4.remake.domain.Student;
import hometask4.remake.repository.StudentRepository;

import java.time.LocalDate;

public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student register(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findById() {
        return null;
    }

    @Override
    public String findByDepartment(Department department) {
        return null;
    }

    @Override
    public String findByDepartmentAndStudyYear(Department department, int year) {
        return null;
    }

    @Override
    public String findByBornAfterDate(LocalDate date) {
        return null;
    }

    @Override
    public String findByStudyGroup(String group) {
        return null;
    }
}
