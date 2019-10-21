package consoleAplication.service;

import consoleAplication.domain.*;
import consoleAplication.repository.UserRepositoryImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.ArrayList;
import java.util.Optional;

import static org.mockito.Mockito.*;


public class StudentServiceImplTest {

    @Test
    public void shouldReturnSameUser() {
        final UserRepositoryImpl userRepository = mock(UserRepositoryImpl.class);
        final UserValidator userValidator = mock(UserValidator.class);
        StudentServiceImpl studentService = new StudentServiceImpl(userRepository, userValidator);
        Student student = Student.builder().setRole(Role.STUDENT).setEmail("1").build();
        Optional<Student> student1 = Optional.of(student);
        studentService.showUser(student);
        System.out.println(userRepository.findById(student.getId()));
        doReturn(student1).when(userRepository).findById(student.getId());
    }

}