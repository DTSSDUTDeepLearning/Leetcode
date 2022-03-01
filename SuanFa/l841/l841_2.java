package SuanFa.l841;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l841_2 {

    // 广度优先搜索
//    执行用时：3 ms, 在所有 Java 提交中击败了18.50%的用户
//    内存消耗：38.4 MB, 在所有 Java 提交中击败了38.43%的用户
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] flag = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        while (!q.isEmpty()) {
            int cur = q.poll();
            flag[cur] = true;
            for (int next : rooms.get(cur)) {
                if (!flag[next]) {
                    q.offer(next);
                }
            }
        }
        for (int i = 0;i < n;i++) {
            if (!flag[i]) {
                return false;
            }
        }
        return true;
    }
}
