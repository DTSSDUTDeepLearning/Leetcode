package SuanFa.l221;

public class l221 {

    public int maximalSquare(char[][] matrix) {
        int row = matrix.length;
        if (row == 0) {
            return 0;
        }
        int col = matrix[0].length;
        if (col == 0) {
            return 0;
        }
        int[] result = new int[col];
        int max = 0;
        for (int j = 0;j < col;j++) {
            if (matrix[0][j] == '1') {
                result[j] = 1;
                max = 1;
            }
        }
        for (int i = 1;i < row;i++) {
            int tmp1 = result[0];
            result[0] = (matrix[i][0] == '1')?1:0;
            if (result[0] > max) {
                max = result[0];
            }
            for (int j = 1;j < col;j++) {
                int tmp2 = result[j];
                result[j] = matrix[i][j] == '1'?Math.min(Math.min(tmp1, result[j-1]), tmp2)+1:0;
                if (result[j] > max) {
                    max = result[j];
                }
                tmp1 = tmp2;
            }
        }
        return max*max;
    }
}
