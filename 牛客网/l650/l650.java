package NowCoder.l650;

import java.util.Arrays;
import java.util.Comparator;

public class l650 {

    public int[] sovle (int[] a, int n, int m) {
        if (n > m) {
            return sovle(a, m, n);
        }
        int len = a.length;
        Integer[] b = new Integer[len];
        for (int i = 0;i < len;i++) {
            b[i] = a[i];
        }
        Arrays.sort(b, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b-a;
            }
        });
        int index_n = -1;
        int index_m = -1;
        for (int i = 0;i < len;i++) {
            if (a[i] == b[n-1]) {
                index_n = i;
            }
            if (a[i] == b[m-1]) {
                index_m = i;
            }
        }
        int tmp = a[index_n];
        a[index_n] = a[index_m];
        a[index_m] = tmp;
        return a;
    }
}
