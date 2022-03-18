package SuanFa.l1926;

import java.util.LinkedList;
import java.util.Queue;

public class l1926 {

    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        int res = 0;
        int[][] dir = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(entrance);
        maze[entrance[0]][entrance[1]] = '+';
        while(!queue.isEmpty()) {
            int size = queue.size();
            res += 1;
            for(int t = 0; t < size; t++) {
                int[] curr = queue.poll();
                for (int i = 0; i < 4; i++) {
                    int dx = curr[0] + dir[i][0];
                    int dy = curr[1] + dir[i][1];
                    if (dx >= 0 && dx < m && dy >= 0 && dy < n && maze[dx][dy] == '.'){
                        if (dx == 0 || dx == m-1 || dy == 0 || dy == n-1) {
                            return res;
                        }
                        maze[dx][dy] = '+';
                        queue.add(new int[]{dx,dy});
                    }
                }
            }
        }
        return -1;
    }
}
