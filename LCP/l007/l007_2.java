package LCP.l007;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l007_2 {

    // 广度优先
    public int numWays(int n, int[][] relation, int k) {
        List<List<Integer>> l;
        l = new ArrayList<>();
        for (int i = 0;i < n;i++) {
            l.add(new ArrayList<>());
        }
        for (int[] r : relation) {
            l.get(r[0]).add(r[1]);
        }

        int step = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        while (!q.isEmpty() && step < k) {
            step++;
            int len = q.size();
            for (int i = 0;i < len;i++) {
                for (int next : l.get(q.poll())) {
                    q.offer(next);
                }
            }
        }
        int cnt = 0;
        while (!q.isEmpty()) {
            if (q.poll() == n-1) {
                cnt++;
            }
        }
        return cnt;
    }
}
