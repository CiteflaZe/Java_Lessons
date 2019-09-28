package hometask4.remake.service;

import hometask4.remake.domain.Department;
import hometask4.remake.domain.Student;
import hometask4.remake.repository.StudentRepository;
import hometask4.remake.repository.StudentRepositoryImpl;

import java.time.LocalDate;
import java.util.Objects;

public class StudentServiceImpl implements StudentService {
    private final StudentRepositoryImpl studentRepositoryImpl;

    public StudentServiceImpl(StudentRepositoryImpl studentRepository) {
        this.studentRepositoryImpl = studentRepository;
    }

    @Override
    public Student register(Student student) {
        if(Objects.isNull(student)){
            throw new IllegalArgumentException("Null is not allowed");
        }
        return studentRepositoryImpl.save(student);
    }

    @Override
    public String showAll() {
        StringBuffer res = new StringBuffer("[");
        for (Student student :
                this.studentRepositoryImpl.getIdToStudent().values()) {
            res.append(student.toString());
            res.append("\n");
        }
        res.append("]");
        res.replace(res.length() - 2, res.length(), "]");
        return res.toString();
    }

    @Override
    public String findByDepartment(String departmentName) {
        if (Objects.isNull(departmentName)) {
            throw new NullPointerException("Department is null");
        } else if (departmentName.isEmpty()) {
            throw new RuntimeException("Faculty is empty");
        }else {
            StringBuilder res = new StringBuilder("[");
            for (Student student :
                    this.studentRepositoryImpl.getIdToStudent().values()) {
                if (Objects.nonNull(student.getDepartment()) && student.getDepartment().getName().equals(departmentName)) {
                    res.append(student.toString());
                    res.append("\n");
                }
            }
            res.append("]");
            res.replace(res.length() - 2, res.length(), "]");

            return res.toString();
        }
    }

    @Override
    public String findByDepartmentAndStudyYear(String departmentName, int year) {
        StringBuffer res = new StringBuffer("Department ");
        res.append(departmentName);
        res.append(":\n");

        res.append(findByDepartment(departmentName));
        if (year < 1 || year > 6) {
            throw new IllegalArgumentException("Study year can't be less than 1 or greater than 6");
        } else {
            res.append("\nStudy year ");
            res.append(year);
            res.append(":\n[");
            for (Student student :
                    this.studentRepositoryImpl.getIdToStudent().values()) {
                if (student.getStudyYear() == year) {
                    res.append(student.toString());
                    res.append("\n");
                }
            }
            res.append("]");
            res.replace(res.length() - 2, res.length(), "]");
            return res.toString();
        }
    }

    @Override
    public String findByBornAfterDate(LocalDate date) {
        if (Objects.isNull(date)) {
            throw new NullPointerException("Date can't be null");
        } else if (date.isAfter(LocalDate.now())) {
            throw new RuntimeException("Date can't be further then now");
        } else {
            StringBuilder res = new StringBuilder("[");
            for (Student student :
                    this.studentRepositoryImpl.getIdToStudent().values()) {
                if (Objects.nonNull(student.getDateOfBirth()) && student.getDateOfBirth().isAfter(date)) {
                    res.append(student.toString());
                    res.append("\n");
                }
            }
            res.append("]");
            res.replace(res.length() - 2, res.length(), "]");
            return res.toString();
        }
    }

    @Override
    public String findByStudyGroup(String group) {
        if (Objects.isNull(group)) {
            throw new NullPointerException("Group can't be null");
        } else if (group.isEmpty()) {
            throw new RuntimeException("Group is empty");
        } else {
            StringBuilder res = new StringBuilder("[");
            for (Student student :
                    this.studentRepositoryImpl.getIdToStudent().values()) {
                if (Objects.nonNull(student.getGroup()) && student.getGroup().equals(group)) {
                    res.append(student.toString());
                    res.append("\n");
                }
            }
            res.append("]");
            res.replace(res.length() - 2, res.length(), "]");
            return res.toString();
        }
    }
}
