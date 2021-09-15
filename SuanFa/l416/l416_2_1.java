package SuanFa.l416;

public class l416_2_1 {

    // f[i][j]表示:前i个数值总和是否恰好为j
    public boolean canPartition(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum+=num;
        }
        if (sum % 2 == 1) {
            return false;
        }
        sum /= 2;
        boolean[][] dp = new boolean[len][sum+1];
        dp[0][0] = true;
        for (int i = 1;i < len;i++) {
            for (int j = 0;j <= sum;j++) {
                boolean no = dp[i-1][j];
                boolean yes = j >= nums[i] && dp[i - 1][j - nums[i]];
                dp[i][j] = no | yes;
            }
        }
        return dp[len-1][sum];
    }
}
