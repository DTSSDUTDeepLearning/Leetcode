package SuanFa.l200;

public class l200_2 {

    // 深度优先搜索
//    执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
//    内存消耗：40.9 MB, 在所有 Java 提交中击败了36.00%的用户
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

    public int numIslands(char[][] grid) {
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
