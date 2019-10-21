public interface B<V extends Throwable> {
    default void method(){
        System.out.println("SS");
    }
}
