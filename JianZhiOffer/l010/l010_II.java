package JianZhiOffer.l010;

public class l010_II {

    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n <= 2) {
            return n;
        }
        int a = 3;
        int b = 5;
        for (int i = 3;i < n;i++) {
            int c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return a;
    }
}
