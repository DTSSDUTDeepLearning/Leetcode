package SuanFa.l048;

public class l048_1 {

    // 关键等式：matrix[col][n−row−1]=matrix[row][col]
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0;i < n/2;i++) {
            for (int j = 0;j < (n+1)/2;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
    }
}
