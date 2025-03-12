package l3046;

import java.util.HashMap;
import java.util.Map;

public class l3046 {

    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int num : nums) {
            cnt.put(num, cnt.getOrDefault(num, 0) + 1);
            if (cnt.get(num) > 2) {
                return false;
            }
        }
        return true;
    }
}
