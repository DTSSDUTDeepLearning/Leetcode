package l2373;

public class l2373 {

    public int[][] largestLocal(int[][] grid) {
        int len = grid.length;
        int[][] result = new int[len-2][len-2];
        for (int i = 0;i < len-2;i++) {
            for (int j = 0;j < len-2;j++) {
                for (int x = i;x <= i+2;x++) {
                    for (int y = j;y <= j+2;y++) {
                        result[i][j] = Math.max(result[i][j], grid[x][y]);
                    }
                }
            }
        }
        return result;
    }
}
