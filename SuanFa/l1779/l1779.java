package SuanFa.l1779;

public class l1779 {

    public int nearestValidPoint(int x, int y, int[][] points) {
        int min_dis = Integer.MAX_VALUE;
        int result = -1;
        int len = points.length;
        for (int i = 0;i < len;i++) {
            if (points[i][0] == x) {
                int dis = Math.abs(points[i][1] - y);
//                if (dis == 0) {
//                    return i;
//                }
                if (dis < min_dis) {
                    min_dis = dis;
                    result = i;
                }
            }
            else if (points[i][1] == y) {
                int dis = Math.abs(points[i][0] - x);
//                if (dis == 0) {
//                    return i;
//                }
                if (dis < min_dis) {
                    min_dis = dis;
                    result = i;
                }
            }
        }
        return result;
    }
}
