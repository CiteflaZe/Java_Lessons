package consoleAplication.service;

public class InvalidUserEmail extends RuntimeException {
    public InvalidUserEmail(String message) {
        super(message);
    }
}
