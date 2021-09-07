package SuanFa.l072;

public class l072 {

    public int minDistance(String word1, String word2) {
        char[] cs1 = word1.toCharArray();
        char[] cs2 = word2.toCharArray();
        int m = cs1.length;
        int n = cs2.length;
        if (m * n == 0) {
            return m + n;
        }
        int[][] dp = new int[m+1][n+1];
        for (int j = 0;j <= n;j++) {
            dp[0][j] = j;
        }
        for (int i = 1;i <= m;i++) {
            dp[i][0] = i;
        }
        for (int i = 1;i <= m;i++) {
            for (int j = 1;j <= n;j++) {
                if (cs1[i-1] == cs2[j-1]) {
                    dp[i][j] = Math.min(Math.min(dp[i][j-1] + 1, dp[i-1][j] + 1), dp[i-1][j-1]);
                }
                else {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
