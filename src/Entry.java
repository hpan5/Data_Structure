public class Entry<K, V> {
    final K key;
    V value;
    Entry<K, V> next;

    private boolean equals(Object o) {

    }

    private K getKey() {

    }

    private V getValue() {

    }

    private int hashCode() {

    }
    /*
    * Replaces the value corresponding to this entry with the specified value (optional operation).
    * (Writes through to the map.)
    * The behavior of this call is undefined if the mapping has already been removed from the map
    * (by the iterator's remove operation).
    * @Param: new value to be stored in this entry
    * @Return: old value corresponding to the entry
    * */
    private V setValue(V value) {
        V oldValue = this.value;
        this.value = value;
        return oldValue;
    }
}
//practice class p 178