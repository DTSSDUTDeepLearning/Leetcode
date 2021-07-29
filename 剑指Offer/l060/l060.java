package JianZhiOffer.l060;

public class l060 {

    public double[] dicesProbability(int n) {
        double[] pre = new double[5*n+1];
        for (int i = 0;i < 6;i++) {
            pre[i] = 1.0/6;
        }
        for (int i = 2;i <= n;i++) {
            double[] curr = new double[5*n+1];
            for (int j = 0;j < 6;j++) {
                for (int k = 0;k <= j;k++) {
                    curr[j]+=pre[k];
                }
                curr[j]/=6;
            }
            for (int j = 6;j < 5*i+1;j++) {
                for (int k = j-5;k <= j;k++) {
                    curr[j]+=pre[k];
                }
                curr[j]/=6;
            }
            pre = curr;
        }
        return pre;
    }
}
