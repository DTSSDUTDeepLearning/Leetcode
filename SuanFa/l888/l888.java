package SuanFa.l888;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class l888 {

    public int[] fairCandySwap(int[] A, int[] B) {
        int[] results = new int[2];
        int res = (Arrays.stream(B).sum()-Arrays.stream(A).sum())/2;
        Set<Integer> s = new HashSet<>();
        for (int a : A) {
            s.add(a);
        }
        for (int b : B) {
            int c = b-res;
            if (s.contains(c)) {
                results[0] = c;
                results[1] = b;
                return results;
            }
        }
        return results;
    }
}
