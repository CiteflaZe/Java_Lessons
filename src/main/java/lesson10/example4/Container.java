package lesson10.example4;

public class Container<T extends Number> {
    private final T[] items;

    public Container(T... items) {
        this.items = items;
    }

    public double averageValue() {
        double result = 0;
        for (T i :
                items) {
            result += i.doubleValue();
        }
        return result/items.length;
    }

    //
    public boolean isEquals(Container<? extends Number> container){
        return (int)this.averageValue() - (int)container.averageValue() == 0;
    }

}
