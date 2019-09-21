package hometask4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class StudentList implements StudentListSearch {
    public ArrayList<Student> students;

    public StudentList() {
        this.students = new ArrayList<>();
    }

    public StudentList(ArrayList<Student> list) {
        if (Objects.isNull(list)) {
            throw new NullPointerException("List can't be null");
        } else if (list.isEmpty()) {
            throw new RuntimeException("List can't be empty");
        } else {
            this.students = new ArrayList<>(list);
        }
    }

    @Override
    public String searchByFaculty(String faculty) {
        if (Objects.isNull(faculty)) {
            throw new NullPointerException("Faculty is null");
        } else if (faculty.isEmpty()) {
            throw new RuntimeException("Faculty is empty");
        } else {
            String res = "[";
            for (Student student :
                    this.students) {
                if (Objects.nonNull(student.getFaculty()) && student.getFaculty().equals(faculty)) {
                    res += student.toString() + "\n";
                }
            }
            res += "]";
            res = res.replace("\n]", "]");
            return res;
        }

    }

    @Override
    public String searchByFacultyAndStudyYear(String faculty, int year) {
        if (Objects.isNull(faculty)) {
            throw new NullPointerException("Faculty is null");
        } else if (faculty.isEmpty()) {
            throw new RuntimeException("Faculty is empty");
        } else if (year < 1 || year > 6) {
            throw new RuntimeException("Study year can't be less than 1 or greater than 6");
        } else {
            String res = "Faculty " + faculty + ":\n";
            res += searchByFaculty(faculty);
            res += "\nStudy year " + year + ":\n[";
            for (Student student :
                    this.students) {
                if (student.getStudyYear() == year) {
                    res += student.toString() + "\n";
                }
            }
            res += "]";
            res = res.replace("\n]", "]");
            return res;
        }
    }

    @Override
    public String searchStudentsBornAfterDate(LocalDate date) {
        if (Objects.isNull(date)) {
            throw new NullPointerException("Date can't be null");
        } else if (date.isAfter(LocalDate.now())) {
            throw new RuntimeException("Date can't be further then now");
        } else {
            String res = "[";
            for (Student student :
                    this.students) {
                if (Objects.nonNull(student.getDateOfBirth()) && student.getDateOfBirth().isAfter(date)) {
                    res += student.toString() + "\n";
                }
            }
            res += "]";
            res = res.replace("\n]", "]");
            return res;
        }

    }

    @Override
    public String searchByStudyGroup(String studyGroup) {
        if (Objects.isNull(studyGroup)) {
            throw new NullPointerException("Group can't be null");
        } else if (studyGroup.isEmpty()) {
            throw new RuntimeException("Group is empty");
        } else {
            String res = "[";
            for (Student student :
                    this.students) {
                if (Objects.nonNull(student.getGroup()) && student.getGroup().equals(studyGroup)) {
                    res += student.toString() + "\n";
                }
            }
            res += "]";
            res = res.replace("\n]", "]");
            return res;
        }
    }
}
