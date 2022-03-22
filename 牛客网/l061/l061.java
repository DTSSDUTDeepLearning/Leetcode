package NowCoder.l061;

import java.util.HashMap;
import java.util.Map;

public class l061 {

    public int[] twoSum (int[] numbers, int target) {
        int[] results = new int[2];
        Map<Integer, Integer> m = new HashMap<>();
        int len = numbers.length;
        for (int i = 0;i < len;i++) {
            if (m.containsKey(numbers[i])) {
                results[0] = m.get(numbers[i])+1;
                results[1] = i+1;
                return results;
            }
            m.put(target-numbers[i], i);
        }
        return results;
    }
}
