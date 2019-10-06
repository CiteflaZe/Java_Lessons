package consoleAplication.service;

import org.springframework.stereotype.Component;


public interface InputCheck {
    void email(String email);
    void password(String password);
}
