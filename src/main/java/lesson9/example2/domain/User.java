package lesson9.example2.domain;

public class User {
    private final Address address;

    public User(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
