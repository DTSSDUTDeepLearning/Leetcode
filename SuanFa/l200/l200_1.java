package SuanFa.l200;

import java.util.LinkedList;
import java.util.Queue;

public class l200_1 {

    // 广度优先搜索
    // 时间、空间复杂度排名均为13%左右
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cnt = 0;
        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                if (grid[i][j] == '1') {
                    cnt++;
                    grid[i][j] = '0';
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i, j});
                    while (!q.isEmpty()) {
                        int[] curr = q.poll();
                        if (curr[0] - 1 >= 0 && grid[curr[0]-1][curr[1]] == '1') {
                            grid[curr[0]-1][curr[1]] = '0';
                            q.offer(new int[]{curr[0]-1, curr[1]});
                        }
                        if (curr[0] + 1 < m && grid[curr[0]+1][curr[1]] == '1') {
                            grid[curr[0]+1][curr[1]] = '0';
                            q.offer(new int[]{curr[0]+1, curr[1]});
                        }
                        if (curr[1] - 1 >= 0 && grid[curr[0]][curr[1]-1] == '1') {
                            grid[curr[0]][curr[1]-1] = '0';
                            q.offer(new int[]{curr[0], curr[1]-1});
                        }
                        if (curr[1] + 1 < n && grid[curr[0]][curr[1]+1] == '1') {
                            grid[curr[0]][curr[1]+1] = '0';
                            q.offer(new int[]{curr[0], curr[1]+1});
                        }
                    }
                }
            }
        }
        return cnt;
    }
}
