package SuanFa.l728;

import java.util.LinkedList;
import java.util.List;

public class l728 {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new LinkedList<>();
        for (int i = left;i <= right;i++) {
            if (isSelfDivided(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static boolean isSelfDivided(int k) {
        int n = k;
        while (k > 0) {
            int m = k % 10;
            if (m == 0 || n % m != 0) {
                return false;
            }
            k /= 10;
        }
        return true;
    }
}
