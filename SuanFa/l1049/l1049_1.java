package SuanFa.l1049;

public class l1049_1 {

    // dp[i][j]表示前i个石头，总和不超过j的最大价值
    public int lastStoneWeightII(int[] stones) {
        int len = stones.length;
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        int target = sum / 2;
        int[][] dp = new int[len+1][target+1];
        for (int i = 1;i <= len;i++) {
            int x = stones[i-1];
            for (int j = 0;j <= target;j++) {
                if (j >= x) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-x]+x);
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return Math.abs(sum - dp[len][target]*2);
    }
}
