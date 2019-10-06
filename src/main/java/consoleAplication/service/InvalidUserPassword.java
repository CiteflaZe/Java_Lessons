package consoleAplication.service;

public class InvalidUserPassword extends RuntimeException {
    public InvalidUserPassword(String message) {
        super(message);
    }
}
