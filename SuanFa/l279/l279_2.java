package SuanFa.l279;

public class l279_2 {

    // 数学法：四平方和定理
//    执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
//    内存消耗：35.3 MB, 在所有 Java 提交中击败了98.96%的用户
    public int numSquares(int n) {
        if (issqr(n)) {
            return 1;
        }
        if (issi(n)) {
            return 4;
        }
        for (int i = 1;i * i < n;i++) {
            int j = n - i*i;
            if (issqr(j)) {
                return 2;
            }
        }
        return 3;
    }

    public boolean issqr(int n) {
        int a = (int)Math.floor(Math.sqrt(n));
        return a * a == n;
    }

    public boolean issi(int n) {
        while (n % 4 == 0) {
            n /= 4;
        }
        return n % 8 == 7;
    }
}
