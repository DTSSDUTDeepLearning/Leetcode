package JianZhiOffer.l063;

public class l063 {

    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 0) {
            return 0;
        }
        int own = 0;
        int buy = prices[0];
        for (int i = 1;i < len;i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            else if (prices[i] - buy > own) {
                own = prices[i]-buy;
            }
        }
        return own;
    }
}
