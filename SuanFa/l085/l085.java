package SuanFa.l085;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class l085 {

    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        if (m == 0) {
            return 0;
        }
        int n = matrix[0].length;
        if (n == 0) {
            return 0;
        }
        int[][] left = new int[m][n];
        for (int i = 0;i < m;i++) {
            left[i][0] = matrix[i][0] == '1' ? 1 : 0;
            for (int j = 1;j < n;j++) {
                left[i][j] = matrix[i][j] == '1' ? left[i][j-1] + 1 : 0;
            }
        }
        int max = 0;
        for (int j = 0;j < n;j++) {
            int[] up = new int[m];
            int[] down = new int[m];
            Arrays.fill(down, m);
            Deque<Integer> s = new LinkedList<>();
            for (int i = 0;i < m;i++) {
                while (!s.isEmpty() && left[s.peek()][j] >= left[i][j]) {
                    down[s.poll()] = i;
                }
                up[i] = s.isEmpty() ? -1 : s.peek();
                s.push(i);
            }
            for (int i = 0;i < m;i++) {
                max = Math.max(max, (down[i] - up[i] - 1) * left[i][j]);
            }
        }
        return max;
    }

}
