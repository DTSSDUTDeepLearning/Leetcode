package NowCoder.l127;

import java.util.Map;

public class l127 {

    // 动态规划，二维数组
    public String LCS (String str1, String str2) {
        char[] cs1 = str1.toCharArray();
        char[] cs2 = str2.toCharArray();
        int m = cs1.length;
        int n = cs2.length;
        int max_len = 0;
        int max_last_index = -1;
        int[][] lcs = new int[m][n];
        lcs[0][0] = cs1[0] == cs2[0]?1:0;
        for (int i = 1;i < m;i++) {
            lcs[i][0] = cs1[i] == cs2[0]?1:0;
        }
        for (int j = 1;j < n;j++) {
            lcs[0][j] = cs1[0] == cs2[j]?1:0;
        }
        for (int i = 1;i < m;i++) {
            for (int j = 1;j < n;j++) {
                if (cs1[i] == cs2[j]) {
                    lcs[i][j] = lcs[i-1][j-1] + 1;
                    if (max_len < lcs[i][j]) {
                        max_len = lcs[i][j];
                        max_last_index = i;
                    }
                }
                else {
                    lcs[i][j] = 0;
                }
            }
        }
        return str1.substring(max_last_index - max_len + 1, max_last_index + 1);
    }
}
