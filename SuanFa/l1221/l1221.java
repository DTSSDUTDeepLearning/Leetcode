package SuanFa.l1221;

public class l1221 {

    public int balancedStringSplit(String s) {
        int n = 0;
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                n--;
            }
            else {
                n++;
            }
            if (n == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
