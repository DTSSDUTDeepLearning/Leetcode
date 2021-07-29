package JianZhiOffer.l061;

import java.util.HashSet;
import java.util.Set;

public class l061_1 {

    // 集合+遍历
    public boolean isStraight(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num != 0) {
                if (s.contains(num)) {
                    return false;
                }
                max = Math.max(max, num);
                min = Math.min(min, num);
                s.add(num);
            }
        }
        return max-min<5;
    }
}
