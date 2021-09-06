package SuanFa.l037;

import java.util.LinkedList;
import java.util.List;

public class l037 {

    boolean[][] rows;
    boolean[][] columns;
    boolean[][][] blocks;
    boolean valid;
    List<int[]> spaces;

    public void solveSudoku(char[][] board) {
        rows = new boolean[9][9];
        columns = new boolean[9][9];
        blocks = new boolean[9][9][9];
        valid = false;
        spaces = new LinkedList<>();
        for (int i = 0;i < 9;i++) {
            for (int j = 0;j < 9;j++) {
                if (board[i][j] != '.') {
                    rows[i][board[i][j]-'0'-1] = true;
                    columns[j][board[i][j]-'0'-1] = true;
                    blocks[i/3][j/3][board[i][j]-'0'-1] = true;
                }
                else {
                    spaces.add(new int[]{i, j});
                }
            }
        }
        dfs(board, 0);
    }

    public void dfs(char[][] board, int p) {
        if (p == spaces.size()) {
            valid = true;
            return;
        }
        int i = spaces.get(p)[0];
        int j = spaces.get(p)[1];
        for (int k = 0;k < 9 && !valid;k++) {
            if (!rows[i][k] && !columns[j][k] && !blocks[i/3][j/3][k]) {
                rows[i][k] = true;
                columns[j][k] = true;
                blocks[i/3][j/3][k] = true;
                board[i][j] = (char)(k+1+'0');
                dfs(board, p+1);
                rows[i][k] = false;
                columns[j][k] = false;
                blocks[i/3][j/3][k] = false;
            }
        }
    }
}
