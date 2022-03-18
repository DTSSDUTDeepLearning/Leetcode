package SuanFa.l1996;

import java.util.Arrays;
import java.util.Comparator;

public class l1996 {

    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o2[0] - o1[0];
                }
                else {
                    return o1[1] - o2[1];
                }
            }
        });
        int maxDefense = Integer.MIN_VALUE;
        int cnt = 0;
        for (int[] pro : properties) {
            if (maxDefense > pro[1]) {
                cnt++;
            }
            else {
                maxDefense = pro[1];
            }
        }
        return cnt;
    }
}
