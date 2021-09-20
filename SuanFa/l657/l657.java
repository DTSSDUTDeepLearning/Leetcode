package SuanFa.l657;

public class l657 {

    public boolean judgeCircle(String moves) {
        int len = moves.length();
        int row = 0;
        int col = 0;
        for (int i = 0;i < len;i++) {
            char c = moves.charAt(i);
            if (c == 'R') {
                row--;
            }
            else if (c == 'L') {
                row++;
            }
            else if (c == 'U') {
                col++;
            }
            else if (c == 'D') {
                col--;
            }
        }
        if (row == 0 && col == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
