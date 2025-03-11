package l695;

public class l695 {
    int[][] grid;
    int m;
    int n;
    boolean[][] flag;
    int square;
    static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;
        flag = new boolean[m][n];
        int max = 0;
        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                if (this.grid[i][j] == 1 && !flag[i][j]) {
                    square = 0;
                    dfs(i, j);
                    max = Math.max(max, square);
                }
            }
        }
        return max;
    }

    public void dfs(int x, int y) {
        square++;
        flag[x][y] = true;
        for (int[] dir : directions) {
            int next_x = x + dir[0];
            int next_y = y + dir[1];
            if (next_x >= 0 && next_x < m && next_y >= 0 && next_y < n && grid[next_x][next_y] == 1 && !flag[next_x][next_y]) {
                dfs(next_x, next_y);
            }
        }
    }
}