package SuanFa.l494;

public class l494 {

    // dp[i][j]表示前i个数计算结果为j的方案数
    public int findTargetSumWays(int[] nums, int target) {
        int len = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += Math.abs(num);
        }
        if (Math.abs(target) > sum) {
            return 0;
        }
        int[][] dp = new int[len+1][2*sum+1];
        dp[0][sum] = 1;
        for (int i = 1;i <= len;i++) {
            int x = nums[i-1];
            for (int j = -sum;j <= sum;j++) {
                if ((j - x) + sum >= 0) {
                    dp[i][j + sum] += dp[i-1][(j - x) + sum];
                }
                if ((j + x) + sum <= 2 * sum) {
                    dp[i][j + sum] += dp[i-1][(j + x) + sum];
                }
            }
        }
        return dp[len][target + sum];
    }
}
