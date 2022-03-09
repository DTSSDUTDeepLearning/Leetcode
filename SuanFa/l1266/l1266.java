package SuanFa.l1266;

public class l1266 {

    public int minTimeToVisitAllPoints(int[][] points) {
        int len = points.length;
        int cnt = 0;
        for (int i = 1;i < len;i++) {
            cnt += Math.max(Math.abs(points[i-1][0] - points[i][0]), Math.abs(points[i-1][1] - points[i][1]));
        }
        return cnt;
    }
}
