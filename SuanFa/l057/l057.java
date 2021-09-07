package SuanFa.l057;

import java.util.LinkedList;
import java.util.List;

public class l057 {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> results = new LinkedList<>();
        boolean placed = true;
        for (int[] interval : intervals) {
            if (interval[1] < newInterval[0]) {
                results.add(interval);
            }
            else if (interval[0] > newInterval[1]) {
                if (placed) {
                    results.add(newInterval);
                    placed = false;
                }
                results.add(interval);
            }
            else {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }
        if (placed) {
            results.add(newInterval);
        }
        int len = results.size();
        int[][] res = new int[len][2];
        for (int i = 0;i < len;i++) {
            res[i][0] = results.get(i)[0];
            res[i][1] = results.get(i)[1];
        }
        return res;
    }
}
