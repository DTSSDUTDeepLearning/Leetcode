package SuanFa.l646;

import java.util.Arrays;
import java.util.Comparator;

public class l646 {

    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));
        int second = Integer.MIN_VALUE;
        int cnt = 0;
        for (int[] pair : pairs) {
            if (second < pair[0]) {
                second = pair[1];
                cnt++;
            }
        }
        return cnt;
    }
}
