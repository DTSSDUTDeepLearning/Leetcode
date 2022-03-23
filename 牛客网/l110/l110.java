package NowCoder.l110;

public class l110 {

    public int[] solve (int n, int m, int[] a) {
        if (a.length <= 1 || m % n == 0) {
            return a;
        }
        m = m % n;
        int gcd = gcd(n, m);
        for (int i = 0;i < gcd;i++) {
            int ind1 = i;
            int ind2 = (i + m) % n;
            int tmp1 = a[ind1];
            int tmp2 = a[ind2];
            while (ind1 != ind2) {
                a[ind2] = tmp1;
                ind2 = (ind2 + m) % n;
                tmp1 = tmp2;
                tmp2 = a[ind2];
            }
            a[ind1] = tmp1;
        }
        return a;
    }

    public int gcd(int n, int m) {
        while (n % m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }
        return m;
    }
}
