package lesson11.staticp;

import java.lang.reflect.Method;

public class ProxyUserService {
    private final UserService userService;

    public ProxyUserService(UserService userService) {
        this.userService = userService;
    }

    public String findUserById(Long id) {
        return userService.findUserById(id);
    }


}
