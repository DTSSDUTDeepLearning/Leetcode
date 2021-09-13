package SuanFa.l309;

public class l309 {

    public int maxProfit(int[] prices) {
        int len = prices.length;
        int a = -prices[0]; // 当天持有股票
        int b = 0; // 当天不持有股票，且处于冷冻期（其实第0天不存在这种情况，但为了迭代方便，设为0）
        int c = 0; // 当天不持有股票，且不处于冷冻期
        for (int i = 1;i < len;i++) {
            int a_tmp = Math.max(a, c-prices[i]);
            int b_tmp = a + prices[i];
            int c_tmp = Math.max(b, c);
            a = a_tmp;
            b = b_tmp;
            c = c_tmp;
        }
        return Math.max(b, c);
    }
}
