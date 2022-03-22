package NowCoder.l059;

public class l059 {

    public int minPathSum (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] results = new int[n];
        results[0] = matrix[0][0];
        for (int j = 1;j < n;j++) {
            results[j]=results[j-1]+matrix[0][j];
        }
        for (int i = 1;i < m;i++) {
            results[0]+=matrix[i][0];
            for (int j = 1;j < n;j++) {
                results[j]=matrix[i][j]+Math.min(results[j-1], results[j]);
            }
        }
        return results[n-1];
    }
}
