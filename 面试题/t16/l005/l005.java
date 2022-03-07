package MianShiTi.t16.l005;

public class l005 {

    public int trailingZeroes(int n) {
        int cnt = 0;
        while (n >= 5) {
            n /= 5;
            cnt += n;
        }
        return cnt;
    }
}
