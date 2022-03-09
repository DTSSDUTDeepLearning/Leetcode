package SuanFa.l1275;

public class l1275 {

    public String tictactoe(int[][] moves) {
        int[][] qipan = new int[3][3];
        int len = moves.length;
        for (int i = 0;i < len;i++) {
            qipan[moves[i][0]][moves[i][1]] = i%2==0?1:2;
        }
        if (qipan[0][0] != 0 &&
                (qipan[0][0] == qipan[0][1] && qipan[0][0] == qipan[0][2] ||
                qipan[0][0] == qipan[1][0] && qipan[0][0] == qipan[2][0])) {
            if (qipan[0][0] == 1) {
                return "A";
            }
            else {
                return "B";
            }
        }
        else if (qipan[2][2] != 0 &&
                (qipan[2][2] == qipan[0][2] && qipan[2][2] == qipan[1][2] ||
                qipan[2][2] == qipan[2][0] && qipan[2][2] == qipan[2][1])) {
            if (qipan[2][2] == 1) {
                return "A";
            }
            else {
                return "B";
            }
        }
        else if (qipan[1][1] != 0 &&
                (qipan[1][1] == qipan[0][0] && qipan[1][1] == qipan[2][2] ||
                qipan[1][1] == qipan[0][1] && qipan[1][1] == qipan[2][1] ||
                qipan[1][1] == qipan[0][2] && qipan[1][1] == qipan[2][0] ||
                qipan[1][1] == qipan[1][0] && qipan[1][1] == qipan[1][2])) {
            if (qipan[1][1] == 1) {
                return "A";
            }
            else {
                return "B";
            }
        }
        else if (moves.length == 9) {
            return "Draw";
        }
        else {
            return "Pending";
        }
    }
}
