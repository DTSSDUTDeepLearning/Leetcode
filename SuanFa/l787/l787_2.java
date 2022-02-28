package SuanFa.l787;

import java.util.Arrays;

public class l787_2 {

    // 动态规划，dp[i][j]表示通过恰好i次航班（中转i-1次），从src到达了j的最小花费
    // 空间复杂度优化，优化为一维数组
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        final int INF = 10000 * 101 + 1;
        int[] dp = new int[n];
        Arrays.fill(dp, INF);
        dp[src] = 0;
        int min = INF;
        for (int i = 1;i <= k + 1;i++) {
            int[] tmp = new int[n];
            Arrays.fill(tmp, INF);
            for (int[] flight : flights) {
                int pre = flight[0];
                int cur = flight[1];
                int cost = flight[2];
                tmp[cur] = Math.min(tmp[cur], dp[pre] + cost);
            }
            dp = tmp;
            min = Math.min(min, dp[dst]);
        }
        return min == INF ? -1 : min;
    }
}
