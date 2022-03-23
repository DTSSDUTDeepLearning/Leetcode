package NowCoder.l126;

import java.util.Arrays;

public class l126 {

    public int minMoney (int[] arr, int aim) {
        int len = arr.length;
        int[] dp = new int[aim+1];
        dp[0] = 0;
        for (int i = 1;i <= aim;i++){
            dp[i] = 10000;
        }
        for (int i = 0;i < len;i++) {
            for (int j = arr[i];j <= aim;j++) {
                dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
            }
        }
        if (dp[aim] == 10000) {
            return -1;
        }
        return dp[aim];
    }

}
