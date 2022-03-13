package SuanFa.l1503;

public class l1503 {

    public int getLastMoment(int n, int[] left, int[] right) {
        int left_max = 0;
        int right_min = n;
        for (int num : left) {
            left_max = Math.max(left_max, num);
        }
        for (int num : right) {
            right_min = Math.min(right_min, num);
        }
        return Math.max(left_max, n-right_min);
    }
}
