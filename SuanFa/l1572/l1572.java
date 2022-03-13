package SuanFa.l1572;

public class l1572 {

    public int diagonalSum(int[][] mat) {
        int len = mat.length;
        int sum = 0;
        for (int i = 0;i < len;i++) {
            sum += mat[i][i];
            sum += mat[i][len-i-1];
        }
        if (len % 2 == 1) {
            sum -= mat[len/2][len/2];
        }
        return sum;
    }
}
