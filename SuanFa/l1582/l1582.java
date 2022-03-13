package SuanFa.l1582;

import java.util.HashSet;
import java.util.Set;

public class l1582 {

    public int numSpecial(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int cnt = 0;
        Set<Integer> s = new HashSet<>();
        for (int j = 0;j < col;j++) {
            int i = 0;
            while (i < row && mat[i][j] == 0) {
                i++;
            }
            if (i < row) {
                boolean flag = true;
                for (int k = i+1;k < row;k++) {
                    if (mat[k][j] == 1) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    s.add(j);
                }
            }
        }
        for (int i = 0;i < row;i++) {
            int j = 0;
            while (j < col && mat[i][j] == 0) {
                j++;
            }
            if (j < col) {
                boolean flag = true;
                for (int k = j+1;k < col;k++) {
                    if (mat[i][k] == 1) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    if (s.contains(j)) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
