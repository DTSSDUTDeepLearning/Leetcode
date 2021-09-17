package SuanFa.l525;

import java.util.HashMap;
import java.util.Map;

public class l525 {

    public int findMaxLength(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return 0;
        }
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        int sum = 0;
        int max = 0;
        for (int i = 0;i < len;i++) {
            sum += nums[i]==0?-1:1;
            if (m.containsKey(sum)) {
                max = Math.max(i-m.get(sum), max);
            }
            else {
                m.put(sum, i);
            }
        }
        return max;
    }
}
