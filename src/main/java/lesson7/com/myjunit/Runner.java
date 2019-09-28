package lesson7.com.myjunit;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Runner {

    private Runner() {
    }

    public static void run() throws InvocationTargetException, IllegalAccessException {
        TestClass testClass = new TestClass();
        Class<?> clazz = testClass.getClass();
        Method[] methods = clazz.getMethods();
        int counter = 0;

        List<Method> beforeClassMethods = getMethodsByAnnotation(methods, BeforeClass.class);
        List<Method> afterClassMethods = getMethodsByAnnotation(methods, AfterClass.class);
        List<Method> testMethods = getMethodsByAnnotation(methods, Test.class);
        List<Method> beforeMethods = getMethodsByAnnotation(methods, Before.class);
        List<Method> afterMethods = getMethodsByAnnotation(methods, After.class);

        invokeMethods(beforeClassMethods, null);
        invokeTestMethods(testMethods, beforeMethods, afterMethods, testClass);
        invokeMethods(afterClassMethods, null);
        invokeMethods(beforeMethods, testClass);
        invokeMethods(afterMethods, testClass);

//        for (Method method :
//                methods) {
//            if(method.isAnnotationPresent(Test.class)){
//                method.invoke(testClass);
//                counter++;
//            }
//        }
//        System.out.println(counter);
    }

    private static void invokeMethods(List<Method> classMethods, Object object) throws InvocationTargetException, IllegalAccessException {
        for (Method method :
                classMethods) {
            method.invoke(object);
        }
    }

    private static void invokeTestMethods(List<Method> testClassMethods, List<Method> afterClassMethods, List<Method> beforeClassMethods, Object object) throws InvocationTargetException, IllegalAccessException {
        for (Method method :
                testClassMethods) {
            invokeMethods(beforeClassMethods, object);
            method.invoke(method);
            invokeMethods(afterClassMethods, object);
        }
    }

    private static List<Method> getMethodsByAnnotation(Method[] methods, Class<? extends Annotation> clazz) {
        List<Method> resultMethods = new ArrayList<>();
        for (Method method:
             methods) {
            if(method.isAnnotationPresent(clazz)){
                resultMethods.add(method);
            }
        }
        return resultMethods;
    }
}

class Main{
    public static void main(String[] args) throws Exception {
        Runner.run();
    }
}
