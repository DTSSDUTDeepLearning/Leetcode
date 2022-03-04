package SuanFa.l930;

import java.util.LinkedList;
import java.util.List;

public class l930_2 {

    // 三指针
    public int numSubarraysWithSum(int[] A, int S) {
        int low = 0;
        int high = 0;
        int sum_low = 0;
        int sum_high = 0;
        int cnt = 0;
        int len = A.length;
        for (int i = 0;i < len;i++) {
            sum_low+=A[i];
            while (low < i && sum_low>S) {
                sum_low-=A[low++];
            }
            sum_high+=A[i];
            while (high < i && (sum_high>S || sum_high==S && A[high]==0)) {
                sum_high-=A[high++];
            }
            if (sum_low == S) {
                cnt += (high-low+1);
            }
        }
        return cnt;
    }
}
