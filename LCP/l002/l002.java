package LCP.l002;

public class l002 {

    public int[] fraction(int[] cont) {
        int len = cont.length;
        if (len == 1) {
            return new int[]{cont[0], 1};
        }
        if (len == 2) {
            return new int[]{cont[0]*cont[1]+1, cont[1]};
        }
        int n = cont[len-2]*cont[len-1]+1;
        int m = cont[len-1];
        for (int i = len-3;i >= 0;i--) {
            int tmp = n;
            n = cont[i]*n+m;
            m = tmp;
        }
        int r = ming(n, m);
        return new int[]{n / r, m / r};
    }

    public int ming(int n, int m) {
        while (m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }
        return n;
    }

}
