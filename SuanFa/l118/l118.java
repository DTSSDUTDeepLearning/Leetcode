package SuanFa.l118;

import java.util.ArrayList;
import java.util.List;

public class l118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return result;
        }
        int[][] yanghui = new int[numRows][numRows];
        yanghui[0][0] = 1;
        for (int i = 1;i < numRows;i++) {
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;
        }
        for (int i = 2;i < numRows;i++) {
            for (int j = 1;j < i;j++) {
                yanghui[i][j] = yanghui[i-1][j-1]+yanghui[i-1][j];
            }
        }

        for (int i = 0;i < numRows;i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0;j <= i;j++) {
                row.add(yanghui[i][j]);
            }
            result.add(row);
        }
        return result;
    }
}
