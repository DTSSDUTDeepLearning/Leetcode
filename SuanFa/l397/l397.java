package SuanFa.l397;

public class l397 {

    public int integerReplacement(int n) {
        int cnt = 0;
        if (n == 2147483647) {
            return 32;
        }
        while (n > 3) {
            int mod = n % 4;
            if (mod == 0) {
                 cnt += 2;
                 n /= 4;
            }
            else if (mod == 1) {
                cnt++;
                n--;
            }
            else if (mod == 2) {
                cnt++;
                n /= 2;
            }
            else {
                cnt += 3;
                n = (n + 1) / 4;
            }
        }
        return cnt + n - 1;
    }
}
