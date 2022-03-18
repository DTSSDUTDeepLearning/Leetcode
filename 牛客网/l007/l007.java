package NowCoder.l007;

public class l007 {

    public int maxProfit (int[] prices) {
        int len = prices.length;
        if (len <= 1) {
            return 0;
        }
        int[] results = new int[len];
        results[0] = 0;
        int min = prices[0];
        for (int i = 1;i < len;i++) {
            if (min <= prices[i]) {
                results[i] = Math.max(results[i-1], prices[i]-min);
            }
            else {
                results[i] = results[i-1];
                min = prices[i];
            }
        }
        return results[len-1];
    }
}
