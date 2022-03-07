package SuanFa.l1094;

import java.util.Comparator;
import java.util.PriorityQueue;

public class l1094 {

    public boolean carPooling(int[][] trips, int capacity) {
        int[] on = new int[1001];
        int[] off = new int[1001];
        int min_on = 1000;
        int max_on = 0;
        for (int[] trip : trips) {
            on[trip[1]]+=trip[0];
            off[trip[2]]+=trip[0];
            min_on = Math.min(min_on, trip[1]);
            max_on = Math.max(max_on, trip[1]);
        }
        int people = 0;
        for (int i = min_on;i <= max_on;i++) {
            people+=on[i];
            people-=off[i];
            if (people > capacity) {
                return false;
            }
        }
        return true;
    }
}
