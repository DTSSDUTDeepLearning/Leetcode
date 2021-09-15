package SuanFa.l416;

public class l416_1_1 {

    // f[i][j]表示:前i个数值总和不超过j的最大价值
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
        int[][] dp = new int[len][sum+1];
        for (int j = 0;j <= sum;j++) {
            dp[0][j] = j >= nums[0] ? nums[0] : 0;
        }
        for (int i = 1;i < len;i++) {
            for (int j = 0;j <= sum;j++) {
                int no = dp[i-1][j];
                int yes = j >= nums[i] ? dp[i-1][j-nums[i]] + nums[i] : 0;
                dp[i][j] = Math.max(no, yes);
            }
        }
        return dp[len-1][sum] == sum;
    }
}
