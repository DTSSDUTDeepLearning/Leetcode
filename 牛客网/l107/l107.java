package NowCoder.l107;

public class l107 {

    public int solve (int[] a) {
        int i = a.length-1;
        if (a[i] > a[i-1]) {
            return i;
        }
        i--;
        while (i > 0) {
            if (a[i+1] < a[i] && a[i] > a[i-1]) {
                return i;
            }
            i--;
        }
        if (a[0] > a[1]) {
            return 0;
        }
        return -1;
    }
}
