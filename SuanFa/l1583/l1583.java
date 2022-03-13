package SuanFa.l1583;

public class l1583 {

    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int len = preferences.length;
        int[][] pre = new int[len+1][len+1];
        for (int i = 0;i < len;i++) {
            for (int j = 0;j < len-1;j++) {
                pre[i][preferences[i][j]] = j;
            }
        }
        int[] match = new int[len];
        for (int[] pair : pairs) {
            match[pair[0]] = pair[1];
            match[pair[1]] = pair[0];
        }
        int cnt = 0;
        for (int x = 0;x < len;x++) {
            int y = match[x];
            for (int i = 0;i < pre[x][y];i++) {
                int u = preferences[x][i];
                int v = match[u];
                if (pre[u][x] < pre[u][v]) {
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}
