package SuanFaPlus.l170;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    Map<Integer, Integer> m;

    public TwoSum() {
        m = new HashMap<>();
    }

    public void add(int number) {
        m.put(number, m.getOrDefault(number, 0)+1);
    }

    public boolean find(int value) {
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            int key = entry.getKey();
            if (value - key != key) {
                if (m.containsKey(value - key)) {
                    return true;
                }
            }
            else {
                if (m.get(key) > 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
