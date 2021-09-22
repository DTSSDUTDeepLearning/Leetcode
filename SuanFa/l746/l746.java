package SuanFa.l746;

public class l746 {

    public static int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] ans = new int[len];
        for (int i = 2;i < len;i++) {
            ans[i] = Math.min(ans[i-2]+cost[i-2], ans[i-1]+cost[i-1]);
        }
        return Math.min(ans[len-2]+cost[len-2], ans[len-1]+cost[len-1]);
    }

    public static void main(String[] args) {
        int[] cost1 = {10, 15, 20};
        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(cost1));
        System.out.println(minCostClimbingStairs(cost2));
    }
}
