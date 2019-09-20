package lesson3.abstractclass;

public interface ShapeInterface {

    public static final String NAME = "";

    public abstract int getPerimeter();

    public default void printName(String name){
        System.out.println(name);
    }

    public static int calc(){
        return 0;
    }
}
