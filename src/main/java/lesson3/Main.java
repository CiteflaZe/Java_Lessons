package lesson3;

import lesson3.inheritance.User;
import lesson3.singleton.Singleton1;

public class Main {

    public static void main(String[] args) {

        User user = User.builder()
                .withName("Ivan")
                .withSurname("Ivanov")
                .build();

        Singleton1.SINGLETON_1.method();

    }

}
