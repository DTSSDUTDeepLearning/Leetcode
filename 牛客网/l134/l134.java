package NowCoder.l134;

public class l134 {

    public int maxProfit (int[] prices) {
        int len = prices.length;
        if (len <= 1) {
            return 0;
        }
        int total = 0;
        int min = prices[0];
        for (int i = 1;i < len;i++) {
            if (prices[i] < prices[i-1]) {
                total+=(prices[i-1]-min);
                min = prices[i];
            }
        }
        return total+(prices[len-1]-min);
    }
}
