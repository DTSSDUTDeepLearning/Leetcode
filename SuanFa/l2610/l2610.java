package l2610;

import java.util.*;

public class l2610 {

    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        List<List<Integer>> result = new ArrayList<>();
        while (!map.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            Iterator<Map.Entry<Integer, Integer>> iter = map.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry<Integer, Integer> entry = iter.next();
                entry.setValue(entry.getValue() - 1);
                tmp.add(entry.getKey());
                if (entry.getValue() == 0) {
                    iter.remove();
                }
            }
            result.add(tmp);
        }
        return result;
    }
}
