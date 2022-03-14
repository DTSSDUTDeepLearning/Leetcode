package SuanFa.l1770;

public class l1770 {

    public int maximumScore(int[] nums, int[] multipliers) {
        int n = nums.length;
        int m = multipliers.length;
        int[] dp = new int[m+1];
        dp[0] = 0;
        for (int j = 1;j <= m;j++) {
            dp[j] = dp[j-1] + nums[n-j] * multipliers[j-1];
        }
        int max = dp[m];
        for (int i = 1;i <= m;i++) {
            int[] tmp = new int[m+1];
            tmp[0] = dp[0] + nums[i-1] * multipliers[i-1];
            for (int j = 1;i+j <= m;j++) {
                tmp[j] = Math.max(dp[j] + nums[i-1] * multipliers[i+j-1],
                        tmp[j-1] + nums[n-j] * multipliers[i+j-1]);
            }
            max = Math.max(max, tmp[m-i]);
            dp = tmp;
        }
        return max;
    }
}
