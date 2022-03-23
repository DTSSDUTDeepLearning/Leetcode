package NowCoder.l138;

public class l138 {

    public int[][] dirs;
    public int r, c;
    public int[][] matrix;
    public int[][] memo;

    public int solve (int[][] matrix) {
        dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        r = matrix.length;
        c = matrix[0].length;
        this.matrix = matrix;
        memo = new int[r][c];
        int result = 0;
        for (int i = 0;i < r;i++) {
            for (int j = 0;j < c;j++) {
                result = Math.max(result, dfs(i, j));
            }
        }
        return result;
    }

    public int dfs(int row, int column) {
        if (memo[row][column] != 0) {
            return memo[row][column];
        }
        memo[row][column]++;
        for (int[] dir : dirs) {
            int newRow = row + dir[0];
            int newColumn = column + dir[1];
            if (newRow >= 0 && newRow < r && newColumn >= 0 && newColumn < c && matrix[newRow][newColumn] > matrix[row][column]) {
                memo[row][column] = Math.max(memo[row][column], dfs(newRow, newColumn) + 1);
            }
        }
        return memo[row][column];
    }
}
