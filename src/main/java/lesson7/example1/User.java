package lesson7.example1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class User implements Comparable<User> {
    public static ArrayList<User> users = new ArrayList<>();


    public static final Comparator<User> USER_COMPARATOR_BY_AGE =
            (user1, user2) -> user1.getAge() - user2.getAge();
    public static final Comparator<User> USER_COMPARATOR_BY_NAME = (user1, user2) -> {
        if (user1.getName().length() == user2.getName().length()) {
            for (int i = 0; i < Math.min(user1.getName().length(), user2.getName().length()); i++) {
                if (user1.getName().toCharArray()[i] - user2.getName().toCharArray()[i] != 0) {
                    return user1.getName().toCharArray()[i] - user2.getName().toCharArray()[i];
                }
            }
        }
        return user1.getName().length() - user2.getName().length();
//        return user1.getName().compareTo(user2.getName());
    };
    public static final Comparator<User> USER_COMPARATOR_BY_SURNAME = (user1, user2) -> {
        if (user1.getSurname().length() == user2.getSurname().length()) {
            for (int i = 0; i < Math.min(user1.getSurname().length(), user2.getSurname().length()); i++) {
                if (user1.getSurname().toCharArray()[i] - user2.getSurname().toCharArray()[i] != 0) {
                    return user1.getSurname().toCharArray()[i] - user2.getSurname().toCharArray()[i];
                }
            }
        }
        return user1.getSurname().length() - user2.getSurname().length();
//        return user1.getSurname().compareTo(user2.getSurname());
    };

    private String name;
    private String surname;
    private int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        users.add(this);
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

    @Override
    public int compareTo(User o) {
        if (Objects.isNull(o)) {
            throw new NullPointerException();
        }
        if (USER_COMPARATOR_BY_SURNAME.compare(this, o) == 0) {
        }

        return this.age - o.age;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

final class Utility {
    private Utility() {
    }

    public static void swap(User[] users, int i, int j) {
        if (User.USER_COMPARATOR_BY_SURNAME.compare(users[i], users[j]) == 0) {
            if (User.USER_COMPARATOR_BY_NAME.compare(users[i], users[j]) == 0) {
                if (User.USER_COMPARATOR_BY_AGE.compare(users[i], users[j]) > 0) {
                    swapWith(users, i, j);
                }
            } else if (User.USER_COMPARATOR_BY_NAME.compare(users[i], users[j]) > 0) {
                swapWith(users, i, j);
            }
        }else if(User.USER_COMPARATOR_BY_SURNAME.compare(users[i], users[j]) > 0){
            swapWith(users, i, j);
        }
    }

    private static void swapWith(User[] users, int i, int j) {
        User buffer = users[i];
        users[i] = users[j];
        users[j] = buffer;
    }
}
