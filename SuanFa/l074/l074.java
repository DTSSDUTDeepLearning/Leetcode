package SuanFa.l074;

public class l074 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int len1 = matrix.length;
        if (len1 == 0) {
            return false;
        }
        int len2 = matrix[0].length;
        if (len2 == 0) {
            return false;
        }
        if (matrix[0][0] > target || matrix[len1-1][len2-1] < target) {
            return false;
        }
        int up = 0;
        int down = len1-1;
        int middle1 = (up+down)/2;
        while (up < down) {
            if (matrix[middle1][len2-1] < target) {
                up = middle1+1;
            }
            else if (matrix[middle1][0] > target) {
                down = middle1-1;
            }
            else {
                break;
            }
            middle1 = (up+down)/2;
        }
        int left = 0;
        int right = len2-1;
        int middle2 = (left+right)/2;
        while (left <= right) {
            if (matrix[middle1][middle2] == target) {
                return true;
            }
            if (matrix[middle1][middle2] < target) {
                left = middle2+1;
            }
            else if (matrix[middle1][middle2] > target) {
                right = middle2-1;
            }
            middle2 = (left+right)/2;
        }
        return false;
    }

}
