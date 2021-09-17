package SuanFa.l523;

import java.util.HashMap;
import java.util.Map;

public class l523 {

    public boolean checkSubarraySum(int[] nums, int k) {
        int len = nums.length;
        if (len < 2) {
            return false;
        }
        Map <Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = (nums[i] + sum) % k;
            if (map.containsKey(sum)) {
                if (i - map.get(sum) > 1) {
                    return true;
                }
            }
            else {
                map.put(sum, i);
            }
        }
        return false;
    }
}
