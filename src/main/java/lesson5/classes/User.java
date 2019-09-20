package lesson5.classes;

public class User {
    private String name;
    private String surname;
    static {
        System.out.println("User");
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static class Address{
        private int code;
        static {
            System.out.println("Address");
        }

        public Address(int code) {
            this.code = code;
        }
    }

}
