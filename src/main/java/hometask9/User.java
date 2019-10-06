package hometask9;

import java.util.Objects;

public class User implements Cloneable{
    private Address address;
    private String name;
    private String surname;

    public User(Address address, String name, String surname) {
        this.address = address;
        this.name = name;
        this.surname = surname;
    }

    private User(User user) throws CloneNotSupportedException {
        if(user != null){
            this.address = user.address.clone();
            this.name = user.name;
            this.surname = user.surname;
        }
    }
//
//    public User clone(){
//        return new User(this);
//    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return new User(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        User user = (User) o;
        return Objects.equals(address, user.address) &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, name, surname);
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
