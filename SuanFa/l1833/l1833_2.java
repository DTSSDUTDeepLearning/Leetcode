package SuanFa.l1833;

import java.util.Arrays;

public class l1833_2 {

    // 计数排序
    public int maxIceCream(int[] costs, int coins) {
        int[] c = new int[100000];
        for (int cost : costs) {
            c[cost-1]++;
        }
        int cnt = 0;
        int i = 0;
        while (coins >= i+1 && i < 100000) {
            while (coins >= i+1 && i < 100000 && c[i] == 0) {
                i++;
            }
            if (i == 100000) {
                return cnt;
            }
            if (coins >= i+1) {
                int n = Math.min(coins/(i+1), c[i]);
                cnt += n;
                coins -= n * (++i);
            }
        }
        return cnt;
    }
}
