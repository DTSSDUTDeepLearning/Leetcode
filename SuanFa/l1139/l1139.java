package l1139;

public class l1139 {

    public int largest1BorderedSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] left = new int[m+1][n+1];
        int[][] up = new int[m+1][n+1];
        int result = 0;
        for (int i = 1;i <= m;i++) {
            for (int j = 1;j <= n;j++) {
                if (grid[i-1][j-1] == 1) {
                    left[i][j] = left[i][j-1] + 1;
                    up[i][j] = up[i-1][j] + 1;
                    int border = Math.min(left[i][j], up[i][j]);
                    while (left[i-border+1][j] < border || up[i][j-border+1] < border) {
                        border--;
                    }
                    result = Math.max(result, border);
                }
            }
        }
        return result * result;
    }
}
