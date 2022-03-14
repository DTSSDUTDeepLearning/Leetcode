package SuanFa.l1798;

import java.util.Arrays;

public class l1798 {

    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        int sum = 1;
        for (int coin : coins) {
            if (coin > sum) {
                return sum;
            }
            else {
                sum+=coin;
            }
        }
        return sum;
    }
}
