package SuanFa.l056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class l056 {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                if (interval1[0] == interval2[0]) {
                    return interval2[1] - interval1[1];
                }
                else {
                    return interval1[0] - interval2[0];
                }
            }
        });
        List<int[]> merged = new ArrayList<>();
        int left = intervals[0][0];
        int right = intervals[0][1];
        merged.add(new int[]{left, right});
        for (int i = 1;i < intervals.length;i++) {
            if (left != intervals[i][0]) {
                left = intervals[i][0];
                right = intervals[i][1];
                if (merged.get(merged.size() - 1)[1] < left) {
                    merged.add(new int[]{left, right});
                } else {
                    merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], right);
                }
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
