package NowCoder.l135;

public class l135 {

    public int maxProfit (int[] prices) {
        int len = prices.length;
        int[] dp = new int[4];
        dp[0] = -prices[0];
        dp[1] = 0;
        dp[2] = -prices[0];
        dp[3] = 0;
        for (int i = 1;i < len;i++) {
            dp[0] = Math.max(dp[0], -prices[i]);
            dp[1] = Math.max(dp[1], dp[0]+prices[i]);
            dp[2] = Math.max(dp[2], dp[1]-prices[i]);
            dp[3] = Math.max(dp[3], dp[2]+prices[i]);
        }
        return dp[3];
    }
}
