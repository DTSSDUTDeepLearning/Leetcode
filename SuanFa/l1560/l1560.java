package SuanFa.l1560;

import java.util.LinkedList;
import java.util.List;

public class l1560 {

    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> result = new LinkedList<>();
        int start = rounds[0];
        int end = rounds[rounds.length-1];
        if (start <= end) {
            for (int i = start;i <= end;i++) {
                result.add(i);
            }
        }
        else {
            for (int i = 1;i <= end;i++) {
                result.add(i);
            }
            for (int i = start;i <= n;i++) {
                result.add(i);
            }
        }
        return result;
    }
}
