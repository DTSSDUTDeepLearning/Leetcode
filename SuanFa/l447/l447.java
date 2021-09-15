package SuanFa.l447;

import java.util.HashMap;
import java.util.Map;

public class l447 {

    public int numberOfBoomerangs(int[][] points) {
        int cnt = 0;
        int len = points.length;
        for (int[] point : points) {
            Map<Integer, Integer> m = new HashMap<>();
            for (int[] p : points) {
                int x = point[0] - p[0];
                int y = point[1] - p[1];
                int dis = x * x + y * y;
                m.put(dis, m.getOrDefault(dis, 0)+1);
            }
            for (int value : m.values()) {
                cnt += value * (value - 1);
            }
        }
        return cnt;
    }
}
