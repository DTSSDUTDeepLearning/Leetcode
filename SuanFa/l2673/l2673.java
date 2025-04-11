package l2673;

public class l2673 {

    public int minIncrements(int n, int[] cost) {
        int result = 0;
        for (int i = n-2;i > 0;i-=2) {
            result += Math.abs(cost[i] - cost[i+1]);
            cost[i/2] += Math.max(cost[i], cost[i+1]);
        }
        return result;
    }
}
