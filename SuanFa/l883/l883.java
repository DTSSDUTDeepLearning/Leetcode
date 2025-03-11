package l883;

public class l883 {

    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int result = 0;
        for (int[] ints : grid) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                if (ints[j] != 0) {
                    result++;
                }
                max = Math.max(max, ints[j]);
            }
            result += max;
        }
        for (int j = 0;j < n;j++) {
            int max = 0;
            for (int[] ints : grid) {
                max = Math.max(max, ints[j]);
            }
            result += max;
        }
        return result;
    }
}
