package lesson7.example1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[9];
        UserSort userSort = new UserSort();
        users[0] = new User("6", "A", 8);
        users[1] = new User("8", "B", 2);
        users[2] = new User("1", "S", 3);

        users[3] = new User("6", "A", 4);
        users[4] = new User("5", "A", 5);
        users[5] = new User("4", "D", 6);

        users[6] = new User("3", "C", 7);
        users[7] = new User("2", "T", 8);
        users[8] = new User("1", "A", 1);

        for (User u :
                users) {
            System.out.println(u);
        }

        User[] users1 = userSort.bubbleSort(users);
        System.out.println("");

        for (User u :
                users1) {
            System.out.println(u);
        }
        User.users.sort(User.USER_COMPARATOR_BY_SURNAME);

    }
}
