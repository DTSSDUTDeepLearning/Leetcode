package SuanFa.l1380;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class l1380 {

    public List<Integer> luckyNumbers (int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] row_min = new int[row];
        Arrays.fill(row_min, 100001);
        int[] col_max = new int[col];
        for (int i = 0;i < row;i++) {
            for (int j = 0;j < col;j++) {
                row_min[i] = Math.min(row_min[i], matrix[i][j]);
                col_max[i] = Math.max(col_max[i], matrix[i][j]);
            }
        }
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (matrix[i][j] == row_min[i] && matrix[i][j] == col_max[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
    }
}
