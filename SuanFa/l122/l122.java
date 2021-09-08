package SuanFa.l122;

public class l122 {

    public static int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 1) {
            return 0;
        }
        int total = 0;
        int left = 0;
        int right = 1;
        for (;right<len;right++) {
            if (prices[right-1] > prices[right]) {
                total += (prices[right-1] - prices[left]);
                left = right;
            }
        }
        if (prices[len-2] <= prices[len-1]) {
            total += (prices[len-1] - prices[left]);
        }
        return total;
    }

    public static void main(String[] args) {
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {1,2,3,4,5};
        int[] prices3 = {7,6,4,3,1};
        int[] prices4 = {1};
        int[] prices5 = {1,9,6,9,1,7,1,1,5,9,9,9};
        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
        System.out.println(maxProfit(prices3));
        System.out.println(maxProfit(prices4));
        System.out.println(maxProfit(prices5));
    }
}
