package LCP.l011;

import java.util.HashSet;
import java.util.Set;

public class l011 {

    public int expectNumber(int[] scores) {
        Set<Integer> s = new HashSet<>();
        for (int score : scores) {
            s.add(score);
        }
        return s.size();
    }
}
