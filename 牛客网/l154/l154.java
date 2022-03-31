package NowCoder.l154;

public class l154 {

    public int longestPalindromeSubSeq (String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        if (len == 1) {
            return 1;
        }
        int[][] dp = new int[len][len];
        dp[len-1][len-1] = 1;
        dp[len-2][len-2] = 1;
        dp[len-2][len-1] = cs[len-2]==cs[len-1]?2:1;
        for (int i = len-3;i >= 0;i--) {
            dp[i][i] = 1;
            for (int j = i+1;j < len;j++) {
                if (cs[i] == cs[j]) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                }
                else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[0][len-1];
    }
}
