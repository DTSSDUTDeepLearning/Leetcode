package SuanFa.l1922;

public class l1922 {

    int MOD = 1000000007;

    public int countGoodNumbers(long n) {
        return (int)(myPow(5, (n+1)/2)  * myPow(4, n/2) % MOD);
    }

    public long myPow(long x, long n) {
        long logits = n;
        long result = 1;
        while (logits != 0) {
            if (logits % 2 != 0) {
                result = result * x % MOD;
            }
            x = x * x % MOD;
            logits /= 2;
        }
        return result;
    }

}
