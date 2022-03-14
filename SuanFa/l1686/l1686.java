package SuanFa.l1686;

import java.util.Arrays;
import java.util.Comparator;

public class l1686 {

    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        int len = aliceValues.length;
        int[][] c = new int[len][2];
        for (int i = 0;i < len;i++) {
            c[i] = new int[]{aliceValues[i] + bobValues[i], i};
        }
        Arrays.sort(c, (o1, o2) -> o2[0]-o1[0]);
        int sum_a = 0;
        int sum_b = 0;
        for (int i = 0;i < (len+1)/2;i++) {
            sum_a += aliceValues[c[2*i][1]];
        }
        for (int i = 0;i < len/2;i++) {
            sum_b += bobValues[c[2*i+1][1]];
        }
        if (sum_a == sum_b) {
            return 0;
        }
        else if (sum_a < sum_b) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
