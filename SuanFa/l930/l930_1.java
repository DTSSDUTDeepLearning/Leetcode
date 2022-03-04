package SuanFa.l930;

import java.util.LinkedList;
import java.util.List;

public class l930_1 {

    // 记录每个1出现的位置，并找规律，通过数学方法求解
    // 但是在第59个用例时超时了，不得其解
    public int numSubarraysWithSum(int[] A, int S) {
        List<Integer> index_l = new LinkedList<>();
        int len = A.length;
        for (int i = 0;i < len;i++) {
            if (A[i] == 1) {
                index_l.add(i);
            }
        }
        index_l.add(0, -1);
        index_l.add(len);
        int index_size = index_l.size();
        int cnt = 0;
        if (S == 0) {
            for (int i = 1;i < index_size;i++) {
                int k1 = index_l.get(i);
                int k0 = index_l.get(i-1);
                cnt += (k1-k0)*(k1-k0-1)/2;
            }
        }
        else {
            for (int i = 1;i < index_size-S;i++) {
                cnt += (index_l.get(i)-index_l.get(i-1))*(index_l.get(i+S)-index_l.get(i+S-1));
            }
        }
        return cnt;
    }
}
