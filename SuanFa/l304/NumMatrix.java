package SuanFa.l304;

public class NumMatrix {

    int[][] preSum;
    int m;
    int n;

    public NumMatrix(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        preSum = new int[m][n];
        preSum[0][0] = 0;
        for (int i = 1;i < m;i++) {
            preSum[i][0] = matrix[i][0] + preSum[i-1][0];
        }
        for (int j = 1;j < n;j++) {
            preSum[0][j] = matrix[0][j] + preSum[0][j-1];
        }
        for (int i = 1;i < m;i++) {
            for (int j = 1;j < n;j++) {
                preSum[i][j] = matrix[i][j] + preSum[i-1][j] + preSum[i][j-1] - preSum[i-1][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (row1 == 0) {
            if (col1 == 0) {
                return preSum[row2][col2];
            }
            else {
                return preSum[row2][col2] - preSum[row2][col1-1];
            }
        }
        else {
            if (col1 == 0) {
                return preSum[row2][col2] - preSum[row1-1][col2];
            }
            else {
                return preSum[row2][col2] - preSum[row1-1][col2] - preSum[row2][col1-1] + preSum[row1-1][col1-1];
            }
        }
    }
}
