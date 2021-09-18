package SuanFa.l583;

public class l583 {

    public int minDistance(String word1, String word2) {
        char[] cs1 = word1.toCharArray();
        char[] cs2 = word2.toCharArray();
        int m = cs1.length;
        int n = cs2.length;
//        if (m == 0) {
//            return n;
//        }
//        else if (n == 0) {
//            return m;
//        }
        int[][] lcs = new int[m][n];
        int index = 0;
        while (index < m && cs1[index] != cs2[0]) {
            lcs[index++][0] = 0;
        }
        for (int i = index;i < m;i++) {
            lcs[i][0] = 1;
        }
        index = 0;
        while (index < n && cs1[0] != cs2[index]) {
            lcs[0][index++] = 0;
        }
        for (int j = index;j < n;j++) {
            lcs[0][j] = 1;
        }
        for (int i = 1;i < m;i++) {
            for (int j = 1;j < n;j++) {
                if (cs1[i] == cs2[j]) {
                    lcs[i][j] = lcs[i-1][j-1] + 1;
                }
                else {
                    lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
                }
            }
        }
        return m + n - 2*lcs[m-1][n-1];
    }
}
