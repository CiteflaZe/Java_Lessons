package hometask11;

import hometask11.http.Response;
import hometask11.service.UserService;
import hometask11.service.UserServiceImpl;

import java.lang.reflect.Method;

public class ConsoleApplication {
    public static void main(String[] args)throws Throwable {
        ExceptionHandler exceptionHandler = new ExceptionHandler();

        UserService userService = new UserServiceImpl();
        Class<? extends UserService> clazz = userService.getClass();
        Method method = clazz.getMethod("findById", Long.class);


        Response response = exceptionHandler.invoke(userService, method, new Object[]{2L});
        System.out.println(response);
    }
}
