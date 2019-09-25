package hometask4.remake.service;

import hometask4.remake.domain.Department;
import hometask4.remake.domain.Student;

import java.time.LocalDate;

public interface StudentService {

    Student register(Student student);

    Student findById();

    String findByDepartment(Department department);

    String findByDepartmentAndStudyYear(Department department, int year);

    String findByBornAfterDate(LocalDate date);

    String findByStudyGroup(String group);

}
