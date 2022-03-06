package SuanFa.l1049;

public class l1049_2 {

    // dp[i][j]表示前i个石头，总和不超过j的最大价值
    // 在l1049_1的基础上，优化空间复杂度
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        int target = sum / 2;
        int[] dp = new int[target+1];
        for (int stone : stones) {
            for (int j = target;j >= stone;j--) {
                dp[j] = Math.max(dp[j], dp[j - stone] + stone);
            }
        }
        return Math.abs(sum - dp[target]*2);
    }
}
