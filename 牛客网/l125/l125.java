package NowCoder.l125;

import java.util.HashMap;
import java.util.Map;

public class l125 {

    public int maxlenEqualK (int[] arr, int k) {
        int len = arr.length;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        int sum = 0;
        int max = -1;
        for (int i = 0;i < len;i++) {
            sum += arr[i];
            if (m.containsKey(sum - k)) {
                max = Math.max(max, i - m.get(sum-k));
            }
            if (!m.containsKey(sum)) {
                m.put(sum, i);
            }
        }
        return max;
    }
}
