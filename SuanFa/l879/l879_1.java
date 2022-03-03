package SuanFa.l879;

public class l879_1 {

    // dp[i][j][k]表示前i件工作，使用人数不超过j，利润至少为k的方案数
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int MOD = 1000000007;
        int len = group.length;
        long[][][] dp = new long[len+1][n+1][minProfit+1];
        for (int j = 0;j <= n;j++) {
            dp[0][j][0] = 1;
        }
        for (int i = 1;i <= len;i++) {
            for (int j = 0;j <= n;j++) {
                for (int k = 0;k <= minProfit;k++) {
                    if (j >= group[i-1]) {
                        dp[i][j][k] = (dp[i-1][j][k] + dp[i-1][j - group[i-1]][Math.max(k - profit[i-1], 0)]) % MOD;
                    }
                    else {
                        dp[i][j][k] = dp[i-1][j][k];
                    }
                }
            }
        }
        return (int)dp[len][n][minProfit];
    }
}
