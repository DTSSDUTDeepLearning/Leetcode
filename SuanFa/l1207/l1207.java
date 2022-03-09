package SuanFa.l1207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class l1207 {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : arr) {
            m.put(num, m.getOrDefault(num, 0)+1);
        }
        Set<Integer> s = new HashSet<>();
        for (int num : m.keySet()) {
            if (s.contains(m.get(num))) {
                return false;
            }
            else {
                s.add(m.get(num));
            }
        }
        return true;
    }
}
