package hometask4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import java.time.LocalDate;
import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StudentRosterTest {
    private StudentRoster studentRosterForSearch = new StudentRoster();
    private String searchZXCResult = "[ID: 3, Name: null, Surname: null, Patronymic: null, Date of birth: 1987-04-13, Address: null, Phone number: 0, Faculty: ZXC, Year: 3, Group: S" +
            "\nID: 4, Name: null, Surname: null, Patronymic: null, Date of birth: 1991-04-13, Address: null, Phone number: 0, Faculty: ZXC, Year: 2, Group: G]";
    private String searchFacultyAndYearResult = "Faculty ZXC:\n" + searchZXCResult + "\nStudy year 3:" +
            "\n[ID: 1, Name: null, Surname: null, Patronymic: null, Date of birth: 1965-04-13, Address: null, Phone number: 0, Faculty: ABC, Year: 3, Group: S" +
            "\nID: 3, Name: null, Surname: null, Patronymic: null, Date of birth: 1987-04-13, Address: null, Phone number: 0, Faculty: ZXC, Year: 3, Group: S]";
    private String searchBornAfterDate = "[ID: 2, Name: null, Surname: null, Patronymic: null, Date of birth: 1999-04-13, Address: null, Phone number: 0, Faculty: ABC, Year: 2, Group: G\n" +
            "ID: 4, Name: null, Surname: null, Patronymic: null, Date of birth: 1991-04-13, Address: null, Phone number: 0, Faculty: ZXC, Year: 2, Group: G]";
    private String searchStudyGroup = "[ID: 2, Name: null, Surname: null, Patronymic: null, Date of birth: 1999-04-13, Address: null, Phone number: 0, Faculty: ABC, Year: 2, Group: G\n" +
            "ID: 4, Name: null, Surname: null, Patronymic: null, Date of birth: 1991-04-13, Address: null, Phone number: 0, Faculty: ZXC, Year: 2, Group: G]";

    {
        studentRosterForSearch.students.add(Student.builder()
                .withId(1)
                .withFaculty("ABC")
                .withDateOfBirth(LocalDate.of(1965, 4, 13))
                .withGroup("S")
                .withStudyYear(3)
                .build());
        studentRosterForSearch.students.add(Student.builder()
                .withId(2)
                .withFaculty("ABC")
                .withDateOfBirth(LocalDate.of(1999, 4, 13))
                .withGroup("G")
                .withStudyYear(2)
                .build());
        studentRosterForSearch.students.add(Student.builder()
                .withId(3)
                .withFaculty("ZXC")
                .withDateOfBirth(LocalDate.of(1987, 4, 13))
                .withGroup("S")
                .withStudyYear(3)
                .build());
        studentRosterForSearch.students.add(Student.builder()
                .withId(4)
                .withFaculty("ZXC")
                .withDateOfBirth(LocalDate.of(1991, 4, 13))
                .withGroup("G")
                .withStudyYear(2)
                .build());
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    @Test
    public void studentListConstructorShouldThrowNullPointerException() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("List can't be null");

        StudentRoster sl = new StudentRoster(null);
    }

    @Test
    public void studentListConstructorShouldThrowRuntimeException() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("List can't be empty");

        StudentRoster sl = new StudentRoster(new ArrayList<>());
    }

    @Test
    public void studentListDefaultConstructorObjectCreation() {
        Student expect = Student.builder()
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
                .build();

        StudentRoster result = new StudentRoster();
        result.students.add(Student.builder()
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

        assertThat(expect.toString(), is(result.students.get(0).toString()));
    }

    @Test
    public void studentListSecondConstructorObjectCreation() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(Student.builder()
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
        list.add(Student.builder()
                .withId(2)
                .withName("Jack")
                .build());
        list.add(Student.builder()
                .withId(3)
                .withName("Z")
                .withPhoneNumber(111444832)
                .build());

        StudentRoster sl = new StudentRoster(list);

        assertThat(list, is(sl.students));
    }

    @Test
    public void facultySearchShouldThrowNullPointerException() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Faculty is null");

        studentRosterForSearch.searchByFaculty(null);
    }

    @Test
    public void facultySearchShouldThrowRuntimeException() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Faculty is empty");

        studentRosterForSearch.searchByFaculty("");
    }

    @Test
    public void facultySearchTest() {
        String res = studentRosterForSearch.searchByFaculty("ZXC");

        assertThat(searchZXCResult, is(res));
    }

    @Test
    public void facultyAndYearShouldThrowRuntimeException() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Study year can't be less than 1 or greater than 6");

        studentRosterForSearch.searchByFacultyAndStudyYear("ZXC", -4);
    }

    @Test
    public void facultyAndYearSearchTest() {
        String res = studentRosterForSearch.searchByFacultyAndStudyYear("ZXC", 3);

        assertThat(searchFacultyAndYearResult, is(res));
    }

    @Test
    public void bornAfterDateSearchShouldThrowNullPointerException() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Date can't be null");

        studentRosterForSearch.searchStudentsBornAfterDate(null);
    }

    @Test
    public void bornAfterDateSearchShouldThrowRuntimeException() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Date can't be further then now");

        studentRosterForSearch.searchStudentsBornAfterDate(LocalDate.of(2050, 1, 2));
    }

    @Test
    public void bornAfterDateSearchTest() {
        String res = studentRosterForSearch.searchStudentsBornAfterDate(LocalDate.of(1990, 2, 3));

        assertThat(searchBornAfterDate, is(res));
    }

    @Test
    public void studyGroupSearchShouldThrowNullPointerException() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Group can't be null");

        studentRosterForSearch.searchByStudyGroup(null);
    }

    @Test
    public void studyGroupSearchShouldThrowRuntimeException() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Group is empty");

        studentRosterForSearch.searchByStudyGroup("");
    }

    @Test
    public void studyGroupSearchTest() {
        String res = studentRosterForSearch.searchByStudyGroup("G");

        assertThat(searchStudyGroup, is(res));
    }


}