package NowCoder.l144;

public class l144 {

    public long subsequence (int n, int[] array) {
        if (n == 1) {
            return array[0];
        }
        if (n == 2) {
            return Math.max(array[0], array[1]);
        }
        int a = array[0];
        int b = Math.max(array[0], array[1]);
        for (int i = 2;i < n;i++) {
            int c = Math.max(b, a+array[i]);
            a = b;
            b = c;
        }
        return b;
    }
}
