package consoleAplication.service;

import consoleAplication.domain.*;
import consoleAplication.repository.UserRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class StudentServiceImpl implements StudentService {
    private final UserRepository userRepository;
    private final UserValidator userValidator;
    private static Logger logger = Logger.getLogger(StudentServiceImpl.class.getName());

    @Autowired
    public StudentServiceImpl(UserRepository studentRepository, UserValidator userValidator) {
        this.userRepository = studentRepository;
        this.userValidator = userValidator;
    }

    public void add(){
        Student student1 = Student.builder()
                .setEmail("user")
                .setAddress(new Address("1", "2"))
                .setPassword("user")
                .setSurName("sad")
                .setName("w")
                .setBirthDate(LocalDate.of(1997, Month.APRIL, 12))
                .setGroup(new Group("1"))
                .setRole(Role.STUDENT).build();
        Student student2 = Student.builder().setPassword("1").setEmail("1").setGroup(new Group("1")).
                setBirthDate(LocalDate.of(1997, Month.APRIL, 12)).setRole(Role.STUDENT).build();
        Student student3 = Student.builder().setEmail("123").setPassword("asf").setGroup(new Group("1"))
                .setBirthDate(LocalDate.of(1998, Month.APRIL, 12)).setRole(Role.STUDENT)
                .build();
        Student b = Student.builder().setEmail("saf").setPassword("2").setGroup(new Group("frqw"))
                .setBirthDate(LocalDate.of(1998, Month.APRIL, 12)).setRole(Role.STUDENT)
                .build();
        Admin ad = Admin.builder().setEmail("admin").setPassword("admin").setRole(Role.ADMIN).setName("Admin")
                .setSurName("qwe")
                .build();
        userRepository.save(student1);
        userRepository.save(student2);
        userRepository.save(student3);
        userRepository.save(b);
        userRepository.save(ad);
    }

    @Override
    public User registration(User user) {
        userValidator.validate(user);
        String securePassword = Encoder.getSecurePassword(user.getPassword());

        if (user.getRole() == Role.STUDENT){
            Student student = (Student) user;
            student = Student.update(student).setPassword(securePassword).build();
            return userRepository.save(student);
        }else {
            Admin admin = (Admin) user;
            admin = Admin.update(admin).setPassword(securePassword).build();
            return userRepository.save(admin);
        }

    }

    @Override
    public User login(String email, String password) {
        if (email == null || password == null){
            logger.error("In user login was generated exception");
            throw new InvalidLoginPassException("Wrong password or email");
        }

        return userRepository.findByEmail(email)
                .orElseThrow(() -> new InvalidLoginPassException("Wrong password or email"));
    }

    @Override
    public void update(User user) {
        userValidator.validate(user);
        String securePassword = Encoder.getSecurePassword(user.getPassword());

        if (user.getRole() == Role.STUDENT){
            Student student = (Student) user;
            student = Student.update(student).setPassword(securePassword).build();
            userRepository.update(student.getId(), student);
        }else {
            Admin admin = (Admin) user;
            admin = Admin.update(admin).setPassword(securePassword).build();
            userRepository.update(admin.getId(), admin);
        }

    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User showUser(User user) {
        return userRepository.findById(user.getId()).orElse(null);
    }


    @Override
    public List<Student> searchByBirthYear(int afterYear) {
        if (userRepository.getAll() == null){
            logger.error("list was empty in searchByYear");
            throw new IllegalArgumentException("List is null");
        }
        if (userRepository.getAll().size() == 0){
            throw new IllegalArgumentException("List is empty");
        }
        ArrayList<Student> filteredList = new ArrayList<>();

        for (User i : userRepository.getAll()){
            if (i.getRole() == Role.STUDENT){
                Student student = (Student) i;
                if (student.getBirthDate() != null && student.getBirthDate().getYear() - afterYear >= 0){
                    filteredList.add(student);
                }
            }

        }
        return new ArrayList<>(filteredList);
    }

    @Override
    public List<Student> searchByGroup(String nameOfGroup) {
        if (userRepository.getAll() == null || nameOfGroup == null){
            throw new IllegalArgumentException("Some of parameters are null");
        }
//        if (userRepository.getAll().size() == 0){
//            throw new IllegalArgumentException("List is empty");
//        }
        ArrayList<Student> filteredList = new ArrayList<>();

        for (User i : userRepository.getAll()){
            if (i.getRole() == Role.STUDENT){
                Student student = (Student) i;
                if (student.getGroup() != null && student.getGroup().getName().equals(nameOfGroup)){
                    filteredList.add(student);
                }
            }

        }
        return new ArrayList<>(filteredList);
    }

    @Override
    public List<User> showAll() {
        return new ArrayList<>(userRepository.getAll());
    }

    @Override
    public HashMap<Group, ArrayList<Student>> listsOfStudentByEachGroup() {
        if (userRepository.getAll() == null){
            throw new IllegalArgumentException("List is null");
        }
        if (userRepository.getAll().size() == 0){
            throw new IllegalArgumentException("List is empty");
        }
        ArrayList<Group> listOfGroup = new ArrayList<>();
        HashMap<Group, ArrayList<Student>> result = new HashMap<>();
        Group buffer = null;

        for (User i : userRepository.getAll()){
            if (i.getRole() == Role.STUDENT){
                Student student = (Student) i;
                if (student.getGroup() != null){
                    buffer = student.getGroup();
                    listOfGroup.add(buffer);
                    break;
                }
            }

        }

        for (User i : userRepository.getAll()){
            if (i.getRole() == Role.STUDENT){
                Student student = (Student) i;
                if (student.getGroup() != null && !student.getGroup().equals(buffer)){
                    buffer = student.getGroup();
                    listOfGroup.add(buffer);
                }
            }

        }

        for (Group i : listOfGroup){
            result.put(i, new ArrayList<>(searchByGroup(i.getName())));

        }

        return new HashMap<>(result);
    }

}
