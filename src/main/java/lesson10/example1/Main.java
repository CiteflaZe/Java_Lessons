package lesson10.example1;

public class Main {

    public static void main(String[] args) {
        Container container1 = new Container("String");
        Container container2 = new Container(1);

        Object object1 = container1.getObject();
        if(object1 instanceof String){
            String strObject = (String) object1;
        }

        Object object2 = container2.getObject();
        if(object2 instanceof Integer){
            Integer integerObject = (Integer) object2;
        }

        GenericContainer<String> genericContainerString = new GenericContainer<>("String");
        GenericContainer<Integer> genericContainerInteger = new GenericContainer<>(1);

        String object = genericContainerString.getObject();
//        Поискать разницу между этими двумя строками (док как вариант)
        GenericContainer<Object> genericContainer1 = new GenericContainer<>(1);
        GenericContainer genericContainer2 = new GenericContainer(1);

//        System.out.println(genericContainerString.getClass() == genericContainerInteger.getClass());

        System.out.println(genericContainer1.getObject().getClass() == genericContainer2.getObject().getClass());
    }

}
