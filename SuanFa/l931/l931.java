package l931;

public class l931 {

    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        for (int i = 1;i < n;i++) {
            matrix[i][0] += Math.min(matrix[i-1][0], matrix[i-1][1]);
            matrix[i][n-1] += Math.min(matrix[i-1][n-1], matrix[i-1][n-2]);
            for (int j = 1;j < n-1;j++) {
                matrix[i][j] += Math.min(Math.min(matrix[i-1][j-1], matrix[i-1][j]), matrix[i-1][j+1]);
            }
        }
        int result = Integer.MAX_VALUE;
        for (int j = 0;j < n;j++) {
            result = Math.min(result, matrix[n-1][j]);
        }
        return result;
    }
}
