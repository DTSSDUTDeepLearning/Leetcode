package NowCoder.l039;

import java.util.Arrays;

public class l039 {

    int cnt;
    int[] queens;
    int n;

    public int Nqueen (int n) {
        cnt = 0;
        this.n = n;
        queens = new int[n];
        Arrays.fill(queens, -1);
        dfs(0, 0, 0,0);
        return cnt;
    }

    public void dfs(int row, int columns, int diagonals1, int diagonals2) {
        if (row == n) {
            cnt++;
        }
        int availablePositions = ((1 << n) -1) & (~(columns | diagonals1 | diagonals2));
        while (availablePositions != 0) {
            int position = availablePositions & (-availablePositions);
            availablePositions = availablePositions & (availablePositions - 1);
            int column = Integer.bitCount(position - 1);
            queens[row] = column;
            dfs(row+1, columns | position, (diagonals1 | position) << 1, (diagonals2 | position) >> 1);
            queens[row] = -1;
        }
    }
}
