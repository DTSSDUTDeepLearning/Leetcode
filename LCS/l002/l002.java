package LCS.l002;

import java.util.*;

public class l002 {

    public int halfQuestions(int[] questions) {
        int n = questions.length / 2;
        Map<Integer, Integer> m = new HashMap<>();
        for (int q : questions) {
            m.put(q, m.getOrDefault(q, 0)+1);
        }
        List<Map.Entry<Integer, Integer>> l = new ArrayList<>(m.entrySet());
        Collections.sort(l, (o1, o2) -> o2.getValue()-o1.getValue());
        int len = l.size();
        for (int i = 0;i < len;i++) {
            n -= l.get(i).getValue();
            if (n <= 0) {
                return i+1;
            }
        }
        return -1;
    }
}
