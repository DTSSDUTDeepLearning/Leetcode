package SuanFa.l1449;

import java.util.Arrays;

public class l1449 {

    public String largestNumber(int[] cost, int target) {
        int[] dp = new int[target+1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = 0;
        for (int c : cost) {
            for (int j = c;j <= target;j++) {
                dp[j] = Math.max(dp[j], dp[j-c] + 1);
            }
        }
        if (dp[target] < 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 9, j = target;i >= 1;i--) {
            while (j >= cost[i-1] && dp[j] == dp[j-cost[i-1]] + 1) {
                sb.append(i);
                j -= cost[i-1];
            }
        }
        return sb.toString();
    }
}
