package SuanFa.l1014;

public class l1014 {

    public int maxScoreSightseeingPair(int[] values) {
        int len = values.length;
        int max = 0;
        int max_i = values[0] + 0;
        for (int i = 1;i < len;i++) {
            max = Math.max(max, max+values[i]-i);
            max_i = Math.max(max_i, values[i]+i);
        }
        return max;
    }
}
