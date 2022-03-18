package SuanFa.l1921;

import java.util.Arrays;

public class l1921 {

    public int eliminateMaximum(int[] dist, int[] speed) {
        int len = dist.length;
        int[] minute = new int[len];
        for (int i = 0;i < len;i++) {
            minute[i] = (dist[i] - 1) / speed[i];
        }
        Arrays.sort(minute);
        for (int i = 0;i < len;i++) {
            if (minute[i] < i) {
                return i;
            }
        }
        return len;
    }
}
