package SuanFa.l044;

public class l044_1 {

    // 使用动态规划
//    执行用时：15 ms, 在所有 Java 提交中击败了86.60%的用户
//    内存消耗：38.8 MB, 在所有 Java 提交中击败了66.45%的用户
    public boolean isMatch(String s, String p) {
        char[] cs = s.toCharArray();
        char[] cp = p.toCharArray();
        int m = cs.length;
        int n = cp.length;
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for (int j = 1;j <= n;j++) {
            if (cp[j-1] == '*') {
                dp[0][j] = true;
            }
            else {
                break;
            }
        }
        for (int i = 1;i <= m;i++) {
            for (int j = 1;j <= n;j++) {
                if (cp[j-1] == '*') {
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                }
                else if (cs[i-1] == cp[j-1] || cp[j-1] == '?') {
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        return dp[m][n];
    }
}
