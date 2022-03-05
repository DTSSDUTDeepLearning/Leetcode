package SuanFa.l997;

import java.util.HashSet;
import java.util.Set;

public class l997 {

    public int findJudge(int N, int[][] trust) {
        int[] trusted_num = new int[N];
        Set<Integer> trusting = new HashSet<>();
        for (int[] two : trust) {
            trusted_num[two[1]-1]+=1;
            trusting.add(two[0]);
        }
        if (trusting.size() != N-1) {
            return -1;
        }
        for (int i = 0;i < N;i++) {
            if (!trusting.contains(i+1)) {
                if (trusted_num[i] == N-1) {
                    return i+1;
                }
            }
        }
        return -1;
    }
}
