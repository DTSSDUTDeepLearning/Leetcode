package SuanFa.l1726;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class l1726 {

    public int tupleSameProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0;i < len;i++) {
            for (int j = i+1;j < len;j++) {
                m.put(nums[i]*nums[j], m.getOrDefault(nums[i]*nums[j], 0)+1);
            }
        }
        int cnt = 0;
        for (int num : m.values()) {
            cnt += num*(num-1)/2;
        }
        return cnt*8;
    }
}
