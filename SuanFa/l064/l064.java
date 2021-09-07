package SuanFa.l064;

public class l064 {
    //动态规划
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 1;i < m;i++) {
            grid[i][0] += grid[i-1][0];
        }
        for (int j = 1;j < n;j++) {
            grid[0][j] += grid[0][j-1];
        }
        for (int i = 1;i < m;i++) {
            for (int j = 1;j < n;j++) {
                if (grid[i-1][j] < grid[i][j-1]) {
                    grid[i][j] += grid[i-1][j];
                }
                else {
                    grid[i][j] += grid[i][j-1];
                }
            }
        }
        return grid[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
}
