package l2008;

import java.util.*;

public class l2008 {

    public long maxTaxiEarnings(int n, int[][] rides) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0;i < rides.length;i++) {
            map.putIfAbsent(rides[i][1], new ArrayList<>());
            map.get(rides[i][1]).add(i);
        }
        long[] dp = new long[n+1];
        dp[0] = 0;
        for (int i = 1;i <= n;i++) {
            dp[i] = dp[i-1];
            for (int j : map.getOrDefault(i, new ArrayList<>())) {
                dp[i] = Math.max(dp[i], dp[rides[j][0]] + rides[j][1] - rides[j][0] + rides[j][2]);
            }
        }
        return dp[n];
    }
}
