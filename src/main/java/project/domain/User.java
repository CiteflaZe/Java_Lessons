package project.domain;

public abstract class User {
    private final String email;
    private final String name;
    private final String password;
    private final String phoneNumber;

    public User(String email, String name, String password, String phoneNumber) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
}
