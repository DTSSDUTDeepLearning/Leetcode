package SuanFa.l1605;

public class l1605 {

    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int row = rowSum.length;
        int col = colSum.length;
        int[][] result = new int[row][col];
        int i = 0;
        int j = 0;
        while (i < row && j < col) {
            if (rowSum[i] < colSum[j]) {
                result[i][j] = rowSum[i];
                colSum[j] -= rowSum[i];
                i++;
            }
            else {
                result[i][j] = colSum[j];
                rowSum[i] -= colSum[j];
                j++;
            }
        }
        return result;
    }
}
