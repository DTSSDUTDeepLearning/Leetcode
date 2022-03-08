package SuanFa.l1143;

public class l1143 {

    public int longestCommonSubsequence(String text1, String text2) {
        char[] cs1 = text1.toCharArray();
        char[] cs2 = text2.toCharArray();
        int len1 = cs1.length;
        int len2 = cs2.length;
        int[][] result = new int[len1][len2];
        result[0][0] = cs1[0]==cs2[0]?1:0;
        for (int j = 1;j < len2;j++) {
            result[0][j] = cs1[0]==cs2[j]?1:result[0][j-1];
        }
        for (int i = 1;i<len1;i++) {
            result[i][0] = cs1[i]==cs2[0]?1:result[i-1][0];
        }
        for (int i = 1;i < len1;i++) {
            for (int j = 1;j < len2;j++) {
                result[i][j] = cs1[i]==cs2[j]?result[i-1][j-1]+1:Math.max(result[i-1][j], result[i][j-1]);
            }
        }
        return result[len1-1][len2-1];
    }
}
