package MianShiTi.t08.l002;

import java.util.LinkedList;
import java.util.List;

public class l002 {

    public List<List<Integer>> pathWithObstacles(int[][] obstacleGrid) {
        List<List<Integer>> result = new LinkedList<>();
        int m = obstacleGrid.length;
        if (m == 0) {
            return result;
        }
        int n = obstacleGrid[0].length;
        if (n == 0 || obstacleGrid[0][0] == 1) {
            return result;
        }
        int[][] dp = new int[m][n];
        for (int i = 0;i < m;i++) {
            if (obstacleGrid[i][0] == 0) {
                dp[i][0] = 1;
            }
            else {
                break;
            }
        }
        for (int j = 1;j < n;j++) {
            if (obstacleGrid[0][j] == 0) {
                dp[0][j] = 1;
            }
            else {
                break;
            }
        }
        for (int i = 1;i < m;i++) {
            for (int j = 1;j < n;j++) {
                if (obstacleGrid[i][j] != 0) {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
                else {
                    dp[i][j] = 0;
                }
            }
        }
        if (dp[m-1][n-1] == 0) {
            return result;
        }
        else {
            int i = m-1;
            int j = n-1;
            while (i >= 1 && j >= 1) {
                result.add(0, make(i, j));
                if (dp[i-1][j] >= dp[i][j-1]) {
                    i--;
                }
                else {
                    j--;
                }
            }
            if (i == 0) {
                for (int k = j;k >= 0;k--) {
                    result.add(0, make(0, k));
                }
            }
            else {
                for (int k = i;k >= 0;k--) {
                    result.add(0, make(k, 0));
                }
            }
            return result;
        }
    }

    public List<Integer> make(int i, int j) {
        List<Integer> l = new LinkedList<>();
        l.add(i);
        l.add(j);
        return l;
    }
}
