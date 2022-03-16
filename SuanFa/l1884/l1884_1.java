package SuanFa.l1884;

import java.util.Arrays;

public class l1884_1 {

    // 动态规划
    // 时间：27ms，空间：35.5MB
    public int twoEggDrop(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1;i <= n;i++) {
            for (int j = 1;j <= i;j++) {
                dp[i] = Math.min(dp[i], Math.max(j-1, dp[i-j])+1);
            }
        }
        return dp[n];
    }
}
