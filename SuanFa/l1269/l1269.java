package SuanFa.l1269;

public class l1269 {

    public int numWays(int steps, int arrLen) {
        int mod = 1000000007;
        int x = Math.min(steps, arrLen-1);
        int[] dp = new int[x+1];
        dp[0] = 1;
        for (int i = 1;i <= steps;i++) {
            int[] dp_tmp = new int[x+1];
            dp_tmp[0] = (dp[0] + dp[1]) % mod;
            for (int j = 1;j < i;j++) {
                dp_tmp[j] = ((dp[j-1] + dp[j]) % mod + dp[j+1]) % mod;
            }
            dp_tmp[x] = (dp[x-1] + dp[x]) % mod;
            dp = dp_tmp;
        }
        return dp[0];
    }
}
