package NowCoder.l018;

public class l018 {

    public int[][] rotateMatrix(int[][] mat, int n) {
        // 水平翻转
        for (int i = 0; i < n/2;i++) {
            for (int j = 0;j < n;j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[n-i-1][j];
                mat[n-i-1][j] = temp;
            }
        }
        // 主对角线翻转
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < i;j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        return mat;
    }
}
