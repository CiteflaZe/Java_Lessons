package hometask4;

import java.time.LocalDate;

public interface StudentListSearch {

    String searchByFaculty(String faculty);

    String searchByFacultyAndStudyYear(String faculty, int year);

    String searchStudentsBornAfterDate(LocalDate date);

    String searchByStudyGroup(String studyGroup);

}
