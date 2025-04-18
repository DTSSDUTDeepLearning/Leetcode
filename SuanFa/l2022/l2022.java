package l2022;

public class l2022 {

    public int[][] construct2DArray(int[] original, int m, int n) {
        int len = original.length;
        if (len != m * n) {
            return new int[][]{};
        }
        else {
            int[][] result = new int[m][n];
            int index = 0;
            for (int i = 0;i < m;i++) {
                for (int j = 0;j < n;j++) {
                    result[i][j] = original[index++];
                }
            }
            return result;
        }
    }
}