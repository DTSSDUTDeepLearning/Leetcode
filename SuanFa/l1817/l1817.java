package SuanFa.l1817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class l1817 {

    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> m = new HashMap<>();
        for (int[] log : logs) {
            int id = log[0];
            int minute = log[1];
            Set<Integer> s = m.getOrDefault(id, new HashSet<>());
            s.add(minute);
            m.put(id, s);
        }
        int[] result = new int[k];
        for (int id : m.keySet()) {
            result[m.get(id).size()-1]++;
        }
        return result;
    }
}
