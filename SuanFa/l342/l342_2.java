package SuanFa.l342;

public class l342_2 {

    // 若x为2的幂且x%3==1，则x为4的幂
    public boolean isPowerOfFour(int n) {
        return (n > 0) && ((n & (n - 1)) == 0) && (n % 3 == 1);
    }
}
