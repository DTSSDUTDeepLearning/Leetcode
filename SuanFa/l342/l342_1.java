package SuanFa.l342;

public class l342_1 {

    // 数学方法，如果数字x为4的幂，则有x=4^a，则 a = log_4_x = 1/2*log_2_x也应为整数，
    // 所以只要检查 log_2_x是否为偶数就能判断x是否为4的幂
    public boolean isPowerOfFour(int n) {
        return (n > 0) && (Math.log(n) / Math.log(2) % 2 == 0);
    }
}
