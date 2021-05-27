public class MyHashMap<K,V> {
    /*
     * The default initial capacity - MUST be a power of two.
     */
    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
    /*
    * The maximum capacity, used if a higher value is implicitly specified
    * by either of the constructors with arguments.
    * MUST be a power of two <= 1 << 30.
    * */
    /*
    * hashmap use key.hashCode() to determine the entry index for the key
    * key.equals() to determine whether two keys are the same
    * */
    static final int MAXIMUM_CAPACITY = 1 << 30;
    static final float load_factor = 0.75f;
    int CAPACITY;
    public HashMap() {
        load_factor = 0.75;
    }
}

class Coordinate {
    int x;
    int y;
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        // if reference is the same
        if (this == obj) {
            return true;
        }
        //if same instance
        if (!(obj instanceof Coordinate) {
            return false;
        }
        //check if the expected content are the same
        Coordinate another = (Coordinate) obj;
        return this.x == another.x && this.y == another.y;
    }

    @Override
    public int hashCode() {
        return x * 101 + y;
    }


}
/*
* override,
*
* */