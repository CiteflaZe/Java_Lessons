package secondLesson;

import java.util.Objects;

public class User {
    private String name;
    private String surname;
    private int age;
    private boolean active;

    public User(String name, String surname, int age, boolean active) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }

        if (o == null || getClass() != o.getClass()){
            return false;
        }

        User user = (User) o;

        if (age != user.age){
            return false;
        }

        if (active != user.active){
            return false;
        }

        if (!name.equals(user.name)){
            return false;
        }

        if (!surname.equals(user.surname)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 *  hash + (int) age;
        hash = 31 *  hash + (name == null ? 0 : name.hashCode());
        hash = 31 *  hash + (surname == null ? 0 : surname.hashCode());
        hash = 31 *  hash + (active ? 1: 0);;
        return hash;
    }
}
