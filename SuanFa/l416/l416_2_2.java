package SuanFa.l416;

public class l416_2_2 {

    // f[i][j]表示:前i个数值总和是否恰好为j
    // 在l416_1_2的基础上，改进空间复杂度
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
        boolean[] dp = new boolean[sum+1];
        dp[0] = true;
        for (int num : nums) {
            for (int j = sum;j >= 0;j--) {
                boolean no = dp[j];
                boolean yes = j >= num && dp[j - num];
                dp[j] = no | yes;
            }
        }
        return dp[sum];
    }
}
