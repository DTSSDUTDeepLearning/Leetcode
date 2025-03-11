package l1706;

public class l1706 {

    public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] result = new int[n];
        if (n == 1) {
            result[0] = -1;
            return result;
        }

        int[][] path = new int[m][n];
        for (int i = 0;i < m;i++) {
            if (grid[i][0] == -1 || grid[i][0] == 1 && grid[i][1] == -1) {
                path[i][0] = -1;
            }
            else {
                path[i][0] = 1;
            }
            if (grid[i][n-1] == 1 || grid[i][n-1] == -1 && grid[i][n-2] == 1) {
                path[i][n-1] = -1;
            }
            else {
                path[i][n-1] = n-2;
            }
            for (int j = 1;j < n-1;j++) {
                if (grid[i][j-1] == 1 && grid[i][j] == -1
                        || grid[i][j] == 1 && grid[i][j+1] == -1) {
                    path[i][j] = -1;
                }
                else {
                    path[i][j] = j + grid[i][j];
                }
            }
        }

        for (int j = 0;j < n;j++) {
            result[j] = j;
        }
        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                if (result[j] != -1) {
                    result[j] = path[i][result[j]];
                }
            }
        }
        return result;
    }
}