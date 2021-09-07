package SuanFa.l079;

public class l079 {

    public boolean[][] flag;
    int row;
    int col;

    public boolean exist(char[][] board, String word) {
        char[] cs = word.toCharArray();
        row = board.length;
        col = board[0].length;
        flag = new boolean[row][col];
        for (int i = 0;i < row;i++) {
            for (int j = 0;j < col;j++) {
                if (search(board, cs, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean search(char[][] board, char[] word, int ind_row, int ind_col, int k) {
        if (board[ind_row][ind_col] != word[k]) {
            return false;
        }
        else if (k == word.length-1) {
            return true;
        }
        flag[ind_row][ind_col] = true;
        int[][] dir = {{0,1}, {0,-1},{1,0},{-1,0}};
        boolean result = false;
        for (int[] d : dir) {
            int now_row = ind_row+d[0];
            int now_col = ind_col+d[1];
            if (now_row >= 0 && now_row < row && now_col >= 0 && now_col < col && !flag[now_row][now_col] && search(board, word, now_row, now_col, k+1)) {
                result = true;
                break;
            }
        }
        flag[ind_row][ind_col] = false;
        return result;
    }
}
