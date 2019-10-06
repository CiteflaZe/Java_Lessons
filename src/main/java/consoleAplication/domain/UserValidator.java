package consoleAplication.domain;

import consoleAplication.service.InputCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserValidator {
    private final InputCheck inputCheck;

    @Autowired
    public UserValidator(InputCheck inputCheck) {
        this.inputCheck = inputCheck;
    }

    public void validate(User user){
        if (user == null){
           throw new InvalidUserException("User is null");
        }

        if (user.getRole() != null && user.getRole() == Role.STUDENT){
            Student student = (Student) user;
            if (student.getBirthDate() == null ||
            student.getGroup() == null ||
            student.getAddress() == null ||
            student.getEmail() == null ||
            student.getName() == null ||
            student.getPassword() == null ||
            student.getPhoneNumber() == null ||
            student.getSurName() == null){
                throw new InvalidUserException("You must fill all fields");
            }else {
                inputCheck.email(student.getEmail());
                inputCheck.password(student.getPassword());
            }
        }else if (user.getRole() != null ||
        user.getEmail() == null ||
        user.getId() == null ||
        user.getName() == null ||
        user.getPassword() == null ||
        user.getSurName() == null){
            throw new InvalidUserException("You must fill all fields");
        }else {
            inputCheck.email(user.getEmail());
            inputCheck.password(user.getPassword());
        }
    }
}
