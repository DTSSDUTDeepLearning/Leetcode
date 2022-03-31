package NowCoder.l510;

public class l510 {

    public int selectPresent (int[][] presentVolumn) {
        int n = presentVolumn.length;
        int m = presentVolumn[0].length;
        int[][] result = new int[n][m];
        result[0][0] = presentVolumn[0][0];
        for (int i = 1;i < n;i++) {
            result[i][0] = presentVolumn[i][0] + result[i-1][0];
        }
        for (int j = 1;j < m;j++) {
            result[0][j] = presentVolumn[0][j] + result[0][j-1];
        }
        for (int i = 1;i < n;i++) {
            for (int j = 1;j < m;j++) {
                result[i][j] = Math.min(Math.min(result[i-1][j], result[i][j-1]), result[i-1][j-1]) + presentVolumn[i][j];
            }
        }
        return result[n-1][m-1];
    }
}
