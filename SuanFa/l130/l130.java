package l130;

import java.util.LinkedList;
import java.util.Queue;

public class l130 {
    char[][] board;
    int m;
    int n;
    boolean[][] flag;
    static int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public void solve(char[][] board) {
        this.board = board;
        m = board.length;
        n = board[0].length;
        flag = new boolean[m][n];
        for (int i = 0;i < m;i++) {
            if (board[i][0] == 'O' && !flag[i][0]) {
                bfs(i, 0);
            }
            if (board[i][n-1] == 'O' && !flag[i][n-1]) {
                bfs(i, n-1);
            }
        }
        for (int j = 1;j < n-1;j++) {
            if (board[0][j] == 'O' && !flag[0][j]) {
                bfs(0, j);
            }
            if (board[m-1][j] == 'O' && !flag[m-1][j]) {
                bfs(m-1, j);
            }
        }
        for (int i = 1;i < m-1;i++) {
            for (int j = 1;j < n-1;j++) {
                if (board[i][j] == 'O' && !flag[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        flag[x][y] = true;
        q.offer(new int[]{x, y});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int[] dir : directions) {
                int next_x = cur[0] + dir[0];
                int next_y = cur[1] + dir[1];
                if (next_x >= 0 && next_x < m && next_y >= 0 && next_y < n && board[next_x][next_y] == 'O' && !flag[next_x][next_y]) {
                    flag[next_x][next_y] = true;
                    q.offer(new int[]{next_x, next_y});
                }
            }
        }
    }
}