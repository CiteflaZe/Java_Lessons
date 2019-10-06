package hometask10;

import java.util.Arrays;
import java.util.List;

public class LinkedList<E>{

    private int size;
    private Node<E> first;
    private Node<E> last;

    public LinkedList(){
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E element) {
        Node<E> l = last;
        Node<E> node = new Node<>(element, l, null);
        last = node;
        if (l == null){
            first = node;
        }
        else{
            l.next = node;
        }
        size++;
    }

    public E getByIndex(int index) {
        if(index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            if(node.next != null){
                node = node.next;
            }
        }
        return node.element;
    }

    public boolean remove(E element) {
        Node<E> currentNode = first;
        for (int i = 0; i < size; i++) {
            if (currentNode.element.equals(element)){
                if(last == currentNode && first != currentNode){
                    currentNode.previous.next = null;
                    currentNode.element = null;
                    currentNode.previous = null;
                    size--;
                    return true;
                }
                else if(first == currentNode && last != currentNode){
                    currentNode.next.previous = null;
                    currentNode.element = null;
                    currentNode.next = null;
                    size--;
                    return true;
                }
                else if(last == currentNode && first == currentNode){
                    currentNode.element = null;
                    size--;
                    return true;
                }
                else {
                    currentNode.previous.next = currentNode.next;
                    currentNode.next.previous = currentNode.previous;
                    currentNode.element = null;
                    currentNode.next = null;
                    currentNode.previous = null;
                    size--;
                    return true;
                }
            }
            if(currentNode.next != null){
                currentNode = currentNode.next;
            }
            else{
                return false;
            }
        }
        return false;
    }

    private static class Node<E>{
        E element;
        Node<E> next;
        Node<E> previous;

        Node(E element, Node<E> next, Node<E> previous){
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }

}
