package SuanFa.l846;

import java.util.TreeMap;

public class l846 {

    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for (int num : hand) {
//            m.put(num, m.getOrDefault(num, 0) + 1); 需要60ms
            if (m.containsKey(num)) {
                m.replace(num, m.get(num) + 1);
            }
            else {
                m.put(num, 1);
            }
            // 只需50ms
        }
        while (!m.isEmpty()) {
            int min = m.firstKey();
            for (int i = min;i < min + groupSize;i++) {
                if (!m.containsKey(i)) {
                    return false;
                }
                else {
                    int count_i = m.get(i);
                    if (count_i == 1) {
                        m.remove(i);
                    }
                    else {
                        m.replace(i, count_i-1);
                    }
                }
            }
        }
        return true;
    }
}
