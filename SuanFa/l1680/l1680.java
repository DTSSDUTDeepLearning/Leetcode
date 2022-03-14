package SuanFa.l1680;

public class l1680 {

    public int concatenatedBinary(int n) {
        int MOD = 1000000007;
        long result = 0;
        int shift = 0;
        for (int i = 1;i <= n;i++) {
            if ((i & (i-1)) == 0) {
                shift++;
            }
            result = ((result << shift) + i) % MOD;
        }
        return (int)result;
    }
}
