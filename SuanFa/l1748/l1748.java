package SuanFa.l1748;

import java.util.HashMap;
import java.util.Map;

public class l1748 {

    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : nums) {
            m.put(num, m.getOrDefault(num, 0)+1);
        }
        int sum = 0;
        for (int n : m.keySet()) {
            if (m.get(n) == 1) {
                sum+=n;
            }
        }
        return sum;
    }
}
