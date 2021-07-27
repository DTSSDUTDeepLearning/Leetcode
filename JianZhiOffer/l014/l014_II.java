package JianZhiOffer.l014;

public class l014_II {

    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int b = n % 3;
        int p = 1000000007;
        long rem = 1;
        long x = 3;
        for(int a = n/3-1;a > 0;a/=2) {
            if (a % 2 == 1) {
                rem = (rem * x) % p;
            }
            x = (x * x) % p;
        }
        if (b == 0) {
            return (int)(rem * 3 % p);
        }
        else if (b == 1) {
            return (int)(rem * 4 % p);
        }
        else {
            return (int)(rem * 6 % p);
        }
    }
}
