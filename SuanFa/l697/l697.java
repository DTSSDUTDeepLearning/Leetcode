package SuanFa.l697;

import java.util.HashMap;
import java.util.Map;

public class l697 {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> num_cnt = new HashMap<>();
        Map<Integer, Integer> num_first = new HashMap<>();
        Map<Integer, Integer> num_last = new HashMap<>();
        int len = nums.length;
        for (int i = 0;i < len;i++) {
            int num = nums[i];
            num_cnt.put(num, num_cnt.getOrDefault(num, 0)+1);
            if (!num_first.containsKey(num)) {
                num_first.put(num, i);
            }
            num_last.put(num, i);
        }
        int max_du = 0;
        int min_len = 0;
        for (int num : num_cnt.keySet()) {
            if (num_cnt.get(num) > max_du) {
                max_du = num_cnt.get(num);
                min_len = num_last.get(num)-num_first.get(num)+1;
            }
            else if (num_cnt.get(num) == max_du) {
                min_len = Math.min(min_len, num_last.get(num)-num_first.get(num)+1);
            }
        }
        return min_len;
    }
}
