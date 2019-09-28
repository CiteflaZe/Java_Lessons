package hometask4.remake.service;

import hometask4.remake.domain.Department;
import hometask4.remake.domain.Student;

import java.time.LocalDate;

public interface StudentService {

    Student register(Student student);

    String showAll();

    String findByDepartment(String departmentName);

    String findByDepartmentAndStudyYear(String departmentName, int year);

    String findByBornAfterDate(LocalDate date);

    String findByStudyGroup(String group);

}
