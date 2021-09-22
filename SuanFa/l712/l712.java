package SuanFa.l712;

public class l712 {

    public int minimumDeleteSum(String s1, String s2) {
        char[] cs1 = s1.toCharArray();
        char[] cs2 = s2.toCharArray();
        int m = cs1.length;
        int n = cs2.length;
        int[][] result = new int[m+1][n+1];
        result[0][0] = 0;
        for (int j = 1;j <= n;j++) {
            result[0][j] = result[0][j-1] + cs2[j-1];
        }
        for (int i = 1;i <= m;i++) {
            result[i][0] = result[i-1][0] + cs1[i-1];
        }
        for (int i = 1;i <= m;i++) {
            for (int j = 1;j <= n;j++) {
                if (cs1[i-1] == cs2[j-1]) {
                    result[i][j] = result[i-1][j-1];
                }
                else {
                    result[i][j] = Math.min(result[i-1][j] + cs1[i-1], result[i][j-1] + cs2[j-1]);
                }
            }
        }
        return result[m][n];
    }
}
