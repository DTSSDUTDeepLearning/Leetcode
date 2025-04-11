package l2711;

import java.util.HashSet;
import java.util.Set;

public class l2711 {

    int m;
    int n;
    int[][] grid;
    int[][] result;

    public int[][] differenceOfDistinctValues(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        this.grid = grid;
        result = new int[m][n];
        for (int i = 0;i < m;i++) {
            addSetSize(i, 0);
        }

        for (int j = 1;j < n;j++) {
            addSetSize(0, j);
        }

        for (int i = 0;i < m;i++) {
            decreaseSetSize(i, n-1);
        }

        for (int j = n-2;j >= 0;j--) {
            decreaseSetSize(m-1, j);
        }

        return result;
    }

    private void addSetSize(int x, int y) {
        Set<Integer> set = new HashSet<>();
        while (x < m && y < n) {
            result[x][y] += set.size();
            set.add(grid[x][y]);
            x++;
            y++;
        }
    }

    private void decreaseSetSize(int x, int y) {
        Set<Integer> set = new HashSet<>();
        while (x >= 0 && y >= 0) {
            result[x][y] -= set.size();
            result[x][y] = Math.abs(result[x][y]);
            set.add(grid[x][y]);
            x--;
            y--;
        }
    }
}
