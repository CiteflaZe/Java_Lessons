package hometask3;

public class Main {

    public static void main(String[] args) {
         User user = User.builder()
                 .withName("Name")
                 .withSurname("Surname")
                 .withEmail(null)
                 .withPassword("Pass")
                 .withCode(11)
                 .build();

    }

}
