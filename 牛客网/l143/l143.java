package NowCoder.l143;

public class l143 {

    public int[][] solve (int[][] a, int[][] b) {
        int m = a.length;
        int l = b.length;
        int n = b[0].length;
        int[][] c = new int[m][n];
        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                int sum = 0;
                for (int k = 0;k < l;k++) {
                    sum+=a[i][k]*b[k][j];
                }
                c[i][j] = sum;
            }
        }
        return c;
    }
}
