package SuanFa.l1695;

import java.util.HashMap;
import java.util.Map;

public class l1695 {

    public int maximumUniqueSubarray(int[] nums) {
        int len = nums.length;
        int last = -1;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(nums[0], 0);
        int[] pre = new int[len+1];
        pre[0] = nums[0];
        pre[len] = 0;
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < len; i++) {
            pre[i] = pre[i-1] + nums[i];
            if (m.containsKey(nums[i])) {
                last = Math.max(m.get(nums[i]), last);
            }
            m.put(nums[i], i);
            sum = last == -1 ? pre[i] : pre[i] - pre[last];
            max = Math.max(max, sum);
        }
        return max;
    }
}
