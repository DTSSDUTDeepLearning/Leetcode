package SuanFa.l705;

public class MyHashSet {

    private boolean[] hastset;

    /** Initialize your data structure here. */
    public MyHashSet() {
        hastset = new boolean[(int)Math.pow(10.0, 6.0)+1];
    }

    public void add(int key) {
        hastset[key] = true;
    }

    public void remove(int key) {
        hastset[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return hastset[key];
    }

}
