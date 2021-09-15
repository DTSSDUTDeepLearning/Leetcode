package SuanFa.l403;

import java.util.*;

public class l403 {

    // bfs
    public boolean canCross(int[] stones) {
        int len = stones.length;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0;i < len;i++) {
            m.put(stones[i], i);
        }
        if (!m.containsKey(1)) {
            return false;
        }
        boolean[][] visited = new boolean[len][len];
        Queue<int[]> q = new LinkedList<>();
        visited[1][1] = true;
        q.offer(new int[]{1, 1});
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int index = poll[0];
            int k = poll[1];
            if (index == len - 1) {
                return true;
            }
            for (int i = -1;i <= 1;i++) {
                if (k + i != 0) {
                    int next = stones[index] + k + i;
                    if (m.containsKey(next)) {
                        int next_index = m.get(next);
                        if (next_index == len - 1) {
                            return true;
                        }
                        int next_k = k + i;
                        if (!visited[next_index][next_k]) {
                            visited[next_index][next_k] = true;
                            q.offer(new int[]{next_index, next_k});
                        }
                    }
                }
            }
        }
        return false;
    }
}
