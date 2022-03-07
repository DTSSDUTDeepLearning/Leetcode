package MianShiTi.t16.l006;

import java.util.Arrays;

public class l006 {

    public int smallestDifference(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int lena = a.length;
        int lenb = b.length;
        int i = 0;
        int j = 0;
        long min = Integer.MAX_VALUE;
        while (i < lena && j < lenb) {
            if (a[i] == b[j]) {
                return 0;
            }
            else if (a[i] < b[j]) {
                min = Math.min(min, (long)b[j]-a[i]);
                i++;
            }
            else {
                min = Math.min(min, (long)a[i]-b[j]);
                j++;
            }
        }
        return (int)min;
    }
}
