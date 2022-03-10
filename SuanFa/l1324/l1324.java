package SuanFa.l1324;

import java.util.LinkedList;
import java.util.List;

public class l1324 {

    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int row = words.length;
        int col = 0;
        for (String word : words) {
            col = Math.max(col, word.length());
        }
        char[][] cs = new char[row][col];
        for (int i = 0;i < row;i++) {
            String word = words[i];
            char[] ws = word.toCharArray();
            int w_len = ws.length;
            for (int j = 0;j < w_len;j++) {
                cs[i][j] = ws[j];
            }
            for (int j = w_len;j < col;j++) {
                cs[i][j] = ' ';
            }
        }
        List<String> result = new LinkedList<>();
        for (int j = 0;j < col;j++) {
            StringBuilder sb = new StringBuilder();
            int start = -1;
            int end = -1;
            for (int i = 0;i < row;i++) {
                if (cs[i][j] != ' ') {
                    if (start == -1) {
                        start = i;
                        for (int k = 0;k < start;k++) {
                            sb.append(' ');
                        }
                    }
                    else {
                        end = start;
                        start = i;
                        for (int k = end;k < start;k++) {
                            sb.append(' ');
                        }
                    }
                    sb.append(cs[i][j]);
                }
            }
            result.add(sb.toString());
        }
        return result;
    }
}
