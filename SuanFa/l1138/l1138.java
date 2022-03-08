package SuanFa.l1138;

public class l1138 {

    public String alphabetBoardPath(String target) {
        int row = 0;
        int col = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : target.toCharArray()) {
            if (row == 5) {
                if (c == 'z') {
                    sb.append('!');
                }
                else {
                    int new_row = (c-'a')/5;
                    for (int i = 0;i < row-new_row;i++) {
                        sb.append('U');
                    }
                    int new_col = (c-'a')%5;
                    for (int i = 0;i < new_col;i++) {
                        sb.append('R');
                    }
                    sb.append('!');
                    row = new_row;
                    col = new_col;
                }
            }
            else if (c == 'z') {
                for (int i = 0;i < col;i++) {
                    sb.append('L');
                }
                for (int i = 0;i < 5-row;i++) {
                    sb.append('D');
                }
                sb.append('!');
                row = 5;
                col = 0;
            }
            else {
                int new_row = (c-'a')/5;
                int new_col = (c-'a')%5;
                if (new_row < row) {
                    for (int i = 0;i < row-new_row;i++) {
                        sb.append('U');
                    }
                }
                else {
                    for (int i = 0;i < new_row-row;i++) {
                        sb.append('D');
                    }
                }
                if (new_col < col) {
                    for (int i = 0;i < col-new_col;i++) {
                        sb.append('L');
                    }
                }
                else {
                    for (int i = 0;i < new_col-col;i++) {
                        sb.append('R');
                    }
                }
                sb.append('!');
                row = new_row;
                col = new_col;
            }
        }
        return sb.toString();
    }
}
