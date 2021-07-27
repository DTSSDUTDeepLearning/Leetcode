package JianZhiOffer.l029;

import java.util.LinkedList;
import java.util.List;

public class l029 {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m*n];
        int left = 0;
        int right = n-1;
        int up = 0;
        int down = m-1;
        int index = 0;
        while (left <= right && up <= down) {
            for (int column = left; column <= right; column++) {
                result[index++] = matrix[up][column];
            }
            for (int row = up + 1; row <= down; row++) {
                result[index++] = matrix[row][right];
            }
            if (left < right && up < down) {
                for (int column = right - 1; column > left; column--) {
                    result[index++] = matrix[down][column];
                }
                for (int row = down; row > up; row--) {
                    result[index++] = matrix[row][left];
                }
            }
            left++;
            right--;
            up++;
            down--;
        }
        return result;
    }
}
