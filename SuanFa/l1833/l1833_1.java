package SuanFa.l1833;

import java.util.Arrays;

public class l1833_1 {

    // 普通排序
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int len = costs.length;
        int sum = 0;
        for (int i = 0;i < len;i++) {
            if (sum + costs[i] > coins) {
                return i + 1;
            }
            else {
                sum+=costs[i];
            }
        }
        return len;
    }
}
