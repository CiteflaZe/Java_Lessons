package project;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import project.domain.Address;
import project.domain.Department;
import project.domain.Student;

import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;

public class ConsoleApplication {

    public static void main(String[] args) {
//        Student st = Student.builder().withEmail("somemail@gmail.com")
//                .withName("GZ")
//                .withSurname("PS")
//                .withDateOfBirth(LocalDate.of(1995, 3, 12))
//                .withAddress(new Address("City", "Some Street", 13, 4))
//                .withPhoneNumber("000-000-00-00")
//                .withDepartment(new Department(11449L, "Department"))
//                .withStudyYear(2)
//                .withGroup("GX11")
//                .build();

//        Menu.bundle = ResourceBundle.getBundle("text", new Locale("ru", "RU"));


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ConsoleApplicationContext.xml");

        Menu menu = context.getBean("menu", Menu.class);
        menu.run();



    }
}
