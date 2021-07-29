package LCP.l007;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l007_3 {

    // 动态规划
    public int numWays(int n, int[][] relation, int k) {
        int[] results = new int[n];
        results[0] = 1;
        for (int i = 0;i < k;i++) {
            int[] tmp = new int[n];
            for (int[] r : relation) {
                tmp[r[1]] += results[r[0]];
            }
            results = tmp;
        }
        return results[n-1];
    }
}
