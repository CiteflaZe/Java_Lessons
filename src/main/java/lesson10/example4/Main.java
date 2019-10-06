package lesson10.example4;

public class Main {

    public static void main(String[] args) {
//        Container<String> container;
        Container<Integer> integerContainer = new Container<>(1, 2, 3);
        Container<Double> doubleContainer = new Container<>(1D, 2D, 3D);

        System.out.println(doubleContainer.isEquals(integerContainer));



    }

}
