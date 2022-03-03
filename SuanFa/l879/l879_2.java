package SuanFa.l879;

public class l879_2 {

    // 在l879_1的基础上，优化空间复杂度
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int MOD = 1000000007;
        int len = group.length;
        int[][] dp = new int[n+1][minProfit+1];
        for (int j = 0;j <= n;j++) {
            dp[j][0] = 1;
        }
        for (int i = 0;i < len;i++) {
            int people = group[i];
            int pro = profit[i];
            for (int j = n;j >= people;j--) {
                for (int k = minProfit;k >= 0;k--) {
                    dp[j][k] = (dp[j][k] + dp[j-people][Math.max(k-pro, 0)]) % MOD;
                }
            }
        }
        return dp[n][minProfit];
    }
}
