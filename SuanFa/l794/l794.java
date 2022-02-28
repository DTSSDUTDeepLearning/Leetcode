package SuanFa.l794;

public class l794 {

//    final int[][][] win = {{{0,0}, {0,1}, {0,2}}, {{1,0}, {1,1}, {1,2}}, {{2,0}, {2,1}, {2,2}},
//                            {0,0}, {1,0}, {2,0}}, {{0,1}, {1,1}, {2,1}}}

    public boolean validTicTacToe(String[] board) {
        int cnt0 = 0;
        int cnt1 = 0;
        int[][] matrix = new int[3][3];
        for (int i = 0;i < 3;i++) {
            char[] cs = board[i].toCharArray();
            for (int j = 0;j < 3;j++) {
                if (cs[j] == ' ') {
                    matrix[i][j] = 0;
                }
                else if (cs[j] == 'X') {
                    matrix[i][j] = 1;
                    cnt0++;
                }
                else {
                    matrix[i][j] = 2;
                    cnt1++;
                }
            }
        }
        if (cnt1 > cnt0 || cnt0 - 1 > cnt1) {
            return false;
        }
        if (cnt0 <= 2 || cnt0 == 3 && cnt1 == 2) {
            return true;
        }
        if (cnt0 - 1 == cnt1) {
            // 只需判断O一定不能赢
            return win(matrix, 2);
        }
        else {
            // 只需判断X一定不能赢
            return win(matrix, 1);
        }
    }

    public boolean win(int[][] qipan, int winner) {
        if (qipan[0][0] != 0 &&
                (qipan[0][0] == qipan[0][1] && qipan[0][0] == qipan[0][2] ||
                        qipan[0][0] == qipan[1][0] && qipan[0][0] == qipan[2][0])) {
            if (qipan[0][0] == winner) {
                return true;
            }
        }
        if (qipan[2][2] != 0 &&
                (qipan[2][2] == qipan[0][2] && qipan[2][2] == qipan[1][2] ||
                        qipan[2][2] == qipan[2][0] && qipan[2][2] == qipan[2][1])) {
            if (qipan[2][2] == winner) {
                return true;
            }
        }
        if (qipan[1][1] != 0 &&
                (qipan[1][1] == qipan[0][0] && qipan[1][1] == qipan[2][2] ||
                        qipan[1][1] == qipan[0][1] && qipan[1][1] == qipan[2][1] ||
                        qipan[1][1] == qipan[0][2] && qipan[1][1] == qipan[2][0] ||
                        qipan[1][1] == qipan[1][0] && qipan[1][1] == qipan[1][2])) {
            if (qipan[1][1] == winner) {
                return true;
            }
        }
        return false;
    }
}
