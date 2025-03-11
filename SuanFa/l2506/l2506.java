package l2506;

public class l2506 {

    public int similarPairs(String[] words) {
        int len = words.length;
        boolean[][] fre = new boolean[len][26];
        for (int i = 0;i < len;i++) {
            char[] cs = words[i].toCharArray();
            for (char c : cs) {
                fre[i][c-'a'] = true;
            }
        }

        int cnt = 0;
        for (int i = 0;i < len-1;i++) {
            for (int j = i+1;j < len;j++) {
                if (wordsEquals(fre[i], fre[j])) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private boolean wordsEquals(boolean[] x, boolean[] y) {
        for (int i = 0;i < 26;i++) {
            if (x[i] != y[i]) {
                return false;
            }
        }
        return true;
    }
}
