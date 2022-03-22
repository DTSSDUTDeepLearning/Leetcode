package NowCoder.l075;

public class l075 {

    public int[] FindNumsAppearOnce (int[] array) {
        int x = 0;
        for (int a : array) {
            x ^= a;
        }
        int d = 1;
        while ((d & x) == 0) {
            d <<= 1;
        }
        int m = 0;
        int n = 0;
        for (int a : array) {
            if ((d & a) == 0) {
                m ^= a;
            }
            else {
                n ^= a;
            }
        }
        int[] results = new int[2];
        results[0] = Math.min(m, n);
        results[1] = Math.max(m, n);
        return results;
    }
}
