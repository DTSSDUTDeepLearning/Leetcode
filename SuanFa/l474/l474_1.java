package SuanFa.l474;

public class l474_1 {

    // cnt[i][0]表示strs[i]中0的个数，cnt[i][1]表示strs[i]中1的个数
    // dp[k][i][j]表示已经选择了strs中的前k个字符串，0的个数不超过i，1的个数不超过j的可选择个数
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

        int[][][] dp = new int[len][m+1][n+1];
        for (int i = 0;i <= m;i++) {
            for (int j = 0;j <= n;j++) {
                dp[0][i][j] = (i >= cnt[0][0] && j >= cnt[0][1]) ? 1 : 0;
            }
        }

        for (int k = 1;k < len;k++) {
            int zero = cnt[k][0];
            int one = cnt[k][1];
            for (int i = 0;i <= m;i++) {
                for (int j = 0;j <= n;j++) {
                    int no = dp[k-1][i][j];
                    int yes = (i >= zero && j >= one) ? dp[k-1][i-zero][j-one]+1 : 0;
                    dp[k][i][j] = Math.max(no, yes);
                }
            }
        }
        return dp[len-1][m][n];
    }
}
