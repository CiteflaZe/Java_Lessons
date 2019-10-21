package hometask12;

import java.util.Collection;
import java.util.Objects;
import java.util.Set;

public class HashMap<K, V> implements Map<K, V> {
    private static float DEFAULT_LOAD_FACTOR = 0.8f;
    private final int DEFAULT_CAPACITY = 16;
    private int size;
    private float loadFactor;

    public HashMap(){

    }

    static class Node<K, V> implements java.util.Map.Entry<K, V> {
        final int hash;
        final K key;
        V value;
        Node<K, V> next;



        public Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        public final V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        @Override
        public final boolean equals(Object o) {
            if (this == o) {return true;}
            if (o == null || getClass() != o.getClass()) {
                return false;}
            Node<?, ?> node = (Node<?, ?>) o;
            return hash == node.hash &&
                    Objects.equals(key, node.key) &&
                    Objects.equals(value, node.value) &&
                    Objects.equals(next, node.next);
        }
    }

    @Override
    public V put(K key, V value) {

        size++;
        return value;
    }

    @Override
    public V getByKey(K key) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<K> keys() {
        return null;
    }
}
