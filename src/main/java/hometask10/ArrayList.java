package hometask10;

import java.util.Arrays;

public class ArrayList<E>{
    private static final int DEFAULT_CAP = 16;

    private Object[] elements;
    private int size;
    private int capacity;

    public ArrayList(){
        this.size = 0;
        this.capacity = DEFAULT_CAP;
        this.elements = new Object[this.capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(E element) {
        if(size >= capacity){
            increaseCapacity();
        }
        elements[size] = element;
        size++;
        return true;
    }

    public E getByIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }

    public boolean remove(E element) {
        if(element == null){
            for (int i = 0; i < size; i++) {
                if(elements[i] == null){
                    if (size - 1 - i > 0) {
                        System.arraycopy(elements, i + 1, elements, i, size - 1 - i);
                    }
                    elements[--size] = null;
                    if(size < capacity-DEFAULT_CAP){
                        decreaseCapacity();
                    }
                    return true;
                }
            }
        }
        else{
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(element)) {
                    if (size - 1 - i > 0) {
                        System.arraycopy(elements, i + 1, elements, i, size - 1 - i);
                    }
                    elements[--size] = null;
                    if(size < capacity-DEFAULT_CAP){
                        decreaseCapacity();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void increaseCapacity(){
        capacity += DEFAULT_CAP;
        Object[] buff = elements;
        elements = new Object[capacity];
        System.arraycopy(buff, 0, elements, 0, buff.length);
    }

    private void decreaseCapacity(){
        capacity -= DEFAULT_CAP;
        Object[] buff = elements;
        elements = new Object[capacity];
        System.arraycopy(buff, 0, elements, 0, capacity);
    }

    public String showAll(){
        return Arrays.toString(Arrays.copyOf(elements, size));
    }
}
