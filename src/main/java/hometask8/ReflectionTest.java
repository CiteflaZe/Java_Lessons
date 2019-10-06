package hometask8;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionTest {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        int[] a = {4, 3, 5, 2};
        int[] sub = {11, 21, 52, 55, 71, 2, 3};
        FieldsTest fieldsTest = new FieldsTest(1, 2, 3);
        Class<?> fieldsTestClass = fieldsTest.getClass();
        Field[] fields = fieldsTestClass.getFields();

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);


        Field field1 = fieldsTestClass.getDeclaredField("arg1");
        Field field2 = fieldsTestClass.getDeclaredField("arg2");
        Field field3 = fieldsTestClass.getDeclaredField("ARG3");
        Field field4 = fieldsTestClass.getDeclaredField("ARG4");
        Field field5 = fieldsTestClass.getDeclaredField("ARG5");
        Field field6 = fieldsTestClass.getDeclaredField("arg6");
        Field arrayFiled2 = fieldsTestClass.getDeclaredField("arr1");
        Object[] enumConstants = fieldsTestClass.getEnumConstants();

        System.out.println();


//        System.out.println("Private field");
//        field1.setAccessible(true);
//        System.out.println(field1.getInt(fieldsTest));
//        field1.setInt(fieldsTest, 11);
//        System.out.println(field1.getInt(fieldsTest));
//        System.out.println(fieldsTest.getArg1());
//
//        System.out.println("Public field");
//        System.out.println(field2.getInt(fieldsTest));
//        field2.setInt(fieldsTest, 12);
//        System.out.println(field2.getInt(fieldsTest));
//        System.out.println(fieldsTest.arg2);
//
//        System.out.println("Final field");
//        field3.setAccessible(true);
//        System.out.println(field3.getInt(fieldsTest));
//        field3.setInt(fieldsTest, 13);
//        System.out.println(field3.getInt(fieldsTest));
//        System.out.println(fieldsTest.getARG3());
//
//        System.out.println("Initialized by default final field");
//        modifiersField.setInt(field4, field4.getModifiers() & ~Modifier.FINAL);
//        field4.setAccessible(true);
//        System.out.println(field4.get(fieldsTest));
//        field4.set(fieldsTest, 14);
//        System.out.println(field4.get(fieldsTest));
//        System.out.println(fieldsTest.ARG4);
//
//        System.out.println("Static field");
//        System.out.println(field6.getInt(null));
//        field6.setInt(null, 54);
//        System.out.println(field6.getInt(null));
//        System.out.println(FieldsTest.arg6);
//
//        System.out.println("Static final field");
//        modifiersField.setInt(field5, field5.getModifiers() & ~Modifier.FINAL);
//        System.out.println(field5.get(null));
//        field5.set(null, 23);
//        System.out.println(field5.get(null));
//        System.out.println(FieldsTest.ARG5);
//
//
//
//        System.out.println("Static array field");
//        modifiersField.setInt(arrayFiled2, arrayFiled2.getModifiers() & ~Modifier.FINAL);
//        System.out.println(Arrays.toString((int[])arrayFiled2.get(null)));
////        arrayFiled2.set(fieldsTest, sub);
//        arrayFiled2.set(null, Arrays.copyOf((int[]) arrayFiled2.get(null), 6));
//        System.out.println(Arrays.toString((int[])arrayFiled2.get(null)));
//        System.out.println(Arrays.toString(FieldsTest.arr1));

//        for (Field f :
//                fields) {
//
//        }
    }
}
