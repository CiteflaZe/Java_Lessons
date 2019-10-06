package consoleAplication.service;

import consoleAplication.domain.Group;
import consoleAplication.domain.Student;
import consoleAplication.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface StudentService {
    User registration (User user);
    User login (String email, String password);
    void update (User user);
    void deleteById (Long id);
    User showUser(User user);
    List<Student> searchByGroup(String nameOfFaculty);
    List<User> showAll();
    List<Student> searchByBirthYear(int afterYear);
    HashMap<Group, ArrayList<Student>> listsOfStudentByEachGroup();

}
