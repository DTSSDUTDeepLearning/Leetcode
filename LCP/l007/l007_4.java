package LCP.l007;

public class l007_4 {

    int n;

    // 数学方法，矩阵自乘
    public int numWays(int n, int[][] relation, int k) {
        this.n = n;
        int[][] matrix = new int[n][n];
        for (int[] r : relation) {
            matrix[r[0]][r[1]]++;
        }
        int[] A = new int[n];
        for (int i = 0;i < n;i++) {
            A[i] = matrix[0][i];
        }
        for (int i = 0;i < k-1;i++) {
            A = mul(A, matrix);
        }
        return A[n-1];
    }

    public int[] mul(int[] A, int[][] B) {
        int[] C = new int[n];
        for (int i = 0;i < n;i++) {
            int sum = 0;
            for (int j = 0;j < n;j++) {
                sum += A[j]*B[j][i];
            }
            C[i] = sum;
        }
        return C;
    }
}
