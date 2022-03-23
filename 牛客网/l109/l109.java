package NowCoder.l109;

public class l109 {

    char[][] grid;
    int m;
    int n;

    public void dfs(int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(i+1, j);
        dfs(i-1, j);
        dfs(i, j+1);
        dfs(i, j-1);
    }

    public int solve (char[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;
        int cnt = 0;
        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                if (grid[i][j] == '1') {
                    cnt++;
                    dfs(i, j);
                }
            }
        }
        return cnt;
    }
}
