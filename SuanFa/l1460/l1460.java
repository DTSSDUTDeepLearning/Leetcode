package SuanFa.l1460;

import java.util.HashMap;
import java.util.Map;

public class l1460 {

    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();
        for (int num : target) {
            m1.put(num, m1.getOrDefault(num, 0)+1);
        }
        for (int num : arr) {
            m2.put(num, m2.getOrDefault(num, 0)+1);
        }
        return m1.equals(m2);
    }
}
