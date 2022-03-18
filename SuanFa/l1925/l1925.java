package SuanFa.l1925;

public class l1925 {

    public int countTriples(int n) {
        int cnt = 0;
        for (int a = 1;a < n-1;a++) {
            for (int b = a+1;b < n;b++) {
                int c = (int)(Math.sqrt(a*a+b*b+1.0));
                if (c <= n && c*c == a*a + b*b) {
                    cnt++;
                }
            }
        }
        return cnt * 2;
    }
}
