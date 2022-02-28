package SuanFa.l799;

public class l799 {

    public double champagneTower(int poured, int query_row, int query_glass) {
        double[] wine = new double[query_row+1];
        wine[0] = poured;
        for (int i = 1;i <= query_row;i++) {
            for (int j = i;j >= 0;j--) {
                if (wine[j] > 1.0) {
                    double out = (wine[j]-1.0)/2.0;
                    wine[j+1]+=out;
                    wine[j] = out;
                }
                else {
                    wine[j] = 0.;
                }
            }
        }
        return Math.min(1., wine[query_glass]);
    }
}
