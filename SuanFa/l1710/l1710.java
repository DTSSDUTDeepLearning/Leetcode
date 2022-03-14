package SuanFa.l1710;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class l1710 {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        int total_weight = 0;
        int total_count = 0;
        int len = boxTypes.length;
        for (int i = 0;i < len;i++) {
            if (total_count + boxTypes[i][0] <= truckSize) {
                total_count += boxTypes[i][0];
                total_weight += boxTypes[i][0] * boxTypes[i][1];
            }
            else {
                total_weight += (truckSize - total_count) * boxTypes[i][1];
                break;
            }
        }
        return total_weight;
    }
}
