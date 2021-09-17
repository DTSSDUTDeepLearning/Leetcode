package SuanFa.l518;

import java.util.Arrays;

public class l518 {

    public int change(int amount, int[] coins) {
        int[] result = new int[amount+1];
        result[0] = 1;
        for (int coin : coins) {
            for (int i = coin;i <= amount;i++) {
                result[i] += result[i - coin];
            }
        }
        return result[amount];
    }
}
