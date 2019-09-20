package lesson5.inner_classes;

public class User {
    private static final String CODE;
    private String name;
    private String surname;
    static {
        CODE = "CODE_OUTER";
        System.out.println("User");
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println(Address.CODE_INNER);
        new Address(100).addressMethod();
        Address.addressStaticMethod();
    }

    private void userMethod(){
        System.out.println("User Method");
    }

    private static void userStaticMethod(){
        System.out.println("User Static Method");
    }

    public static class Address{
        private static final String CODE_INNER;
        private int code;
        static {
            CODE_INNER = "CODE_INNER";
            System.out.println("Address");
        }

        public Address(int code) {
            this.code = code;
            System.out.println(CODE);
            new User("", "").userMethod();
            userStaticMethod();
        }

        private void addressMethod(){
            System.out.println("address method");
        }

        private static void addressStaticMethod(){
            System.out.println("address static method");
        }

    }



}
