package project;

import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

@Component
public class Menu {
    public static ResourceBundle bundle = ResourceBundle.getBundle("text");

    public static Locale locale_en = new Locale("en", "US");
    public static Locale locale_ru = new Locale("ru", "RU");

    private Scanner scanner = new Scanner(System.in);
    private String input;

    public void run(){
        System.out.println("Welcome (Добро пожаловать)");
        System.out.println("Please choose language (Пожалуйста выберите язык)");
        System.out.println("Type in the number (Введите число)");
        System.out.println("1 - English (Английский)");
        System.out.println("2 - Russian (Русский)");
        System.out.println("3 - Exit (Выход)");

        while(true){
            input = scanner.nextLine();
            switch (input){
                case "1":{
                    bundle = ResourceBundle.getBundle("text", locale_en);
                    mainMenu();
                    break;
                }
                case "2":{
                    bundle = ResourceBundle.getBundle("text", locale_ru);
                    mainMenu();
                    break;
                }
                case "3":{
                    System.exit(1);
                }
                default:{
                    System.out.println("No such option available");
                }
            }
        }


    }

    private void mainMenu(){
        System.out.println(bundle.getString("mainMenu.intro"));
    }

    private void languageSelection(){
        //TODO: function for language selection
    }


}
