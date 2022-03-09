package SuanFa.l1296;

import java.util.TreeMap;

public class l1296 {

    public boolean isPossibleDivide(int[] nums, int k) {
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for (int num : nums) {
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
            for (int i = min; i < min + k; i++) {
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
