package SuanFa.l416;

public class l416_1_2 {

    // f[i][j]表示:前i个数值总和不超过j的最大价值
    // 在l416_1_1的基础上，改进空间复杂度
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
        int[] dp = new int[sum+1];
        for (int num : nums) {
            // 需要从大到小遍历容量
            for (int j = sum; j >= 0; j--) {
                int no = dp[j];
                int yes = j >= num ? dp[j - num] + num : 0;
                dp[j] = Math.max(no, yes);
            }
        }
        return dp[sum] == sum;
    }
}
