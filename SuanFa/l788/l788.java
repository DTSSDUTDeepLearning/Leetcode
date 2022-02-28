package SuanFa.l788;

public class l788 {

    public int rotatedDigits(int n) {
        int cnt = 0;
        for (int i = 1;i <= n;i++) {
            if (ifGood(i, false)) {
                cnt++;
            }
        }
        return cnt;
    }

    public boolean ifGood(int n, boolean flag) {
        if (n == 0) {
            return flag;
        }
        int d = n % 10;
        if (d == 3 || d == 4 || d == 7) {
            return false;
        }
        else if (d == 0 || d == 1 || d == 8) {
            return ifGood(n / 10, flag);
        }
        else {
            return ifGood(n / 10, true);
        }
    }
}
