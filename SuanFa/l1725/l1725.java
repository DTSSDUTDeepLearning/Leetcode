package SuanFa.l1725;

public class l1725 {

    public int countGoodRectangles(int[][] rectangles) {
        int maxlen = 0;
        int cnt = 0;
        for (int[] rectangle : rectangles) {
            int len = Math.min(rectangle[0], rectangle[1]);
            if (maxlen == len) {
                cnt++;
            }
            else if (maxlen < len) {
                maxlen = len;
                cnt = 1;
            }
        }
        return cnt;
    }
}
