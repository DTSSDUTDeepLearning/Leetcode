package SuanFa.l795;

public class l795 {

    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        return less(A, R)-less(A, L-1);
    }

    public static int less(int[] A, int ceil) {
        int cnt = 0;
        int tmp = 0;
        for (int a : A) {
            if (a <= ceil) {
                tmp++;
            }
            else {
                tmp = 0;
            }
            cnt+=tmp;
        }
        return cnt;
    }
}
