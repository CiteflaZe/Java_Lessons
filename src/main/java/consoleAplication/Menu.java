package consoleAplication;

import consoleAplication.domain.*;
import consoleAplication.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

@Component
public class Menu {

    private final StudentServiceImpl studentService;
    private Locale locale_en = new Locale("en", "US");
    private Locale locale_ru = new Locale("ru", "RU");
    private ResourceBundle bundle = ResourceBundle.getBundle("apptext", locale_en);

    private User user = null;
    private Scanner scanner = new Scanner(System.in);

    @Autowired
    public Menu(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    private void noOne() {

        System.out.println(bundle.getString("menu.0"));

        System.out.println(bundle.getString("menu.1"));

        System.out.println(bundle.getString("menu.7"));

        System.out.println(bundle.getString("menu.8"));
        String menu = scanner.nextLine();
        switch (menu) {
            case "0":
                registration();
                break;
            case "1":
                login();
                break;
            case "2":
                exit();
                break;
            case "3":
                language();
                break;
            default:
                System.out.println(bundle.getString("menu.wrong"));
        }
    }

    private void isStudent() {

        System.out.println(bundle.getString("menu.stud"));

        System.out.println(bundle.getString("menu.20"));

        System.out.println(bundle.getString("menu.31"));

        System.out.println(bundle.getString("menu.group"));

        System.out.println(bundle.getString("menu.63"));

        System.out.println(bundle.getString("menu.74"));

        System.out.println(bundle.getString("menu.85"));

        String menu = (scanner.nextLine());
        switch (menu) {
            case "0":
                showMe();
                break;
            case "1":
                update();
                break;
            case "2":
                searchGroup();
                break;
            case "3":
                logout();
                break;
            case "4":
                exit();
                break;
            case "5":
                language();
                break;
            default:
                System.out.println(bundle.getString("menu.wrong"));
        }
    }

    private void searchGroup() {
        Student student = (Student) user;
        for (Student student1 : studentService.searchByGroup(student.getGroup().getName())) {
            System.out.println(student.toString());
        }

    }

    private void isAdmin() {
        System.out.println(bundle.getString("menu.admin"));
        System.out.println(bundle.getString("menu.41"));
        System.out.println(bundle.getString("menu.52"));
        System.out.println(bundle.getString("menu.delete"));

        System.out.println(bundle.getString("menu.64"));
        System.out.println(bundle.getString("menu.75"));

        System.out.println(bundle.getString("menu.86"));
        String menu = (scanner.nextLine());
        switch (menu) {
            case "1":
                showAll();
                break;
            case "2":
                search();
                break;
            case "3":
                deleteById();
                break;
            case "4":
                logout();
                break;
            case "5":
                exit();
                break;
            case "6":
                language();
                break;
            default:
                System.out.println(bundle.getString("menu.wrong"));
        }
    }

    private void deleteById() {
        System.out.println(bundle.getString("menu.de"));
        int some = Integer.parseInt(scanner.nextLine());
        Long a = (long) some;
        studentService.deleteById(a);
    }


    public void menu() {
        studentService.add();
        while (true) {
            if (user == null) {
                noOne();
            } else if (user.getRole() == Role.STUDENT) {
                isStudent();
            } else if (user.getRole() == Role.ADMIN) {
                isAdmin();
            }
        }

    }

    public void language() {
        System.out.println("1 - Русский");
        System.out.println("2 - English");
        int i = Integer.parseInt(scanner.nextLine());
        if (i == 1) {
            bundle = ResourceBundle.getBundle("apptext", locale_ru);
        } else if (i == 2) {
            bundle = ResourceBundle.getBundle("apptext", locale_en);
        }
    }


    public void login() {
        if (user == null) {
            System.out.println(bundle.getString("login.login"));
            String email = scanner.nextLine();
            System.out.println(bundle.getString("login.pass"));
            String pass = scanner.nextLine();

            user = studentService.login(email, pass);

            if (user == null) {
                System.out.println(bundle.getString("login.wrong"));
            } else {
                System.out.println(bundle.getString("login.sucsess"));
            }
        }

    }

    public void registration() {
        if (user == null) {
            System.out.println(bundle.getString("registration.first"));
            System.out.println(bundle.getString("registration.name"));
            String name = scanner.nextLine();
            System.out.println(bundle.getString("registration.sur"));
            String surname = scanner.nextLine();
            System.out.println(bundle.getString("registration.mail"));
            String mail = scanner.nextLine();
            System.out.println(bundle.getString("registration.date"));
            String date = scanner.nextLine();
            LocalDate birthDate = LocalDate.parse(date);
            System.out.println(bundle.getString("registration.sity"));
            String siti = scanner.nextLine();
            System.out.println(bundle.getString("registration.street"));
            String street = scanner.nextLine();
            Address address = new Address(siti, street);
            System.out.println(bundle.getString("registration.group"));
            String gr = scanner.nextLine();
            Group group = new Group(gr);
            System.out.println(bundle.getString("registration.number"));
            String phoneNumber = scanner.nextLine();
            System.out.println(bundle.getString("registration.pass"));
            String pa = scanner.nextLine();
            ;
            System.out.println();
            Student reg = Student.builder().setAddress(address)
                    .setBirthDate(birthDate)
                    .setGroup(group)
                    .setName(name)
                    .setPhoneNumber(phoneNumber)
                    .setSurName(surname)
                    .setEmail(mail)
                    .setPassword(pa)
                    .setRole(Role.STUDENT)
                    .build();

            studentService.registration(reg);
            user = reg;
            System.out.println(bundle.getString("registration.succ"));
        } else {
            System.out.println(bundle.getString("registration.already"));
        }
    }

    public void showMe() {
        if (user == null) {
            System.out.println(bundle.getString("showMe.firts"));
        } else {
            System.out.println(bundle.getString("showMe.proff"));
            if (user.getRole() == Role.STUDENT) {
                Student student = (Student) studentService.showUser(user);
                System.out.println(student.toString());
            } else {
                Admin admin = (Admin) studentService.showUser(user);
                System.out.println(admin.toString());
            }
        }

    }

    public void logout() {
        if (user == null) {
            System.out.println(bundle.getString("logout.first"));
        } else {
            user = null;
            System.out.println(bundle.getString("logout.succ"));
        }
    }

    public void search() {
        System.out.println(bundle.getString("search.first"));
        System.out.println(bundle.getString("search.1"));
        System.out.println(bundle.getString("search.2"));
        System.out.println(bundle.getString("search.3"));
        int mb = Integer.parseInt(scanner.nextLine());
        switch (mb) {
            case 1:
                System.out.println(bundle.getString("search.group"));
                String qwe = scanner.nextLine();
                if (studentService.searchByGroup(qwe).size() == 0) {
                    System.out.println(bundle.getString("search.empy"));
                } else {
                    for (Student student : studentService.searchByGroup(qwe)) {
                        System.out.println(student.toString());
                    }
                }
                break;
            case 2:
                System.out.println(bundle.getString("search.year"));
                int year = Integer.parseInt(scanner.nextLine());
                if (studentService.searchByBirthYear(year).size() == 0) {
                    System.out.println(bundle.getString("search.empy"));
                } else {
                    for (Student student : studentService.searchByBirthYear(year)) {
                        System.out.println(student.toString());
                    }
                }
                break;

            case 3:
                if (studentService.listsOfStudentByEachGroup().size() == 0) {
                    System.out.println(bundle.getString("search.empy"));
                } else {
                    for (Group g : studentService.listsOfStudentByEachGroup().keySet()) {
                        System.out.println(g.getName());
                        for (Student student : studentService.listsOfStudentByEachGroup().get(g)) {
                            System.out.println(student.toString());
                        }
                    }
                }
                break;

            default:
                System.out.println(bundle.getString("search.wrong"));
        }
    }

    public void update() {
        if (user == null) {
            System.out.println(bundle.getString("update.first"));
        } else {
            Student student = (Student) user;
            System.out.println(bundle.getString("update.curr"));
            System.out.println(student.toString());
            System.out.println(bundle.getString("update.up"));
            System.out.println(bundle.getString("registration.name"));
            String name = scanner.nextLine();
            System.out.println(bundle.getString("registration.sur"));
            String surname = scanner.nextLine();
            System.out.println(bundle.getString("registration.mail"));
            String mail = scanner.nextLine();
            ;

            System.out.println(bundle.getString("registration.date"));
            String date = scanner.nextLine();
            LocalDate birthDate = LocalDate.parse(date);
            System.out.println(bundle.getString("registration.sity"));
            String siti = scanner.nextLine();
            System.out.println(bundle.getString("registration.street"));
            String street = scanner.nextLine();
            Address address = new Address(siti, street);
            System.out.println(bundle.getString("registration.group"));
            String gr = scanner.nextLine();
            Group group = new Group(gr);
            System.out.println(bundle.getString("registration.number"));
            String phoneNumber = scanner.nextLine();
            System.out.println(bundle.getString("registration.pass"));
            String pa = scanner.nextLine();
            ;
            Student reg = Student.builder().setAddress(address)
                    .setBirthDate(birthDate)
                    .setGroup(group)
                    .setName(name)
                    .setPhoneNumber(phoneNumber)
                    .setSurName(surname)
                    .setEmail(mail)
                    .setPassword(pa)
                    .build();

            studentService.registration(reg);
            user = reg;
            System.out.println(bundle.getString("update.succ"));
        }
    }

    public void showAll() {
        System.out.println(bundle.getString("showAll.first"));

        for (User student : studentService.showAll()) {
            System.out.println(student.toString());
        }
    }

    public void exit() {
        System.exit(0);
    }

}
