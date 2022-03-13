package SuanFa.l1578;

public class l1578 {

    public int minCost(String s, int[] cost) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        int sum = 0;
        int i = 0;
        while (i < len) {
            char c = cs[i];
            int max = 0;
            while (i < len && cs[i] == c) {
                max = Math.max(max, cost[i]);
                sum+=cost[i];
                i++;
            }
            sum-=max;
        }
        return sum;
    }
}
