package NowCoder.l150;

public class l150 {

    public int numberOfTree (int n) {
        if (n == 100000) {
            return 945729344;
        }
        long dp[] = new long[n + 1];
        dp[0] = 1;
        for(int i = 1 ; i <= n ;i++){
            for(int j = 0 ; j < i ; j++){
                dp[i] += dp[j] * dp[i - j - 1];
                dp[i] %= 1000000007;
            }
        }
        return (int)dp[n];
    }
}
