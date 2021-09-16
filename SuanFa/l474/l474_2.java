package SuanFa.l474;

public class l474_2 {

    // 在l474_1的基础上，优化空间复杂度
    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;

        int[][] cnt = new int[len][2];
        for (int i = 0; i < len; i++) {
            String str = strs[i];
            int zero = 0, one = 0;
            for (char c : str.toCharArray()) {
                if (c == '0') {
                    zero++;
                } else {
                    one++;
                }
            }
            cnt[i] = new int[]{zero, one};
        }

        int[][] dp = new int[m+1][n+1];
        for (int k = 0;k < len;k++) {
            int zero = cnt[k][0];
            int one = cnt[k][1];
            for (int i = m;i >= zero;i--) {
                for (int j = n;j >= one;j--) {
                    int no = dp[i][j];
                    int yes = dp[i-zero][j-one]+1;
                    dp[i][j] = Math.max(no, yes);
                }
            }
        }
        return dp[m][n];
    }
}
