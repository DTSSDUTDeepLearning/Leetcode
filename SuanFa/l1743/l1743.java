package SuanFa.l1743;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class l1743 {

    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> m = new HashMap<>();
        for (int[] pair : adjacentPairs) {
            if (m.containsKey(pair[0])) {
                m.get(pair[0]).add(pair[1]);
            }
            else {
                List<Integer> l = new LinkedList<>();
                l.add(pair[1]);
                m.put(pair[0], l);
            }
            if (m.containsKey(pair[1])) {
                m.get(pair[1]).add(pair[0]);
            }
            else {
                List<Integer> l = new LinkedList<>();
                l.add(pair[0]);
                m.put(pair[1], l);
            }
        }
        int start = 100001;
        for (int n : m.keySet()) {
            if (m.get(n).size() == 1) {
                start = n;
                break;
            }
        }
        int len = adjacentPairs.length;
        int[] result = new int[len+1];
        result[0] = start;
        result[1] = m.get(start).get(0);
        for (int i = 2;i <= len;i++) {
            result[i] = m.get(result[i-1]).get(m.get(result[i-1]).get(0) == result[i-2] ? 1 : 0);
        }
        return result;
    }
}
