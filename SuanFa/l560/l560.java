package SuanFa.l560;

import java.util.HashMap;
import java.util.Map;

public class l560 {

    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        int pre = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);
        for (int num : nums) {
            pre+=num;
            if (m.containsKey(pre-k)) {
                cnt+=m.get(pre-k);
            }
            m.put(pre, m.getOrDefault(pre, 0)+1);
        }
        return cnt;
    }
}
