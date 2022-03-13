package SuanFa.l1556;

public class l1556 {

    public String thousandSeparator(int n) {
        String s = "";
        int cnt = 0;
        while (n > 9) {
            s = n%10 + s;
            n /= 10;
            cnt++;
            if (cnt % 3 == 0) {
                s = '.' + s;
            }
        }
        s = n + s;
        return s;
    }
}
