package SuanFa.l1928;

import java.util.Arrays;

public class l1928 {

    // dp[i][j]表示使用恰好i分钟到达城市j的最少运行费用总和
    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        final int INF = Integer.MAX_VALUE / 2;
        int n = passingFees.length;
        int[][] dp = new int[maxTime+1][n];
        for (int[] d : dp) {
            Arrays.fill(d, INF);
        }
        dp[0][0] = passingFees[0];
        for (int i = 1;i <= maxTime;i++) {
            for (int[] edge : edges) {
                int pre = edge[0];
                int cur = edge[1];
                int cost = edge[2];
                if (cost <= i) {
                    dp[i][pre] = Math.min(dp[i][pre], dp[i-cost][cur] + passingFees[pre]);
                    dp[i][cur] = Math.min(dp[i][cur], dp[i-cost][pre] + passingFees[cur]);
                }
            }
        }
        int min = INF;
        for (int i = 1;i <= maxTime;i++) {
            min = Math.min(min, dp[i][n-1]);
        }
        return min == INF ? -1 : min;
    }
}
