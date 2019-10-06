package project.service;

import lesson8.example.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import project.domain.Student;

import java.util.List;

@Component
public class StudentServiceImpl implements StudentService {
//    private final UserRepository userRepository;
//    private final UserValidator userValidator;
//    private final PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public StudentServiceImpl(UserRepository userRepository, UserValidator userValidator, PasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.userValidator = userValidator;
//        this.passwordEncoder = passwordEncoder;
//    }

    @Override
    public Student register(Student student) {
        return null;
    }

    @Override
    public Student login(String email, String password) {
        return null;
    }

    @Override
    public List<Student> showAll() {
        return null;
    }
}
