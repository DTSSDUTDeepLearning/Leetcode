package SuanFa.l706;

public class MyHashMap {

    private boolean[] exists;
    private int[] numbers;

    /** Initialize your data structure here. */
    public MyHashMap() {
        exists = new boolean[(int)Math.pow(10.0, 6.0)+1];
        numbers = new int[(int)Math.pow(10.0, 6.0)+1];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        exists[key] = true;
        numbers[key] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if (exists[key]) {
            return numbers[key];
        }
        else {
            return -1;
        }
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        exists[key] = false;
    }
}
