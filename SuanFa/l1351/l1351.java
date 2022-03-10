package SuanFa.l1351;

public class l1351 {

    public int countNegatives(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int i = 0;
        int j = col-1;
        int cnt = 0;
        while (i <= row-1 && j >= 0) {
            if (grid[i][j] < 0) {
                cnt += (row-i);
                j--;
            }
            else {
                i++;
            }
        }
        return cnt;
    }
}
