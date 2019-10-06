package consoleAplication.service;

public class InvalidLoginPassException extends RuntimeException {
    public InvalidLoginPassException(String message) {
        super(message);
    }
}
