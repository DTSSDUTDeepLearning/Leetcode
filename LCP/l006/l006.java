package LCP.l006;

public class l006 {

    public int minCount(int[] coins) {
        int sum = 0;
        for (int coin : coins) {
            sum += (coin + 1) / 2;
        }
        return sum;
    }
}
