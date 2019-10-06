package hometask9;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User(new Address("City", 11), "Name", "Surname");
        User user2 = (User) user.clone();

        System.out.println(user2 == user);
        System.out.println(user.equals(user2));
    }
}
