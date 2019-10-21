package hometask13.json;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        UserWithJson util = new UserWithJson();

        User user = util.jsonToUser("E:\\Epam_Java\\epam-project-test\\src\\main\\java\\hometask13\\json\\user.json");
        User user2 = new User("Charley", "Snake", 23, "000-44-11-33");

        try {
            util.userToJson(user2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Using Gson
        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("E:\\Epam_Java\\epam-project-test\\src\\main\\java\\hometask13\\json\\user.json");
            User userFromJson = gson.fromJson(reader, User.class);
            System.out.println(userFromJson);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (FileWriter fileWriter = new FileWriter("E:\\Epam_Java\\epam-project-test\\src\\main\\java\\hometask13\\json\\out.json")){
            fileWriter.write(gson.toJson(user2));

        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
