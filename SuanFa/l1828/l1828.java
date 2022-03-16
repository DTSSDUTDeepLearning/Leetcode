package SuanFa.l1828;

public class l1828 {

    public int[] countPoints(int[][] points, int[][] queries) {
        int len = queries.length;
        int[] cnt = new int[len];
        for (int[] point : points) {
            for (int i = 0;i < len;i++) {
                if ((point[0]-queries[i][0]) * (point[0]-queries[i][0]) + (point[1]-queries[i][1]) * (point[1]-queries[i][1]) <= queries[i][2] * queries[i][2]) {
                    cnt[i]++;
                }
            }
        }
        return cnt;
    }
}
