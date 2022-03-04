package SuanFa.l910;

import java.util.Arrays;

public class l910 {

    public int smallestRangeII(int[] A, int K) {
        int len = A.length;
        Arrays.sort(A);
        int sub = A[len-1]-A[0];
        for (int i = 0;i < len-1;i++) {
            int max = Math.max(A[i]+K, A[len-1]-K);
            int min = Math.min(A[0]+K, A[i+1]-K);
            sub = Math.min(sub, max-min);
        }
        return sub;
    }
}
