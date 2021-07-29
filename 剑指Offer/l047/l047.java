package JianZhiOffer.l047;

public class l047 {

    public int maxValue(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 1;i < row;i++) {
            grid[i][0]+=grid[i-1][0];
        }
        for (int j = 1;j < col;j++) {
            grid[0][j]+=grid[0][j-1];
        }
        for (int i = 1;i < row;i++) {
            for (int j = 1;j < col;j++) {
                grid[i][j]+=Math.max(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[row-1][col-1];
    }
}
