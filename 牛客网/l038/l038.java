package NowCoder.l038;

import java.util.ArrayList;

public class l038 {

    // 同SuanFa.l054
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> l = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return l;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;
        while (left <= right && top <= bottom) {
            for (int j = left;j <= right;j++) {
                l.add(matrix[top][j]);
            }
            for (int i = top+1;i <= bottom;i++) {
                l.add(matrix[i][right]);
            }
            if (left < right && top < bottom) {
                for (int j = right-1;j > left;j--) {
                    l.add(matrix[bottom][j]);
                }
                for (int i = bottom;i > top;i--) {
                    l.add(matrix[i][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return l;
    }
}
