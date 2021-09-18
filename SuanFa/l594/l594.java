package SuanFa.l594;

import java.util.HashMap;
import java.util.Map;

public class l594 {

    public int findLHS(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        int result = 0;
        for (int num : nums) {
            int now = m.getOrDefault(num, 0) + 1;
            m.put(num, now);
            if (m.containsKey(num-1)) {
                result = Math.max(result, now + m.get(num-1));
            }
            if (m.containsKey(num+1)) {
                result = Math.max(result, now + m.get(num+1));
            }
        }
        return result;
    }
}
