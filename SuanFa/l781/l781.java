package SuanFa.l781;

import java.util.HashMap;
import java.util.Map;

public class l781 {

    public int numRabbits(int[] answers) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int answer : answers) {
            m.put(answer, m.getOrDefault(answer, 0)+1);
        }
        int cnt = 0;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();
            cnt += (k+v)/(k+1)*(k+1);
        }
        return cnt;
    }
}
