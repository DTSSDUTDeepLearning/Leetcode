package SuanFa.l576;

public class l576 {

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int MOD = 1000000007;
        int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int out = 0;
        int[][] dp = new int[m][n];
        dp[startRow][startColumn] = 1;
        for (int move = 0; move < maxMove; move++) {
            int[][] tmp = new int[m][n];
            for (int i = 0;i < m;i++) {
                for (int j = 0;j < n;j++) {
                    int cnt = dp[i][j];
                    if (cnt > 0) {
                        for (int[] dir : directions) {
                            int next_i = i + dir[0];
                            int next_j = j + dir[1];
                            if (next_i >= 0 && next_i < m && next_j >= 0 && next_j < n) {
                                tmp[next_i][next_j] = (tmp[next_i][next_j] + cnt) % MOD;
                            }
                            else {
                                out = (out + cnt) % MOD;
                            }
                        }
                    }
                }
            }
            dp = tmp;
        }
        return out;
    }
}
