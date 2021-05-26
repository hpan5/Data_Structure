public class Entry<K, V> {
    final K key;
    V value;
    Entry<K, V> next; //
    final hashCode = 0.75;
/*
* @*/
    Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    private boolean equals(Object o) {
        if (o instanceof K) {
            if (o.equals(this)) {
                return true;
            }
        }
        return false;
    }

    private K getKey() {
        return key;
    }

    private V getValue() {
        return value;
    }

    private int hashCode() {
        return hashCode;
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