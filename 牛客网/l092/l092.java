package NowCoder.l092;

public class l092 {

    public String LCS (String s1, String s2) {
        if (s1 == null || s2 == null || s1.equals("") || s2.equals("")) {
            return "-1";
        }
        char[] chs1 =s1.toCharArray();
        char[] chs2 =s2.toCharArray();
        int[][] dp = getdp(chs1, chs2);
        int m = chs1.length - 1;
        int n = chs2.length - 1;
        if (dp[m][n] == 0) {
            return "-1";
        }
        char[] res = new char[dp[m][n]];
        int index = res.length - 1;
        while (index >= 0) {
            if (n > 0 && dp[m][n] == dp[m][n-1]) {
                n--;
            }
            else if (m > 0 && dp[m][n] == dp[m-1][n]) {
                m--;
            }
            else {
                res[index--] = chs1[m];
                m--;
                n--;
            }
        }
        return String.valueOf(res);
    }

    public int[][] getdp(char[] str1, char[] str2) {
        int[][] dp = new int[str1.length][str2.length];
        dp[0][0] = str1[0] == str2[0] ? 1 : 0;
        for (int i = 1;i < str1.length;i++) {
            dp[i][0] = Math.max(dp[i-1][0], str1[i] == str2[0] ? 1 : 0);
        }
        for (int j = 1;j < str2.length;j++) {
            dp[0][j] = Math.max(dp[0][j-1], str1[0] == str2[j] ? 1 : 0);
        }
        for (int i = 1;i < str1.length;i++) {
            for (int j = 1;j < str2.length;j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                if (str1[i] == str2[j]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1]+1);
                }
            }
        }
        return dp;
    }
}
