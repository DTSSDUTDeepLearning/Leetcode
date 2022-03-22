package NowCoder.l063;

import java.util.HashSet;
import java.util.Set;

public class l063_1 {

    // 集合+遍历
    public boolean IsContinuous(int [] numbers) {
        if (numbers.length < 5) {
            return false;
        }
        Set<Integer> s = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
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
