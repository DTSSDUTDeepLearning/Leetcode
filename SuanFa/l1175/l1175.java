package SuanFa.l1175;

public class l1175 {

    public int numPrimeArrangements(int n) {
        int MOD = 1000000007;
        int cnt = 0;
        for (int i = 2;i <= n;i++) {
            if (isZhi(i)) {
                cnt++;
            }
        }
        long result = 1;
        for (int i = 2;i <= cnt;i++) {
            result = (result * i) % MOD;
        }
        for (int i = 2;i <= n-cnt;i++) {
            result = (result * i) % MOD;
        }
        return (int)result;
    }

    public boolean isZhi(int k) {
        for (int i = 2;i <= Math.sqrt(k);i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }
}
