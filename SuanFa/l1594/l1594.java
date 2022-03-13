package SuanFa.l1594;

public class l1594 {

    public int maxProductPath(int[][] grid) {
        if (grid[0][0] == 0) {
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        long[][] max = new long[row][col];
        long[][] min = new long[row][col];
        max[0][0] = min[0][0] = grid[0][0];
        for (int i = 1;i < row;i++) {
            max[i][0] = min[i][0] = max[i-1][0] * grid[i][0];
        }
        for (int j = 1;j < col;j++) {
            max[0][j] = min[0][j] = max[0][j-1] * grid[0][j];
        }
        for (int i = 1;i < row;i++) {
            for (int j = 1;j < col;j++) {
                long n1 = max[i-1][j] * grid[i][j];
                long n2 = max[i][j-1] * grid[i][j];
                long n3 = min[i-1][j] * grid[i][j];
                long n4 = min[i][j-1] * grid[i][j];
                max[i][j] = Math.max(n1, Math.max(n2, Math.max(n3, n4)));
                min[i][j] = Math.min(n1, Math.min(n2, Math.min(n3, n4)));
            }
        }
        if (max[row-1][col-1] < 0) {
            return -1;
        }
        else {
            return (int)(max[row-1][col-1] % 1000000007);
        }
    }
}
