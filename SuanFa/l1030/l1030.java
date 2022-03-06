package SuanFa.l1030;

import java.util.LinkedList;
import java.util.List;

public class l1030 {

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int maxdist = Math.max(r0, R-1-r0)+Math.max(c0, C-1-c0);
        List<int[]>[] bucket = new LinkedList[maxdist+1];
        for (int i = 0;i <= maxdist;i++) {
            bucket[i] = new LinkedList<>();
        }
        for (int i = 0;i < R;i++) {
            for (int j = 0;j < C;j++) {
                int dist = Math.abs(r0-i)+Math.abs(c0-j);
                bucket[dist].add(new int[]{i, j});
            }
        }
        int[][] results = new int[R*C][2];
        int i = 0;
        for (int j = 0;j <= maxdist;j++) {
            for (int[] result : bucket[j]) {
                results[i++] = result;
            }
        }
        return results;
    }
}
