package lesson5.solid;

public interface Services {
    //UserService
    void register(User user);

    void login(String password, String name);

    //MessageService
    void sendMessage(Message message);

    //HelpService
    String getCounties();
}
