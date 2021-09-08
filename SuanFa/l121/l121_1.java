package SuanFa.l121;

public class l121_1 {
    //使用动态规划，若创建二维数组，内存会溢出（有一个len非常大的case）
    //只需维护一个max即可
    public static int maxProfit(int[] prices) {

        int len = prices.length;
        int max = 0;
        for (int i = 0;i < len-1;i++) {
            for (int j = i+1;j < len;j++) {
                if ((prices[j] - prices[i]) > max) {
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
