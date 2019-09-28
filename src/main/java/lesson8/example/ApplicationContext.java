package lesson8.example;

import lesson8.example.model.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public final class ApplicationContext {
    public static final UserRepository USER_REPOSITORY = new UserRepositoryImpl();
    public static final UserService USER_SERVICE = new UserServiceImpl(USER_REPOSITORY);
    
    public final Map<String, Object> stringObjectMap = new HashMap<>();
    
    public void run() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        //scan packages
        List<Class> classes = Arrays.asList(User.class, UserRepositoryImpl.class, UserServiceImpl.class, UserRepository.class, UserService.class);
        
        List<Class> component = new ArrayList<>();

        for (int i = 0; i < classes.size(); i++) {
            Class clazz = classes.get(i);
            if (clazz.isAnnotationPresent(Component.class)){
                component.add(clazz);
            }
        }
        //analise
        stringObjectMap.put("UserRepositoryImpl", new UserRepositoryImpl());

        Class<UserServiceImpl> userServiceClass = UserServiceImpl.class;
        Constructor<?>[] declaredConstructors = userServiceClass.getDeclaredConstructors();
        //if @Inject
        Constructor<?> constructor = declaredConstructors[0];

        //public UserServiceImpl(UserRepository userRepository)
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        //foreach item in stringObjectMap -> item.getValue() instanceof parameterTypes[i]
//        constructor.newInstance() from stringObjectMap
        Object userRepositoryImpl = constructor.newInstance(stringObjectMap.get("UserRepositoryImpl"));

        stringObjectMap.put("UserServiceImpl", userRepositoryImpl);



    }

}
