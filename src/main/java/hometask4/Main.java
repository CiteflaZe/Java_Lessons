package hometask4;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        StudentList sl = new StudentList();

        sl.students.add(Student.builder()
                .withId(1)
                .withName("Alex")
                .withSurname("Sliva")
                .withPatronymic("")
                .withDateOfBirth(LocalDate.of(1998, 11, 25))
                .withAddress("Some street 11")
                .withPhoneNumber(661894631)
                .withFaculty("X11")
                .withStudyYear(2)
                .withGroup("G-413")
                .build());
        sl.students.add(Student.builder()
                .withId(2)
                .withName("Jack")
                .withSurname("Morgan")
                .withPatronymic("")
                .withDateOfBirth(LocalDate.of(1978, 7, 12))
                .withAddress("Another Street 45")
                .withPhoneNumber(664241186)
                .withFaculty("X11")
                .withStudyYear(2)
                .withGroup("S-114")
                .build());

        System.out.println(sl.searchByFaculty("X11"));

    }


}
