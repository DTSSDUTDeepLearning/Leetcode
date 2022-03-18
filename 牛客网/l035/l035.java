package NowCoder.l035;

public class l035 {

    public int minEditCost (String str1, String str2, int ic, int dc, int rc) {
        char[] cs1 = str1.toCharArray();
        char[] cs2 = str2.toCharArray();
        int m = cs1.length;
        int n = cs2.length;
        if (m * n == 0) {
            return m * dc + n * ic;
        }
        int[][] dp = new int[m+1][n+1];
        for (int j = 0;j <= n;j++) {
            dp[0][j] = j * ic;
        }
        for (int i = 1;i <= m;i++) {
            dp[i][0] = i * dc;
        }
        for (int i = 1;i <= m;i++) {
            for (int j = 1;j <= n;j++) {
                if (cs1[i-1] == cs2[j-1]) {
                    dp[i][j] = Math.min(Math.min(dp[i][j-1] + ic, dp[i-1][j] + dc), dp[i-1][j-1]);
                }
                else {
                    dp[i][j] = Math.min(Math.min(dp[i][j-1] + ic, dp[i-1][j] + dc), dp[i-1][j-1] + rc);
                }
            }
        }
        return dp[m][n];
    }
}
