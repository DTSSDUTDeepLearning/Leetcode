package LCP.l007;

import java.util.ArrayList;
import java.util.List;

public class l007_1 {

    int cnt;
    int n;
    int k;
    List<List<Integer>> l;

    // 深度优先
    public int numWays(int n, int[][] relation, int k) {
        this.n = n;
        this.k = k;
        l = new ArrayList<>();
        for (int i = 0;i < n;i++) {
            l.add(new ArrayList<>());
        }
        for (int[] r : relation) {
            l.get(r[0]).add(r[1]);
        }
        cnt = 0;
        dfs(0, 0);
        return cnt;
    }

    public void dfs(int i, int step) {
        if (step == k) {
            if (i == n-1){
                cnt++;
            }
            return;
        }
        for (int next : l.get(i)) {
            dfs(next, step+1);
        }
    }
}
