package SuanFa.l059;

import java.util.ArrayList;
import java.util.List;

public class l059 {

    // 只使用第54题的按层模拟方法改编
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int k = 1;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        while (k <= n*n) {
            for (int column = left; column <= right; column++) {
                matrix[top][column] = k++;
            }
            for (int row = top + 1; row <= bottom; row++) {
                matrix[row][right] = k++;
            }
            if (left < right && top < bottom) {
                for (int column = right - 1; column > left; column--) {
                    matrix[bottom][column] = k++;
                }
                for (int row = bottom; row > top; row--) {
                    matrix[row][left] = k++;
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return matrix;
    }
}
