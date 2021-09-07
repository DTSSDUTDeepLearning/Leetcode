package SuanFa.l097;

public class l097 {

    public boolean isInterleave(String s1, String s2, String s3) {
        char[] cs1 = s1.toCharArray();
        char[] cs2 = s2.toCharArray();
        char[] cs3 = s3.toCharArray();
        int len1 = cs1.length;
        int len2 = cs2.length;
        if (len1 + len2 != cs3.length) {
            return false;
        }
        boolean[][] result = new boolean[len1+1][len2+1];
        result[0][0] = true;
        for (int j = 1;j <= len2;j++) {
            result[0][j] = result[0][j-1] && cs2[j-1] == cs3[j-1];
        }
        for (int i = 1;i <= len1;i++) {
            result[i][0] = result[i-1][0] && cs1[i-1] == cs3[i-1];
        }
        for (int i = 1;i <= len1;i++) {
            for (int j = 1;j <= len2;j++) {
                result[i][j] = result[i-1][j] && cs1[i-1] == cs3[i+j-1] || result[i][j-1] && cs2[j-1] == cs3[i+j-1];
            }
        }
        return result[len1][len2];
    }
}
