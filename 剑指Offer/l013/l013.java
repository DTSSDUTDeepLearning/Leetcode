package JianZhiOffer.l013;

import java.util.LinkedList;
import java.util.Queue;

public class l013 {

    // 广度优先搜索
    public int movingCount(int m, int n, int k) {
        if (k == 0) {
            return 1;
        }
        int total_cnt = 1;
        Queue<int[]> q = new LinkedList<>();
        int[] dx = {0, 1};
        int[] dy = {1, 0};
        q.offer(new int[]{0, 0});
        boolean[][] flag = new boolean[m][n];
        flag[0][0] = true;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            for (int i = 0;i < 2;i++) {
                int next_x = x + dx[i];
                int next_y = y + dy[i];
                if (!(next_x < 0 || next_x >= m || next_y < 0 || next_y >= n || flag[next_x][next_y] || get(next_x) + get(next_y) > k)) {
                    q.offer(new int[]{next_x, next_y});
                    flag[next_x][next_y] = true;
                    total_cnt++;
                }
            }
        }
        return total_cnt;
    }

    public int get(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
