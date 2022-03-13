package SuanFa.l1561;

import java.util.Arrays;

public class l1561 {

    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length/3;
        int sum = 0;
        for (int i = n;i < 3*n;i+=2) {
            sum+=piles[i];
        }
        return sum;
    }
}
