package SuanFa.l714;

public class l714 {

    public int maxProfit(int[] prices, int fee) {
        int total = 0;
        int min = prices[0]+fee;
        for (int i = 1;i < prices.length;i++) {
            if (prices[i]+fee < min) {
                min = prices[i]+fee;
            }
            else if (min < prices[i]){
                total += (prices[i] - min);
                min = prices[i];
            }
        }
        return total;
    }
}
