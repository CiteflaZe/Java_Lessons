package hometask4;

public interface StudentListSearch {

    String searchByFaculty(String faculty);

    String searchByFacultyAndStudyYear(String faculty, int year);

    String searchStudentsBornAfterDate();

    String searchByStudyGroup(String studyGroup);

}
