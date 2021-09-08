package SuanFa.l115;

public class l115 {

    public int numDistinct(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        int slen = cs.length;
        int tlen = ct.length;
        if (slen < tlen) {
            return 0;
        }
        int[][] result = new int[slen+1][tlen+1];
        for (int i = 0;i <= slen;i++) {
            result[i][0] = 1;
        }
        for (int j = 1;j <= tlen;j++) {
            result[0][j] = 0;
        }
        for (int i = 1;i <= slen;i++) {
            for (int j = 1;j <= tlen;j++) {
                result[i][j] = cs[i-1] == ct[j-1] ? result[i-1][j-1] + result[i-1][j] : result[i-1][j];
            }
        }
        return result[slen][tlen];
    }
}
