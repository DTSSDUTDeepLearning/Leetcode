package SuanFa.l787;

import java.util.Arrays;

public class l787_1 {

    // 动态规划，dp[i][j]表示通过恰好i次航班（中转i-1次），从src到达了j的最小花费
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        final int INF = 10000 * 101 + 1;
        int[][] dp = new int[k+2][n];
        for (int i = 0;i <= k + 1;i++) {
            Arrays.fill(dp[i], INF);
        }
        dp[0][src] = 0;
        for (int i = 1;i <= k + 1;i++) {
            for (int[] flight : flights) {
                int pre = flight[0];
                int cur = flight[1];
                int cost = flight[2];
                dp[i][cur] = Math.min(dp[i][cur], dp[i-1][pre] + cost);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1;i <= k + 1;i++) {
            min = Math.min(min, dp[i][dst]);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
