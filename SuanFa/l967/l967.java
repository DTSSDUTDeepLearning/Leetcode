package l967;

import java.util.HashSet;
import java.util.Set;

public class l967 {

    public int[] numsSameConsecDiff(int n, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1;i <= 9;i++) {
            set.add(i);
        }
        for (int i = 1;i <= n-1;i++) {
            Set<Integer> tmp = new HashSet<>();
            for (int num : set) {
                int d = num % 10;
                if (d - k >= 0) {
                    tmp.add(10*num + (d-k));
                }
                if (d + k <= 9) {
                    tmp.add(10*num + (d+k));
                }
            }
            set = tmp;
        }
        if (n == 0) {
            set.add(0);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }
}
