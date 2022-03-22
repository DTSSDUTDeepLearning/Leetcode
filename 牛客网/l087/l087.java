package NowCoder.l087;

public class l087 {

    public int solve (int n, int k) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[k+1];
        for (int j = 1;j <= k;j++) {
            dp[j] = 1;
        }
        for (int i = 2;i <= n;i++) {
            dp[k] = 1 + dp[k-1] + dp[k];
            if (dp[k] >= n) {
                return i;
            }
            for (int j = k-1;j >= 1;j--) {
                dp[j] = 1 + dp[j-1] + dp[j];
            }
        }
        return -1;
    }
}
