package hometask4.remake;

import hometask4.remake.domain.Student;
import hometask4.remake.repository.StudentRepositoryImpl;
import hometask4.remake.service.StudentServiceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private static Map<String, String> usernameToPassword = new HashMap<>();

    Scanner sc = new Scanner(System.in);
    StudentServiceImpl ssi = new StudentServiceImpl(new StudentRepositoryImpl());
    Student student1 = Student.builder().withId(1L).build();
    Student student2 = Student.builder().withId(2L).build();
    Student student3 = Student.builder().withId(3L).build();
    Student student4 = Student.builder().withId(4L).build();

    public Menu(){
        usernameToPassword.put("admin", "admin");
        usernameToPassword.put("Student", "Student");
        usernameToPassword.put("", "");
    }

    public void run() {
        System.out.println("Welcome!");
        System.out.println("Please sign in into system:");
        System.out.println("Type username:");
        String username = sc.nextLine();
        System.out.println("Type password");
        String pass = sc.nextLine();
        if(usernameToPassword.containsKey(username) && usernameToPassword.get(username).equals(pass)){
            menuForAdmin();
        }

    }



    private void menuForAdmin(){
        System.out.println("Admin Menu");
    }

    private void menuForStudent(){
        System.out.println("Student Menu");
    }

    private void menuForGuest(){
        System.out.println("Guest Menu");
    }

}
