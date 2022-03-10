package SuanFa.l1394;

import java.util.HashMap;
import java.util.Map;

public class l1394 {

    public int findLucky(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : arr) {
            m.put(num, m.getOrDefault(num, 0)+1);
        }
        int max = 0;
        for (int num : m.keySet()) {
            if (num == m.get(num)) {
                if (max < num) {
                    max = num;
                }
            }
        }
        return max;
    }
}
