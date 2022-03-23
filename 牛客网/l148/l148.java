package NowCoder.l148;

public class l148 {

    public int Jump (int n, int[] A) {
        int curr = 0;
        int farthest = 0;
        int step = 0;
        for (int i = 0;i < n-1;i++) {
            farthest = Math.max(farthest, i+A[i]);
            if (curr >= n) {
                break;
            }
            if(curr == i) {
                curr = farthest;
                step++;
            }
        }
        return step;
    }
}
