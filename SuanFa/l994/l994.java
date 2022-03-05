package SuanFa.l994;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class l994 {

    int[] longitude = {-1, 1, 0, 0};
    int[] latitude = {0, 0, -1, 1};

    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        Map<int[], Integer> m = new HashMap<>();
        int time = 0;
        for (int i = 0;i < row;i++) {
            for (int j = 0;j < col;j++) {
                if (grid[i][j] == 2) {
                    int[] tmp = {i, j};
                    q.offer(tmp);
                    m.put(tmp, time);
                }
            }
        }

        while (!q.isEmpty()) {
            int[] coordinate = q.poll();
            int longt = coordinate[0];
            int lat = coordinate[1];
            for (int i = 0;i < 4;i++) {
                int new_longt = longt+longitude[i];
                int new_lat = lat+latitude[i];
                if (new_longt >= 0 && new_longt < row && new_lat >= 0 && new_lat < col && grid[new_longt][new_lat] == 1) {
                    grid[new_longt][new_lat] = 2;
                    int[] tmp = {new_longt, new_lat};
                    q.offer(tmp);
                    time = m.get(new int[]{longt, lat});
                    m.put(tmp, time+1);
                }
            }
        }
        for (int i = 0;i < row;i++) {
            for (int j = 0;j < col;j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return time;
    }
}
