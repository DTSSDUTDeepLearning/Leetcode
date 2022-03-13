package SuanFa.l1512;

import java.util.HashMap;
import java.util.Map;

public class l1512 {

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : nums) {
            m.put(num, m.getOrDefault(num, 0)+1);
        }
        int sum = 0;
        for (int n : m.values()) {
            sum += n*(n-1)/2;
        }
        return sum;
    }
}
