package SuanFa.l326;

public class l326 {

    // 只使用迭代的方法
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n > 1) {
            if (n % 3 != 0) {
                return false;
            }
            n/=3;
        }
        return true;
    }
}
