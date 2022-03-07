package JianZhiOffer2.l116;

import java.util.Deque;
import java.util.LinkedList;

public class l116_3 {

    // 使用广度优先搜索。虽然时间复杂度和深度优先搜索一样都为O(n^2)，但实际上比深度优先搜索慢很多
    public int findCircleNum(int[][] isConnected) {
        int len = isConnected.length;
        boolean[] visited = new boolean[len];
        Deque<Integer> q = new LinkedList<>();
        int provinces = 0;
        for (int i = 0;i < len;i++) {
            if (!visited[i]) {
                q.offer(i);
                while (!q.isEmpty()) {
                    int start = q.poll();
                    visited[start] = true;
                    for (int j = 0;j < len;j++) {
                        if (isConnected[start][j]==1 && !visited[j]) {
                            q.offer(j);
                        }
                    }
                }
                provinces++;
            }
        }
        return provinces;
    }
}
