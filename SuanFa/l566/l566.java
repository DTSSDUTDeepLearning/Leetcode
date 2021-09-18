package SuanFa.l566;

public class l566 {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if (row*col!=r*c) {
            return nums;
        }
        int[][] results = new int[r][c];
        int n1 = 0;
        int r1 = 0;
        int n2 = 0;
        int r2 = 0;
        while (n1 < row*col) {
            results[r2][n2 % c] = nums[r1][n1 % col];
            if (n1 % col == col-1) {
                r1++;
            }
            if (n2 % c == c-1) {
                r2++;
            }
            n1++;
            n2++;
        }
        return results;
    }
}
