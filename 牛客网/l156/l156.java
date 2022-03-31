package NowCoder.l156;

import java.util.HashMap;
import java.util.Map;

public class l156 {

    public int foundOnceNumber (int[] arr, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : arr) {
            m.put(num, m.getOrDefault(num, 0)+1);
        }
        for (int num : m.keySet()) {
            if (m.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
