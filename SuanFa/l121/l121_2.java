package SuanFa.l121;

public class l121_2 {

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int win = 0;
        int min = prices[0];
        for (int i = 1;i < prices.length;i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            else if ((prices[i] - min) > win) {
                win = prices[i] - min;
            }
        }
        return win;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
