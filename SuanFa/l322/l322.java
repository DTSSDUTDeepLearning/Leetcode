package SuanFa.l322;

import java.util.Arrays;

public class l322 {

    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int len = coins.length;
        Arrays.sort(coins);
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1;i <= amount;i++) {
            for (int j = 0;j < len && coins[j] <= i;j++) {
                dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

//    或者可以不排序，在for(j)循环中，改成
//    for (int j = 0;j < len;j++) {
//        if (coins[j] <= i) {
//            ...
//        }
//    }
}
