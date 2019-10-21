package hometask13.json;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UserWithJson {

    public User jsonToUser(String path){
        try {
            FileReader reader = new FileReader(path);
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(reader);
            return new User((String) obj.get("name"),
                    (String) obj.get("surname"),
                    Integer.valueOf(obj.get("age").toString()),
                    (String) obj.get("phoneNumber"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (ParseException e) {
            System.out.println("Error while parsing");
        } catch (IOException e) {
            System.out.println("Error");
        }
        return null;
    }

    public void userToJson(User user) throws IOException {
        JSONObject obj = new JSONObject();
        obj.put("name", user.getName());
        obj.put("surname", user.getSurname());
        obj.put("age", user.getAge());
        obj.put("phoneNumber", user.getPhoneNumber());
        Files.write(Paths.get("E:\\Epam_Java\\epam-project-test\\src\\main\\java\\hometask13\\json\\out.json"), obj.toJSONString().getBytes());
        System.out.println("JSON Object: " + obj);
    }
}
