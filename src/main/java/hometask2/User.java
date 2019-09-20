package hometask2;

public final class User {

    private final String name;
    private final String surname;
    private final int age;
    private final boolean active;

    private Address address;

    public User(String name, String surname, int age, boolean active){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }

    public Address getAddress() {
        return address;
    }
}
