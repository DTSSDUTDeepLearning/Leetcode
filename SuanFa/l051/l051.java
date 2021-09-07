package SuanFa.l051;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class l051 {

    List<List<String>> results;
    int[] queens;
    int n;

    public List<List<String>> solveNQueens(int n) {
        results = new LinkedList<>();
        this.n = n;
        queens = new int[n];
        Arrays.fill(queens, -1);
        dfs(0, 0, 0,0);
        return results;
    }

    public void dfs(int row, int columns, int diagonals1, int diagonals2) {
        if (row == n) {
            results.add(generate());
            return;
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

    public List<String> generate() {
        List<String> board = new LinkedList<>();
        for (int i = 0;i < n;i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[queens[i]] = 'Q';
            board.add(new String(row));
        }
        return board;
    }
}
