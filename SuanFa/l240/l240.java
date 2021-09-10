package SuanFa.l240;

public class l240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int len1 = matrix.length;
        if (len1 == 0) {
            return false;
        }
        int len2 = matrix[0].length;
        if (len2 == 0) {
            return false;
        }
        int row = 0;
        int col = len2-1;
        while (row < len1 && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] < target) {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
}
