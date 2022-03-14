package SuanFa.l1637;

import java.util.Arrays;
import java.util.Comparator;

public class l1637 {

    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int max = 0;
        int len = points.length;
        for (int i = 1;i < len;i++) {
            max = Math.max(max, points[i][0]-points[i-1][0]);
        }
        return max;
    }
}
