package SuanFa.l867;

public class l867 {

    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] results = new int[n][m];
        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                results[j][i] = matrix[i][j];
            }
        }
        return results;
    }
}
