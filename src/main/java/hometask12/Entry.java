package hometask12;

import java.util.Objects;

public class Entry<K, V> {
    final K key;
    V value;
    Entry<K, V> next;

    public Entry(K key, V value, Entry<K, V> next) {
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

    public Entry<K, V> withValue(V value) {
        this.value = value;
        return this;
    }

    public Entry<K, V> getNext() {
        return next;
    }

    public Entry<K, V> withNext(Entry<K, V> next) {
        this.next = next;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Entry<?, ?> entry = (Entry<?, ?>) o;
        return Objects.equals(key, entry.key) &&
                Objects.equals(value, entry.value) &&
                Objects.equals(next, entry.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, next);
    }
}
