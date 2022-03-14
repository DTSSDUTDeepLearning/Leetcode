package SuanFa.l1626;

import java.util.Arrays;
import java.util.Comparator;

public class l1626 {

    public int bestTeamScore(int[] scores, int[] ages) {
        int len = scores.length;
        int[][] people = new int[len][2];
        for (int i = 0;i < len;i++) {
            people[i][0] = ages[i];
            people[i][1] = scores[i];
        }
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                }
                else {
                    return o1[1] - o2[1];
                }
            }
        });
        int[] dp = new int[len];
        int max = 0;
        for (int i = 1;i < len;i++) {
            for (int j = i - 1;j >= 0;j--) {
                if (people[j][1] <= people[i][1]) {
                    dp[i] = Math.max(dp[j], dp[i]);
                }
            }
            dp[i] += people[i][1];
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
