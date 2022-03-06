package SuanFa.l1027;

public class l1027 {

    public int longestArithSeqLength(int[] nums) {
        int len = nums.length;
        int max = -1;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[][] dp = new int[len][2*max+1];
        int max_len = 0;
        for (int i = 1;i < len;i++) {
            for (int j = i-1;j >= 0;j--) {
                int diff = nums[i] - nums[j] + max;
                dp[i][diff] = Math.max(dp[i][diff], dp[j][diff] == 0 ? 2 : (dp[j][diff] + 1));
                max_len = Math.max(max_len, dp[i][diff]);
            }
        }
        return max_len;
    }
}
