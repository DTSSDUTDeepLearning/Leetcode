package l2001;

import java.util.HashMap;
import java.util.Map;

public class l2001 {

    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double, Long> m = new HashMap<>();
        for (int[] rec : rectangles) {
            double rate = (double)rec[0] / rec[1];
            m.put(rate, m.getOrDefault(rate, (long)0) + 1);
        }
        long cnt = 0;
        for (long value : m.values()) {
            cnt += value * (value-1) / 2;
        }
        return cnt;
    }
}

class Solution {

}