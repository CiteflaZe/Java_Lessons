package lesson10.example1;

public class Container {
    private Object object;

    public Container(){

    }

    public Container(Object obj){
        this.object = obj;
    }

    public Object getObject() {
        return object;
    }

    public Container withObject(Object object) {
        this.object = object;
        return this;
    }
}
