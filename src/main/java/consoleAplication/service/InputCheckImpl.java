package consoleAplication.service;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class InputCheckImpl implements InputCheck {
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    private static final Pattern VALID_EMAIL_PASSWORD_REGEX =
            Pattern.compile("[0-9a-zA-Z]{6,}", Pattern.CASE_INSENSITIVE);

    @Override
    public void email(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
        if (!matcher.find()){
            throw new InvalidUserEmail("Incorrect User email");
        }
    }

    @Override
    public void password(String password) {
        Matcher matcher = VALID_EMAIL_PASSWORD_REGEX .matcher(password);
        if (!matcher.find()){
            throw new InvalidUserPassword("Incorrect User password");
        }
    }
}
